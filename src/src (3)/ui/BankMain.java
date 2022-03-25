package ui;

import java.util.Scanner;

import dao.BankSQL;
import dto.Account;
import dto.Client;
import util.Util;

public class BankMain {

	public static void main(String[] args) {

		Client client = new Client();
		Account account = new Account();
		BankSQL sql = new BankSQL();
		Util util = new Util();

		Scanner sc = new Scanner(System.in);

		boolean run1 = true;
		boolean run2 = true;

		boolean check = false;
		boolean check1 = false;
		boolean check2 = false;

		int menu = 0;
		int menu1 = 0;

		String cId = null;
		String cPw = null;
		String cName = null;

		String accountNum = null;
		int balance = 0;
		int codeNum = 0;

		sql.connect();

		while (run1) {
			System.out.println("===========================");
			System.out.println("1.회원가입   2.로그인   3.종료");
			System.out.println("===========================");
			System.out.print("선택 >> ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("아이디 >> ");
				cId = sc.next();

				System.out.print("비밀번호 >> ");
				cPw = sc.next();

				System.out.print("이름 >> ");
				cName = sc.next();

				// FMember클래스의 member객체에 입력한 정보 setter로 저장하기
				client.setcId(cId);
				client.setcPw(cPw);
				client.setcName(cName);

				sql.join(client);
				break;

			case 2:
				run2 = true;
				System.out.print("아이디 >> ");
				cId = sc.next();

				System.out.print("비밀번호 >> ");
				cPw = sc.next();

				check = sql.login(cId, cPw);

				if (check) {
					while (run2) {
						System.out.println("===========================");
						System.out.println("1.생성   2.입금   3.출금");
						System.out.println("4.조회   5.송금   6.로그아웃");
						System.out.println("===========================");
						System.out.print("선택 >> ");
						menu1 = sc.nextInt();

						switch (menu1) {
						case 1:

							int cnt = sql.checkCount(cId);

							if (cnt < 3) {
								accountNum = util.accountNumber();

								System.out.println("생성할 계좌의 종류를 선택해주세요.");
								System.out.println("1.예금  2.적금  3.청약  4.주식");
								System.out.print("선택 >> ");
								codeNum = sc.nextInt();

								switch (codeNum) {
								case 1:
								case 2:
								case 3:
								case 4:
									account.setAccountNum(accountNum);
									account.setCodeNum(codeNum);
									account.setcId(cId);

									sql.openAccount(account);
									break;
								default:
									System.out.println("다시 입력해주세요!");
									break;
								}
							} else {
								System.out.println("계좌는 최대 3개까지만 만들 수 있습니다.");
							}

							break;
						case 2:
							System.out.print("계좌번호 >> ");
							accountNum = sc.next();

							// 계좌번호 존재 유무
							check1 = sql.checkAccount(accountNum);

							if (check1) {
								System.out.print("입금액 >> ");
								balance = sc.nextInt();

								sql.deposit(accountNum, balance);
							} else {
								System.out.println("계좌번호를 확인해주세요!");
							}

							break;
						case 3:
							// 출금 메소드 만들기!
							System.out.print("계좌번호 >> ");
							accountNum = sc.next();

							// 계좌번호 존재 유무
							check1 = sql.checkAccount(accountNum);

							if (check1) {
								System.out.print("출금액 >> ");
								balance = sc.nextInt();

								int cBalance = sql.checkBalance(accountNum);

								if (cBalance >= balance) {
									sql.withdraw(accountNum, balance);
								} else {
									System.out.println("잔액이 " + (balance - cBalance) + "원 부족합니다.");
								}

							} else {
								System.out.println("계좌번호를 확인해주세요!");
							}

							break;
						case 4:
							sql.myAccount(cId);
							break;
						case 5:
							System.out.print("보내시는 분 계좌번호 >> ");
							String sAccount = sc.next();
							
							check1 = sql.checkAccount(sAccount);
							
							if(check1) {
								System.out.print("받는 분 계좌번호 >> ");
								String rAccount = sc.next();
								
								check2 = sql.checkAccount(rAccount);
								
								if(check2) {
									System.out.print("송금액 >> ");
									balance = sc.nextInt();
									
									int sBalance = sql.checkBalance(sAccount);
									
									if(sBalance>=balance) {
//										sql.withdraw(sAccount, balance);
//										sql.deposit(rAccount, balance);
										sql.send(sAccount, rAccount, balance);
									} else {
										System.out.println("잔액이 " + (balance-sBalance) + "원 부족합니다.");
									}
								}
								
								
							} else {
								System.out.println("계좌번호를 확인해주세요!");
							}
							break;
						case 6:
							run2 = false;
							System.out.println("로그아웃 했습니다!");
							break;
						default:
							System.out.println("다시 입력해주세요!");
							break;
						}
					}
				} else {
					System.out.println("아이디와 비밀번호를 확인해주세요!");
				}

				break;

			case 3:
				run1 = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("다시 입력해주세요!");
				break;
			}
		}

		sql.conClose();

	}

}
