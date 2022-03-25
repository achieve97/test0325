/**
   Date : 2022.02.21
   Author : yunseob
   Description : AirCon클래스
   version : 1.0
 */
package Java0221;

public class ex02_AirCon {
		// (1) 필드 (특성, 상태, 속성) : 변수정의
		String company;        // 제조회사
		String color;          // 제품생상	
		int size;              // 제품크기
		int price;             // 제품가격
		int temp;              // 현재온도
		
		
		
		// 전원on
		public void onPower() {
			System.out.println("에어컨의 전원을 켭니다.");
			
		}
		
		// 전원off
		public void offPower() {
			System.out.println("에어컨의 전원을 끕니다.");
		}
		
		//온도↑
		public int upTemp() {
			return ++temp;
			
		}
		// 온도↓
		public int downTemp() {
			return --temp;
			
		}
		
		// 현재온도 확인
		public void checkTemp() {
			System.out.println("현재온도는" + temp +"도 입니다.");
		}

		@Override
		public String toString() {
			return "ex02_AirCon [company=" + company + ", color=" + color + ", size=" + size + ", price=" + price
					+ ", temp=" + temp + "]";
		}
		
		// toString() 메소드 : 오른쪽 마우스 → Source ( [Alt] + [Shift] + [S] ) → Generate toSting() 선택
		// → Field 모두 체크 → Generate 클릭
		
}
