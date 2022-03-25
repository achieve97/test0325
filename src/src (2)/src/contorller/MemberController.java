package contorller;

import java.util.Scanner;

import action.Action;

public class MemberController {

	
	public void processRequest(Scanner sc, Action action) {
		// 예외처리
		/*
		  	try {
		  	
		  		예외처리가 발생할 수 있는 코드	 : ex) 10/0
		  		
		  		
		  	} catch(예외클래스 변수) {
		  	
		  		예외처리가 발생 했을 경우 처리하는 코드 :
		  		어떤 오류가 발생했는지 or 그 문제를 해결할 수 있는 코드 작성
		  		ex) 0을 1로 바꾼다 => 10/1 (정상적으로 작동)
		  		
		  	}
		 */
		try {
			action.execute(sc);		// Action interface의 execute(sc)메소드를 실행했을 경우
		} catch(Exception e) {
			e.printStackTrace();	// printStackTrace()를 실행
									// 전체 에러발생 경로 및 메세지를 출력
									// 단계별로 오류가 발생한 위치를 추적
		}
	}
}
