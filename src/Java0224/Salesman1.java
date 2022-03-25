package Java0224;

public class Salesman1 extends Employee1 {

	// 필드
		String name;	//직원이름
		String dept;	//부서이름
		int salary = 300;	// 급여
		int commission;		// 수당
		
		
		//직원정보 메소드
		String getEmployeeInfo() {
			return super.getEmployeeInfo()
					+ ", 수당 : " + commission;
			
}
		// super.getEmployeeInfo()는 Employee1 클래스에서
		// getEmployeeInfo()를 가져온 것!
		
		// super => 상속받은 곳(Employee1) 에서 가져왔다고 생각

		String getSalesman1Info() {
			return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary + ", 수당 : " + commission ;
		}
		void checkSuper() {
			System.out.println("super.salary : " + super.salary);
			System.out.println("salary : " + salary);
		}
}