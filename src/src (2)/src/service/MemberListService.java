package service;

import dto.Member;
import ui.MemberUI;

public class MemberListService {
	
	public Member[] getMemberArray() {
		
		return MemberUI.memberArray;
		
	}

}
