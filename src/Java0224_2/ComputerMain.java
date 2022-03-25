package Java0224_2;

import Java0224_1.Animal;
import Java0224_1.AnimalInfo;
import Java0224_1.Cat;
import Java0224_1.Dog;

public class ComputerMain {

	public static void main(String[] args) {
		
		//com, dTop, note, mynote
		
		// Computer com = new Computer();
	//	DeskTop dTop = new DeskTop();
		// Notebook note = new Notebook();
	//	MyNotebook mynote = new MyNotebook();
		
		//추상클래스는 객체(instance)를 생성하지 못한다.
		// 추상클래스는 단순히 상속만을 하기 위해 만든 클래스이다.
		
		
		System.out.println("=====[1] 객체생성 =====");
		DeskTop dTop = new DeskTop();
		MyNotebook mynote = new MyNotebook();
		
	    dTop.display();
	    dTop.typing();
		
	    mynote.display();
	    mynote.typing();
	    
System.out.println("=====[2] 자동 타입 변환 =====");
		
		Computer com = null;
		com = dTop;
		com.display();
	    com.typing();
		
		com = mynote;
		com.display();
	    com.typing();
	    
	    System.out.println("=====[3] 다형성(유틸클래스) =====");
	    //유틸 객체 만들기
		ComputerUtil Util = new ComputerUtil();
		
		Util.ComputerMethod(dTop);
		Util.ComputerMethod(mynote);
	}

}
