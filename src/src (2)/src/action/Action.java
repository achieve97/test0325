package action;

import java.util.Scanner;

public interface Action {
	
	void execute(Scanner sc) throws Exception;
	// 예외처리 방법
	// 메소드명() throws Exception => 
	// 지금 여기서 말고, 메소드를 호출한 곳에서 예외처리를 실행

}
