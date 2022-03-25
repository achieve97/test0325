package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Account;
import dto.Client;
import util.DBC;

public class BankSQL {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1. DB연결 메소드
	public void connect() {
		con = DBC.DBConnect();
	}

	// 2. DB해제 메소드
	public void conClose() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void join(Client client) {
		String sql = "INSERT INTO CLIENT VALUES(?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, client.getcId());
			pstmt.setString(2, client.getcPw());
			pstmt.setString(3, client.getcName());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("회원가입 성공!");
			} else {
				System.out.println("회원가입 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean login(String cId, String cPw) {
		boolean check = false;

		String sql = "SELECT * FROM CLIENT WHERE CID=? AND CPW=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cId);
			pstmt.setString(2, cPw);

			rs = pstmt.executeQuery();

			check = rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}

	public void openAccount(Account account) {

		String sql = "INSERT INTO ACCOUNT VALUES(?, 0, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, account.getAccountNum());
			pstmt.setInt(2, account.getCodeNum());
			pstmt.setString(3, account.getcId());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("계좌생성 성공!");
			} else {
				System.out.println("계좌생성 실패!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int checkCount(String cId) {
		int cnt = 0;

		String sql = "SELECT COUNT(*) FROM ACCOUNT WHERE CID=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				cnt = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cnt;
	}

	public void myAccount(String cId) {
		String sql = "SELECT B.CODENAME, A.ACCOUNTNUM, A.BALANCE " + "FROM ACCOUNT A, BCODE B "
				+ "WHERE B.CODENUM = A.CODENUM AND A.CID = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cId);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String codeName = rs.getString(1);
				String accountNum = rs.getString(2);
				int balance = rs.getInt(3);

				System.out.println("[" + codeName + "통장] 계좌번호 : " + accountNum + "  잔액 : " + balance + "원");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean checkAccount(String accountNum) {
		boolean check1 = false;

		String sql = "SELECT * FROM ACCOUNT WHERE ACCOUNTNUM=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);

			rs = pstmt.executeQuery();

			check1 = rs.next(); // 정보가 있으면 true, 없으면 false값을 가져온다

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check1;
	}

	public void deposit(String accountNum, int balance) {
		String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE+? WHERE ACCOUNTNUM=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, balance);
			pstmt.setString(2, accountNum);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(balance + "원 입금됐습니다.");
			} else {
				System.out.println("입금을 실패했습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int checkBalance(String accountNum) {
		int balance = 0;	
		//
		
		String sql = "SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTNUM=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, accountNum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				balance = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return balance;
	}

	public void withdraw(String accountNum, int balance) {
		String sql = "UPDATE ACCOUNT SET BALANCE = BALANCE-? WHERE ACCOUNTNUM=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, balance);
			pstmt.setString(2, accountNum);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(balance + "원 출금됐습니다.");
			} else {
				System.out.println("출금을 실패했습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void send(String sAccount, String rAccount, int balance) {
		String sql1 = "UPDATE ACCOUNT SET BALANCE = BALANCE-? WHERE ACCOUNTNUM=?";
		String sql2 = "UPDATE ACCOUNT SET BALANCE = BALANCE+? WHERE ACCOUNTNUM=?";
		
		try {
			pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1, balance);
			pstmt.setString(2, sAccount);
			
			int result1 = pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(2, rAccount);
			
			int result2 = pstmt.executeUpdate();
			
			if(result1 > 0 && result2 > 0){
				System.out.println(balance + "원 송금했습니다.");
			} else {
				System.out.println("송금을 실패했습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
