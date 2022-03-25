package action;

import java.util.Scanner;

import dto.Member;
import service.MemberListService;
import util.ConsoleUtil;

public class MemberListAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil util = new ConsoleUtil();
		MemberListService mls = new MemberListService();
		
		Member memberArr[] = mls.getMemberArray();
		util.printMemberList(memberArr);
	}

}
