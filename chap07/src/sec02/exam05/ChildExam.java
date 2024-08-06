package sec02.exam05;

public class ChildExam {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1("차일드");
		System.out.println("결과 : 차일드의 firld : " + child.field1);

		Child p = new Child();
		p.method1("자식이 오버라이드 한 곳에 보내는 전달인자");
		System.out.println("결과 : p의 field1: " + p.field1);
		// p.fild1은 부모 클래스의 필드를 가르킨다
		// 오버라이드는 메소드만 된다

		Child child2 = (Child) p;
		System.out.println("결과 : p의 field2: field1 " + child2.field1);

		Parenet p1 = new Child();
		Parenet p2 = new Child101();
		// p1 = p2;
		Child c = (Child) p1;

		// p2가 차일드에서 왔는가
		// p2는 차일드의 인스턴스인가
		boolean isChild = p2 instanceof Child;
		System.out.println(isChild);
		if (isChild) {
			Child c2 = (Child) p2;
		}
		if (p2 instanceof Child101) {
			Child101 c3 = (Child101) p2;
		}

//		Object obj = new Object();
//		Array = new Arrays();
//		List.add(p1);
//		Object obj1 = List.get(0);
//		Parenet p3 = (Parenet) obj1;
//		p3 equals(obj1);
//		"".equlas("abc");
//		
//		syso

		System.out.println(123);
		Child c2 = (Child) p2;
	}

}
