package action;

import java.util.Scanner;

import dto.Member;
import service.MemberRegistService;
import util.ConsoleUtil;

public class MemberRegistAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		// Action interface에 있는 추상메소드를 재정의
		
		ConsoleUtil util = new ConsoleUtil();
		Member member = util.getNewMember();
		
		MemberRegistService mrs = new MemberRegistService();
		boolean regist = mrs.registMember(member);
		// regist는 Serivce에서 중복이면 false, 중복이 아니면 true
		
		if(regist) {
			util.printRegistSuccess(member.getStuNum());
		} else {
			util.printRegistFail(member.getStuNum());
		}
	}

}
