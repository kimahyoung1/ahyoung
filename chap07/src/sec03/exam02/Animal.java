package sec03.exam02;


/*추상 클래스 = 추상메소드를 가질 수 있다. 
 * new가 될 수 없다*/

public abstract class Animal {   

	
	// 부모가 구현해놓은것
	String kind;
	void brearhe() {
		System.out.println("숨숴 숨숴");
	}
	
	// 추상 메소드
	// 내가 구현하지 않고 나를 상속받은 애들이 구현하도록 유도
	
	// 부모는 사운드 라는 츨만 빌려주는거지 자식이 구현을 다하고 부모.sound했을때 자식내용을 가져오는거
	abstract void sound();
	

}
