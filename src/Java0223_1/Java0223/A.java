package Java0223;

public class A {

		/*  
		 *  - 접근제한자(Access Modifier)
		 *  [1] public(모두 접근 가능)
		 *  	- 적용대상 : 클래스, 필드, 생성자, 메소드
		 *  	- 모든 클래스에서 접근 가능
		 *  
		 *  [2] protected(패키지)
		 *  	- 적용대상 : 필드, 생성자, 메소드
		 *  	- 자식클래스가 아닌 다른 패키지에 소속된 클래스 이면 접근 불가능
		 *  
		 *  [3] (default) (상속클래스)
		 *  	- 적용대상 : 클래스, 필드, 생성자, 메소드
		 *  	- 패키지가 다르면 접근 불가
		 *  
		 *  [4] private(본인클래스)
		 *  	- 적용대상 : 필드, 생성자, 메소드
		 *  	- 현재 클래스 외애 다른 클래스에서 접근 불가능
		 * 
		 * 
		 * 
		 * 
		 * */
	
		// 필드
		public    int public1;
		protected int protected1;
		          int default1;
		private   int private1;
		// 메소드
		public    void public2() {
			
		};
		protected void protected2() {
			
		};
		          void default2() {
		        	  
		          };
		private   void private2() {
			
		};
		
		public static void main(String[] args) {
			
			// A클래스 객체 a 생성
			A a = new A();
			
			a.public1 = 10;
			a.protected1 = 10;
			a.default1 = 10;
			a.private1 = 10;
			
			a.public2 ();
			a.protected2 ();
			a.default2 ();
			a.private2 ();
			
			// 선언한 필드와 메소드가 같은 클래스 내에서 실행됐기 때문에
			// 정상적으로 실행되는 것을 볼 수 있다. 
			
		}
}
