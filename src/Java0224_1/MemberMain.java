package Java0224_1;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가입할 회원 정보를 입력해주세요!");
		System.out.println("id >> ");
		String id = sc.next();
		System.out.println("password >> ");
		String password = sc.next();
		
		member1.setId(id);
		member1.setPassword(password);
		
		boolean result = member1.login(id, password);
		
		if(result) {
			System.out.println(member1.getId() + "님 로그인 성공");
			member1.logout(id);
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
