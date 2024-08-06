package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog( );
		dog.sound( );
		dog.brearhe( );
		
		// 내용이 오버라이드 한것이 실행됨
		// 부모가 자식에게 떠 넘길수 있다.
		Animal a = dog;
		a.sound( );
		
//		Animal a2 = new Animal( ); // new 자체가 안된다.
	}

}
