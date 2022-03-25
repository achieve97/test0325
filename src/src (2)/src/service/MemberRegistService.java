package service;

import dto.Member;
import ui.MemberUI;

public class MemberRegistService {
	
	public boolean registMember(Member member) throws Exception {
		boolean regist = true;	// 회원가입 여부를 확인하기 위한 변수 regist를 true로 선언
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			// MemberUI.memberArray.length : 가입한 인원이 없을 경우 0부터 시작
		
			if(MemberUI.memberArray[i].getStuNum() == member.getStuNum()) {
				// 학생번호의 중복을 막기 위해서 실행
				// 가입 된 회원의 학생번호와 가입할 회원의 학생번호가 같을 경우
				
				regist = false;	// 중복된 학생 번호가 있을 경우 가입을 할 수 없다.
				break;	// 중복에 걸리면 더 이상 for문을 돌릴 필요가 없으므로 break 한다.
			}
		}
		
		// 중복에 해당하지 않으면 regist = true;
		// 중복에 해당하면 regist = false;
		
		if(regist) {
			// temp : 비어있는 공간 // tempArray : 비어있는 배열
			
			Member tempArray[] = MemberUI.memberArray;
			// 비어있는 배열 tempArray에 기존 가입된 회원 배열을 대입한다.
			
			MemberUI.memberArray = new Member[MemberUI.memberArray.length + 1];
			// public static Member memberArray[] = new Member[3];
			// MemberUI.memberArray = new Member[4];
			
			for(int i=0; i<tempArray.length; i++) {
				MemberUI.memberArray[i] = tempArray[i];
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1] = member;
			
		}
		
		return regist;
		
	}
	
}
