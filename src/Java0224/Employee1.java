package Java0224;

public class Employee1 {
	// 필드
	String name = "고윤섭";	//직원이름
	String dept = "교육팀";	//부서이름
	int salary = 100;	//급여
	
	//직원정보 메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary;
		
		
	}
}
