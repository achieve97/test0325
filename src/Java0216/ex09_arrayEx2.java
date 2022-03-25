package Java0216;

import java.util.Scanner;

public class ex09_arrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동전의 갯수를 구하는 문제
		// 어떤 금액을 입력하게되면 각 동전이 몇개씩 필요한지 출력하는 문제
		
		// ex) 2680원 
		// 500원 : 5개
		// 100원 : 1개
		// 50원 : 1개
		// 10원 : 3개
		// 2680 - (500x5) = 180
		// 180 - (100x1) = 100
		// 80 - (50x1) = 30
		// 30 - (10x3) = 0
		
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("금액을 입력하세요");
		 
		 int money = sc.nextInt();
		 int coin[] = {500,100,50,10};
		 
		for(int i = 0; i < coin.length; i++ ) {
			int coinCnt = money / coin[i];
			//(0) 코인 갯수 = 2680 / 500 > 5개
			
			money = money - coin[i] * coinCnt;
			// money = 2680 - 500 * 5 > 180
			System.out.println(coin[i] + "원 동전은 " + coinCnt + "개!");
			System.out.println("남은 금액은 " + money + "원!\n");

		
	}

	}}
