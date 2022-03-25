package java0224;

public class Salesman1 extends Employee1 {

	// 직원정보 필드
	int salary = 300; 	// 급여
	int commission;		// 수당

	// 직원정보 메소드
	String getEmployeeInfo() {
		return super.getEmployeeInfo()
				+ ", 수당 : " + commission;
	}
	// super.getEmployeeInfo()는 Employee1클래스에서
	// getEmployeeInfo()를 가져온 것!
	
	// super => 상속받은곳(Employee1)에서 가져왔다고 생각!
	
	
	String getSalesman1Info() {
		return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary 
				+ ", 수당 : " + commission;
	}
	
	void checkSuper() {
		System.out.println("super.salary : " + super.salary);
		System.out.println("salary : " + salary);
	}
	
}
