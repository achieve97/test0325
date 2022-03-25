package Java0223_1;

public class myDate {
	// 우리가 입력한 년, 월, 일을 통해
	// 해당 날짜가 존재하는지 유무 확인
	// ex) 2022. 2. 23 존재
	// ex) 2022. 12. 32 존재 x
	
	//[1] 필드
	private int day;
	private int month;
	private int year;
	private boolean isValid = true; // 존재의 유무 나타냄
	
	
	//[2] 생성자
	
	public myDate() {
		super();
	}
	
	
	public myDate(int day, int month, int year, boolean isValid) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid;
	}


	// [3]메소드
	
	public int getDay() {
		System.out.println("getDay : " + day);
		System.out.println("getDay isValid : " + isValid );
		return day;
	}


	public void setDay(int day) {
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		   if(day>0 && day<=31) {
			   this.day = day;

		   } else {
			   isValid = false;
		   }
		   break;
		  
		case 4:
		case 6:
		case 9:
		case 11:
			if(day>0 && day<=30) {
				this.day = day;
			} else {
			isValid = false;}
			break;
			
			case 2:  
				if((year%4==0&&year%100!=0)||year%400==0) {
					if(day>0 && day <=29 ) {
						this.day = day;
					}else {
					isValid = false;
				}
				}		
			 else {
				if(day>0 && day <=28) {
					this.day = day;
					
				}else {
					isValid = false;
				}
				break;
			 }
				default : 
					isValid = false;
				break;
			}
				// 윤년 ==> 
				// 윤년은 4년마다 1번씩
				// 100년일때 제외
				// 400년마다 한번식 허용
				
			}

	public int getMonth() {
		System.out.println("getMonth : " + month);
		System.out.println("getMonth isValid : " + isValid);
		return month;
		
		
	}


	public void setMonth(int month) {
		if(month>0 && month <= 12) {
		this.month = month;
	} else {
		isValid = false;
	}

	}
	public int getYear() {
		System.out.println("getYear : " + year);
		System.out.println("getYear isValid : " + isValid);
		return year;
	}


	public void setYear(int year) {
		if(year > 0) {
		this.year = year;
		// isValid = true;
	}else {
		isValid = false;
	}
	}

	public boolean isValid() {
		return isValid;
	}


	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


	@Override
	public String toString() {
		return "myDate [day=" + day + ", month=" + month + ", year=" + year + ", isValid=" + isValid + "]";
	}
	

	
	


	
	
}
