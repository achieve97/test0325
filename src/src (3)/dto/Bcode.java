package dto;

public class Bcode {
	private int codeNum;
	private String codeName;
	
	public int getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(int codeNum) {
		this.codeNum = codeNum;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	@Override
	public String toString() {
		return "Bcode [codeNum=" + codeNum + ", codeName=" + codeName + "]";
	}
	
	
}
