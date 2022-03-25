package Java0223_1;

public class Member {
	// 1. String 타입의 아이디, 비밀번호, 이름, 생년월일, 이메일, 휴대전화를
	// 필드로 선언한다.
		
		private String id;
		private String pass;
		private String name;
		private String birth;
		private String email;
		private String phone;
	
	// 2. 기본 생성자와 매개변수 생성자를 선언한다.
		
		
	public Member(){
		
	}
	public Member(String id, String pass, String name, String birth, String email,String phone){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
	}
	// 3. getter, setter, toString 메소드를 생성한다.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEMail() {
		return email;
	}

	public void setEMail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pass=" + pass + ", name=" + name + ", birth=" + birth + ", email=" + email
				+ ", phone=" + phone + ", getId()=" + getId() + ", getPass()=" + getPass() + ", getName()=" + getName()
				+ ", getBirth()=" + getBirth() + ", getEMail()=" + getEMail() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
