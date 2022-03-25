package Java0224;

public class IciaMain {

	public static void main(String[] args) {
		// person, student, teacher, worker 객체 생성
		
		IciaPerson person = new IciaPerson();
		IciaStudent student = new IciaStudent();
		IciaTeacher teacher = new IciaTeacher();
		IciaWorker worker = new IciaWorker();
		
		
		person.finish();
		student.finish();
		teacher.finish();
		worker.finish();
		
		//info객체 생성
		IciaInfo info = new IciaInfo();
		
		info.finishType(person);
		info.finishType(student);
		info.finishType(teacher);
		info.finishType(worker);

	}

}
