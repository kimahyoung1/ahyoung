package sec01.exam01;

public class Parent {

	// 부모의 필드를 가리는 현상
	// overshadow
	// String name = "parent의 name";

	
	// 부모의 생성자를 호출하는 방법
	// Parent( ){
	// 		super( ); // 부모의 생성자를 호출
						//알아서 부모 생성자를 찾아옴
	 		
	//		this("a") : // super()와 this()는 모두 첫줄에 적어야하므로
	//	 					같이 사용할 수없다 
						// 내 클래스안에서 다른생성자 호출
	
	//this를 덮어쓴다는건 필드던 메소드던 동일 한게 있을때 자식한테 나옴
	
//	 	System.out.println("parent 기본생성자");
//	 }
	
	//parent안에서는 자식을 부를 수 없음

	Parent(String name) {
		System.out.println("parent 기본생성자");
	}
	
	String name = "parent의 name";

	String getName() {
		System.out.println("parent의 getName 실행");

		return this.name;
	}

}
