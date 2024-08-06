 package sec01.exam01;

public class Child extends Parent {

	String name = "child의 name";
	
	
	// 상속을 이미 받은 상태여서 
	// 기본생성자
	public Child() {
		// 부모생성자를 호출하는 것
		// 맨 첫줄에 있어야만 한다
		super(""); // 자식에서 부모를 생성할때 전달인자가 필요하다

	}
	// Child ( ){
	// super( ); // 이게 생략되어있는 거임
	// System.out.println("child 기본생성자");
	// }

	// 부모의 name을 변경하는 메소드
	void setName(String name) {
		this.name = name;
	}
	void setName2(String n) {
	     name = n;
	}
	// 전달인자가 필드를 가리는 현상
	// shadow
	void setName3(String name) {
		this.name = name;
	}
	void printName( ) {
		System.out.println("this.name: " +this.name);
		System.out.println("super.name: " +super.name);
	}
}
