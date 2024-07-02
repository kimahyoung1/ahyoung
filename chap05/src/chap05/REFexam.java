package chap05;

public class REFexam {

	public static void main(String[] args) {

		int a;
		// System.out.println(a);
		// int b = a;

		String c = "김아영";
		// =을 기준으로 오른쪽 먼저 실행됨
		// "김아영"이 Heap 영역에 비어있는 번지에 들어간다
		// 그리고 스택 영역의 c에 그 번지가 기록된다

		System.out.println("c :  " + c);
		System.out.println("c == null:  " + (c == null));
		System.out.println("c != null: " + (c != null));

		c = null; // 주소 값을 비워서 연결 끊기
		System.out.println("c :  " + c);
		System.out.println("c == null:  " + (c == null));
		System.out.println("c != null: " + (c != null));

		String d;
		// 기본타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
		// System.out.println(d);

		d = "김아영";
		c = "김아영";
		System.out.println(c == d); // ==비교시 트루가 나온다, (이건 스트링만 특별대우, 특별한 상황일때만)

		c = new String("김아영"); // 완전 새로운 주소의 할당
		System.out.println(c == d); // 결과 : false
		// c가 가지고 가지고 있는주소와 d의 주소값이 다르다

		System.out.println("c.equals (d)  : " + c.equals(d));
		// scan.nextInt()

		// 요특징 기억해두기!!!
		c = null;
		// System.out.println("c.equals (d) : " + c.equals(d)); //.equals =과 같은
		// 의미라고 할 수 있음, 스트링일때 사용하자!
		String e = c + "abc";
		System.out.println(c + "abc");

	}

}
