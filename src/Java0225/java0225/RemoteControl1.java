/**
   Date : 2022.02.25
   Author : inchoriya
   Description : interface를 활요한 리모콘
   version : 1.0
 */
package java0225;

public interface RemoteControl1 {

	/*
	  - 인터페이스(interface)
	  1. 누구나 접근이 가능하도록 public 설정
	  2. 객체의 다형성 구현하는데 용이
	  3. 인터페이스 구성요소
	  	(1) 상수필드 : 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음
	  	(2) 추상메소드 : 
	  	(3) 디폴트메소드
	  		: 기본으로 실행 내용까지 가지고 있는 메소드
	  		: 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위함.
	  	(4) 정적(static) 메소드
	  		: 인터페이스를 개체화 하지 않고도 직접 호출 가능
	  4. 부모클래스 변수 = new 자식클래스();
	     인터페이스 변수 = new 구현클래스();
	  	
	 */
	
	// (1) 상수필드
	int MAX_VOLUME = 10;	// static final을 사용하지 않아도
	int MIN_VOLUME = 0;		// 자동으로 적용된다.
	
	// (2)추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//(3) default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV 음소거 합니다.");
		} else {
			System.out.println("TV 음소거 해제합니다..");
		}
	}
	
	// (4) static 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체해주세요!");
	}
}











