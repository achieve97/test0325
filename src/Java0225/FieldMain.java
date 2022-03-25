package Java0225;

public class FieldMain {

	public static void main(String[] args) {
		// Field객체 생성
		Field fd =new Field();
		
		// 객체의 size, price 출력하기
		
		System.out.println("size : " + fd.size);
//		System.out.println("price : " + fd.price);
		
		//static 변수는 객체생성 없이 바로 사용가능
		System.out.println("Field.price" + Field.price);
		
		//import static java0225.Field. *; 를 추가할 경우 Field.price가
		// 아니라 그냥 price로 사용할 수 있다.
//		
//		Field number = new Field(15);    // int iNum에 대입
//		
//		number.showInfo();
//		// 이유 : 정부타입을 가져왔으나 어디로 보내야 할지 모르기 때문에
//		// 데이터타입중 가장 큰 int 타입으로 보냈다.
//		
//		// Q. 만약 byte로 출력을 원한다면?
//		Field num - new Field((byte)3);
//		num.showInfo();

	}

}
