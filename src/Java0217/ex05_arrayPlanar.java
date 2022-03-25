/**
   Date : 2022.02.17
   Author : yunseob
   Description : 2차원 배열
 */
package Java0217;

import java.util.Scanner;

public class ex05_arrayPlanar {

	public static void main(String[] args) {
		// 2차원 배열 : 행렬
		// 타입[][] 배열명 = new 타입[i][j];
		int arr[][] = new int [2][4];
		
		//2차원 배열의 크기
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[1][0] = 5;
//		arr[1][1] = 6;
//		arr[1][2] = 7;
//		arr[1][3] = 8;
//		
//		
//		for(int i = 0 ; i< arr.length; i++) {
//			
//			for(int j = 0; j<arr[0].length; j++) {
//				
//				System.out.println("arr[" + i + "][" + j + "]");
//			}
//		}
//		
		
		String words[][] = {
				{"chair", "의자"},
				{"desk",  "책상"},
				{"coffee","커피"},
				{"pen",   "볼펜"},
				{"computer","컴퓨터"}
		};
		
//		System.out.println("word.length");
//		System.out.println(words[0].length);
		
		//words배열의 크기를 확인!
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println("문제" + (i+1)+". " + words[i][0] + "의 뜻은 무엇인가요?");
			String answer = sc.next();
			
			if(answer.equals(words[i][1])) {
				System.out.println("정답입니다!");
				cnt++;
			} else {
				System.out.println("오답입니다!");
				System.out.println("정답은 " + words[i][1] + " 입니다.");
			}
			
			// 출력하기 위한 j
			for(int j=0;j<words[i].length;j++) {
				// System.out.println("words["+i+"]["+j+"]=" + words[i][j]);
				
			}
			
		} // 외부for문 end
		
		System.out.println(cnt + "개 맞췄습니다!");

	}

}
