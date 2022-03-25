/**
   Date : 2022.02.25
   Author : inchoriya
   Description : static필드
   version : 1.0
 */
package Java0225.java0225;

public class Field1 {
	
	/*
	 * 
	 	[1] 맴버 변수
	 		: 객체가 생성될 때 각 객체별로 초기화
	 		: 선언시 초기화 하지 않으면 초기값으로 설정
	 	
	 	[2] static(정적) 변수 - 고정
	 		: 객체를 생성하지 않아도 참조 가능
	 	
	 	[3] local 변수
	 		: 클래스 영역이 아닌 부분에서 성너되는 변수
	 		: 메소드나 초기화 블록에 선언되는 변수
	 
	 */
	
	int size=18;	// 18
	
	byte	bNum;
	short	sNum;
	int		iNum;
	
	
	int localMethod() {
		int local = 20;
		return local;
	}
	
	static int price = 200;
	
	// 생성자
	Field1(byte bNum){
		this.bNum = bNum;
	}
	
	Field1(short sNum){
		this.sNum = sNum;
	}
	
	Field1(int iNum){
		this.iNum = iNum;
	}
	
	// 메소드
	void showInfo() {
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
	}
	
	

}
