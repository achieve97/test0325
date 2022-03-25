package util;

import java.util.Scanner;

import dto.Member;
import dto.SearchData;

public class ConsoleUtil {
	Scanner sc = new Scanner(System.in);

	// 1. 회원가입
	public Member getNewMember() {

		Member member = new Member(); // Member타입의 객체 member생성!

		System.out.println("============== 회원정보 등록 ==============");
		System.out.print("회원번호 >> ");
		int stuNum = sc.nextInt();

		System.out.print("회원이름 >> ");
		String fName = sc.next();

		System.out.print("회원나이 >> ");
		int age = sc.nextInt();

		System.out.print("회원연락처 >> ");
		String phone = sc.next();

		sc.nextLine();	// 연락처 입력 후 공백을 처리하기 위해서!
		System.out.print("회원주소 >> ");
		String addr = sc.nextLine();	// sc.nextLine() : 한문장 입력
										// sc.next() : 공백전까지 입력
		System.out.print("회원이메일 >> ");
		String fEmail = sc.next();

		System.out.print("회원취미 >> ");
		String hobby = sc.next();

		// 저장은 member객체에 저장하기!
		member.setStuNum(stuNum);
		member.setfName(fName);
		member.setAge(age);
		member.setPhone(phone);
		member.setAddr(addr);
		member.setfEmail(fEmail);
		member.setHobby(hobby);

		return member;

	}

	// 회원가입 성공 / 실패여부 확인
	public void printRegistSuccess(int stuNum) {
		System.out.println(stuNum + "번 학생 등록 성공!");
	}

	public void printRegistFail(int stuNum) {
		System.out.println(stuNum + "번 학생 등록 실패!");
	}

	// 2. 회원목록
	public void printMemberList(Member memberArr[]) {

		// 만약에 가입된 회원정보가 없을 경우
		if (memberArr.length == 0) {
			System.out.println("가입한 회원정보가 없습니다.");
		} else {
			for (int i = 0; i < memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}

	}

	// 3. 회원수정
	public Member updateMember(Member oldMember) {
		// 오버로딩 : 같은 메소드 이름 + 다른 매개변수
		Member member = new Member(); // Member타입의 객체 member생성!

		System.out.println("============== 회원정보 수정 ==============");
		System.out.println("회원번호 : " + oldMember.getStuNum());

		System.out.println("수정전 이름 : " + oldMember.getfName());
		System.out.print("회원이름 >> ");
		String fName = sc.next();

		System.out.println("수정전 나이 : " + oldMember.getAge());
		System.out.print("회원나이 >> ");
		int age = sc.nextInt();

		System.out.println("수정전 연락처 : " + oldMember.getPhone());
		System.out.print("회원연락처 >> ");
		String phone = sc.next();

		System.out.println("수정전 주소 : " + oldMember.getAddr());
		System.out.print("회원주소 >> ");
		String addr = sc.next();

		System.out.println("수정전 이메일 : " + oldMember.getfEmail());
		System.out.print("회원이메일 >> ");
		String fEmail = sc.next();

		System.out.println("수정전 취미 : " + oldMember.getHobby());
		System.out.print("회원취미 >> ");
		String hobby = sc.next();

		// 저장은 member객체에 저장하기!
		member.setStuNum(oldMember.getStuNum());
		member.setfName(fName);
		member.setAge(age);
		member.setPhone(phone);
		member.setAddr(addr);
		member.setfEmail(fEmail);
		member.setHobby(hobby);

		return member;
	}

	// 회원수정 성공 / 실패여부 확인
	public void printUpdateSuccess(int stuNum) {
		System.out.println(stuNum + "번 학생 수정 성공!");
	}

	public void printUpdateFail(int stuNum) {
		System.out.println(stuNum + "번 학생 수정 실패!");
	}

	// 4. 회원삭제
	// 회원삭제 성공 / 실패여부 확인
	public void printDeleteSuccess(int stuNum) {
		System.out.println(stuNum + "번 학생 삭제 성공!");
	}

	public void printDeleteFail(int stuNum) {
		System.out.println(stuNum + "번 학생 삭제 실패!");
	}

	// 5. 회원검색
	public SearchData getSearchData() {
		System.out.println("검색 조건을 선택하세요( 번호 or 이름 )");
		System.out.print("검색 조건 >> ");
		String searchCondition = sc.next();
		String searchValue = null;
		
		if(searchCondition.equals("번호")) {
			System.out.print("검색할 번호 >> ");
			searchValue = sc.next();
		} else if(searchCondition.equals("이름")) {
			System.out.print("검색할 이름 >> ");
			searchValue = sc.next();
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
		SearchData search = new SearchData();
		search.setSearchCondition(searchCondition);
		search.setSearchValue(searchValue);
		
		return search;
		
	}
	
	// 검색을 번호로 했을 경우 (중복x)
	public void printSearchMember(Member member) {	
		// Member member 한명을 검색
		if(member == null) {	// 검색한 결과가 없을 경우 if
			System.out.println("검색한 결과가 없습니다.");
		} else {				// 검색한 결과가 존재 할 경우 else
			System.out.println(member.getStuNum()+"번으로 검색한 결과!");
			System.out.println(member);
		}
	}
	
	// 검색을 이름으로 했을 경우 (중복o)
	public void printSearchMember(Member memberArr[]) {
		// Member memberArr[] : 한명이 아니라 전체 인원에 대해서 검색
		if(memberArr == null) {	// 검색한 결과가 없을 경우 if
			System.out.println("검색한 결과가 없습니다.");
		} else {				// 검색한 결과가 한명 이상 존재 할 경우 else
			System.out.println("이름으로 검색한 결과!");
			for(int i=0; i<memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}
	}
	
}













