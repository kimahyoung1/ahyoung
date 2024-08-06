package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		// 도그에는 사운드도 있고 워크도 있어
		// 캣에는 사운도도 있고 푸쉬가 있어
		Dog dog = new Dog();
		Cat cat = new Cat();

		// 같은 부모를 가지고있어요
		Animal aDog = (Animal)new Dog();
		Animal aCat = new Cat();

		// 같은 타입이라서 가능하다 .
//		aDog = aCat;
//		a1= a2;
		
		
		aDog.sound( );
//		aCat.waik( );
		aCat.sound( );
	}

}
