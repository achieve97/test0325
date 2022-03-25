package Java0223_1;

public class MemberMain {

	public static void main(String[] args) {
		// [1] 기본생성자를 사용해서 member1 객체를 만든 후
		// member1의 정보를 저장(setter)하시오.
			Member member1 = new Member();
			member1.setId("yunseob"); 
			member1.setPass("1212");
			member1.setName("고윤섭");
			member1.setBirth("97. 03. 31");
			member1.setEMail("edhd3692");
			member1.setPhone("010-5683-9820");
			
			System.out.println(member1);
			
		// [2] 매개변수 생성자를 사용해서 member2객체를 만들어 보시오.
			Member member2 = new Member("yb","121","섭","96. 03. 31","edhdf3692","01056839823");
			
			System.out.println(member2);
		
			
			
			Member member3 = new Member();
			member3.setId("qqeqe"); 
			member3.setPass("11");
			member3.setName("mrr");
			member3.setBirth("98. 03. 31");
			member3.setEMail("edhd3693");
			member3.setPhone("010-5683-9821");
			
			Member member4 = new Member();
			member4.setId("ffb"); 
			member4.setPass("222");
			member4.setName("ass");
			member4.setBirth("99. 03. 31");
			member4.setEMail("edhd36882");
			member4.setPhone("010-5683-9720");
			
			// Member타입의 배열
			// String타입의 배열 : String arr[] = new String[4]
			Member members[] = new Member[4];
					
			members[0] = member1;
			members[1] = member2;
			members[2] = member3;
			members[3] = member4;
			
			// for문을 사용해서  4명의 id를 확인하시오
			
			for(int i=0; i<members.length; i++) {
				System.out.println("members[" + i + "].getId()=" + members[i].getId());
				
			}
			for(int i=0; i<members.length; i++) {
				System.out.println("members[" + i + "].getId()=" + members[i]);
				
			}
	}

}
