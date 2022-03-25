package java0224;

public class Employee1 {
	
	// 직원정보 필드
	String name;	//직원이름
	String dept;	//부서이름
	int salary = 200;		//급여
	
	// 직원정보 메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary;
	}
	
}
