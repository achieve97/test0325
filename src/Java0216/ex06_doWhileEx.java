/**
   Date : 2022.02.16
   Author : yunseob
   Description : doWhileEx
   version : 1.0
 */
package Java0216;

import java.util.Scanner;

public class ex06_doWhileEx {

	public static void main(String[] args) {
		// UP & Down Game!
		//(1) 3번안에 정답을 맞추면 통과!
		//(2) 그 이후에 맞춘 사람이 벌칙!
		
		int answer = (int)(Math.random()*45)+1; // 정답숫자, 1부터 45사이의 랜덤한 수
		int input = 0;      //우리가 말하는 숫자
		int count = 0;      // 정답을 말한 횟수
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("UP & Down Game 시작!");
		
		do {
			System.out.println("1부터 45사이의 숫자를 입력해주세요!");
			input = sc.nextInt();
			
			count++;
			
			if(answer > input) {
				System.out.println("UP ! 더 큰수를 말하세요!");
			} else if(answer < input) {
				System.out.println("Down! 더 작은 수를 말하세요!");
				
			}else {
				System.out.println("정답은  : " + answer + "입니다.");
				System.out.println("시도한 횟수는 " + count + "번 입니다.");
				run = false;
			}
			
		} while(run);
		if(count <= 3) {
			System.out.println("통과했습니다!");
		} else {
			System.out.println("벌칙당첨!");
		}
		
	}

}
