package Java0217;

public class ex06_arrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열과 
		// 중첩 for문 사용해서
		// 구구단 출력하기
		
//		for(int i= 2; i<=9; i++) {
//			
//			for(int j= 1; j<=9; j++) {
//				System.out.println(i + "x" + j + " = " + i*j);
				
				// 2 ~ 9단 : 8개(i)
				// x1 ~ x9 : 9개(j)
				
				
				int multi[][] = new int[8][9];
				
				for (int i = 2; i<multi.length+2; i++) {
					for (int j=1; j<multi[0].length+1; j++) {
						multi[i-2][j-1] = i * j;
						
						System.out.println("multi [" + i + "][" + j + "] = " + multi[i-2][j-1]);
					}
				}
			}
			
		}
	


