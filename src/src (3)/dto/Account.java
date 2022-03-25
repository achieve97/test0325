package dto;

public class Account {
	/*
		ACCOUNTNUM  NVARCHAR2(20) PRIMARY KEY,
    	BALANCE     NUMBER,
		CODENUM     NUMBER REFERENCES BCODE(CODENUM),
    	CID         NVARCHAR2(10) REFERENCES CLIENT(CID)
	 */
	
	private String accountNum;
	private int balance;
	private int codeNum;
	private String cId;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(int codeNum) {
		this.codeNum = codeNum;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	
	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", balance=" + balance + ", codeNum=" + codeNum + ", cId=" + cId
				+ "]";
	}
	
	
}
