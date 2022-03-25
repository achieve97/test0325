package dto;

// dto(Data Transfer Object) : 데이터 전송 객체
// - 패키지(계층)간 데이터 교환을 위한 객체

// bean, vo(Value Object)로 사용하기도 한다.
public class Member {
	
	// 1. 필드
	// (1) private선언
	// 	- 학생번호, 이름, 나이, 전화번호, 주소, 이메일, 취미
	
	// 전화번호 int타입으로 선언 시 
	// 010 => String : 010 / int : 10
	
	private int stuNum;		// 학생번호
	private String fName;
	private int age;
	private String phone;
	private String addr;
	private String fEmail;
	private String hobby;
	
	
	
	// 2. 생성자 : 기본생성자만 사용시 생략 가능!
	
	// 3. 메소드
	// setter, getter, toString

	public int getStuNum() {	
		return stuNum;
	}							
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getfEmail() {
		return fEmail;
	}
	public void setfEmail(String fEmail) {
		this.fEmail = fEmail;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return fName + "님 회원정보 [학생번호 : " + stuNum + ", 나이 : " + age + ", 연락처 : " + phone + ", 주소 : " + addr
				+ ", 이메일 : " + fEmail + ", 취미 : " + hobby + "]";
	}
	
	
}














