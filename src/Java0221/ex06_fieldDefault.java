package Java0221;

import java.util.Arrays;

public class ex06_fieldDefault {

	// 필드 선언
	// 각각 데이터타입의 초기값 확인하기
	
	// 기본데이터 타입 4가지(정수형, 실수형, 문자형, 논리형)
	
	// (1) 정수형(4개) : byte, short, int, long
	byte byteField;
	short shortField;
	int intField;
	long longField;
	
	// (2) 실수형(2개) : float, double
	
	float floatField;
	double doubleField;
	
	// (3) 문자형 char
	char charField;
	
	// (4) 논리형 boolean
	boolean boolField;
	
	//참조형 테이터 타입 : 기본형 데이터 타입 외에 모든 데이터 타입
	String strField;         // 문장형
	String arrField[];       // 배열
	@Override
	public String toString() {
		return "ex06_fieldDefault [byteField=" + byteField + ", shortField=" + shortField + ", intField=" + intField
				+ ", longField=" + longField + ", floatField=" + floatField + ", doubleField=" + doubleField
				+ ", charField=" + charField + ", boolField=" + boolField + ", strField=" + strField + ", arrField="
				+ Arrays.toString(arrField) + "]";
	}
	
	
	
}
