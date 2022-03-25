package Java0224;

public class Employee2 {

	// 필드
		String name = "고윤섭";	//직원이름
		String dept = "교육팀";	//부서이름
		int salary = 200;	//급여
		
		//직원정보 메소드
		String getEmployeeInfo() {
			return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary;
			

		}

		public Employee2() {
			
		}

		public Employee2(String name, String dept, int salary) {
			
			this.name = name;
			this.dept = dept;
			this.salary = salary;
		}
}
