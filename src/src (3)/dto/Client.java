package dto;

public class Client {
	private String cId;
	private String cPw;
	private String cName;
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcPw() {
		return cPw;
	}
	public void setcPw(String cPw) {
		this.cPw = cPw;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	@Override
	public String toString() {
		return "Client [cId=" + cId + ", cPw=" + cPw + ", cName=" + cName + "]";
	}
	
	
	
	
}
