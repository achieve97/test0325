package util;

public class Util {
	
	public String accountNumber() {
		String accountNum = null;
		
		accountNum = "110-";

		for(int i=1; i<=3; i++) {
			accountNum += (int)(Math.random() * 9) + 1;
		}
		
		accountNum += "-";
		
		for(int i=1; i<=6; i++) {
			accountNum += (int)(Math.random() * 9) + 1;
		}
		System.out.println("새로 생성된 계좌번호 : " + accountNum);
		return accountNum;
	}
	
}
