package Java0222.java0222;

public class ex04_Calculator1 {
	// (1)필드
	

	// (2)생성자
	ex04_Calculator1() {
		// main클래스에서 new ex04_Calculator()은
		// 기본생성자를 생략했을 경우 class 이름으로 이동하지만
		// 사실 기본생성자를 의미한다.
	}

	// (3)메소드

	double avg(int x, int y) {
		// 평균 구하기 => 값을 다 더한 후 , 갯수만큼 나눠주는 방법
		double sum = add(x, y);
		double result = sum / 2;
		return result;
	}
	

	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	
	
	
	
	
	
	void excute(int x, int y) {
		System.out.println("덧셈 실행결과 : " + add(x,y));
		System.out.println("평균 실행결과 : " + avg(x,y));
	}
	
	// (1) return의 개념을 잘 모르겠다.
	// (2) void는 언제 쓰는지 모르겠다.
	// 메소드의 내용을 실행만 시킬 때 : void 사용! void타입의 메소드는 어디에도 대입을 하지 않는다!
	
	/*
	  [메소드 선언 방법]
	  
	  (접근제한자) 데이터타입 메소드명(매개변수){
			메소드 실행내용;
			return 값;
	  }
	   
	 */
	
	// 대입연산자 
	// 왼쪽 : 무조건 변수
	// 오른쪽 : 상수 , 변수, 식, 메소드
	int num = add(1,2);
	 


}
