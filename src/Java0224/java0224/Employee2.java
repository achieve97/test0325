package java0224;

public class Employee2 {

	// 직원정보 필드
	String name; // 직원이름
	String dept; // 부서이름
	int salary = 200; // 급여

	// Employee1에서 생성자만 추가
	// 기본생성자
	public Employee2() {

	}

	// 매개변수 생성자
	public Employee2(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	// 직원정보 메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary;
	}
}
