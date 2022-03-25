package Java0221;

public class ex07_fieldDefaultMain {

	public static void main(String[] args) {
		
		ex06_fieldDefault dField = new ex06_fieldDefault();
		
		System.out.println(dField);
		
		System.out.println("정수형 초기값 확인 == ");
		System.out.println("byteField : " + dField.byteField);
		System.out.println("shortField : " + dField.shortField);
		System.out.println("intField : " + dField.intField);
		System.out.println("longField : " + dField.longField);
		System.out.println("실수형 초기값 확인 == ");
		System.out.println("floatfield : " + dField.floatField);
		System.out.println("doubleField : " + dField.doubleField);
		System.out.println("문자형 초기값 확인 == ");
		System.out.println("charField : " + dField.charField);
		System.out.println("논리형 초기값 확인 == ");
		System.out.println("boolField : " + dField.boolField);
		System.out.println("참조형 초기값 확인 == ");
		System.out.println("strField : " + dField.strField);
		System.out.println("arrField : " + dField.arrField);

	}

}
