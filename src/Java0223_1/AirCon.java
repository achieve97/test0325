package Java0223_1;

public class AirCon {
	// [1] private 필드를 선언
	
	private String company;        // 제조회사
	private String color;          // 제품생상	
	private int size;              // 제품크기
	private int price;             // 제품가격
	private int temp;  
	// [2] 기본생성자 : [Alt] + [Shift] + [s] => Generate Constructor using Fields
	// 체크 모두 해제(Deselect All) 후 Generate
	AirCon(){
		
	}
	// [3] getter, setter : company, color, price, size, temp
	// [Alt] + [Shift] + [s] => Generate Getter and Setter
	// 체크 모두 선택(Select All) 후 Generate

	
	// [4] toString()메소드
	// [Alt] + [Shift] + [s] => Generate Getter and Setter
	// 필드(Field)만 체크 후 Generate
	@Override
	public String toString() {
		return "AirCon [company=" + getCompany() + ", color=" + getColor() + ", size=" + getSize() + ", price=" + getPrice() + ", temp="
				+ getTemp() + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
}
