package Java0224_1;

public class AnimalMain {

	public static void main(String[] args) {
		// [1] 객체 생성
		System.out.println("=====[1] 객체생성 =====");
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.breath();
		dog.sound();
		
		cat.breath();
		cat.sound();
		
		System.out.println("=====[2] 자동 타입 변환 =====");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();

		System.out.println("=====[3] 다형성(유틸클래스) =====");
		AnimalInfo info = new AnimalInfo();
		info.animalSound(cat);
		info.animalSound(new Dog());
	}

}
