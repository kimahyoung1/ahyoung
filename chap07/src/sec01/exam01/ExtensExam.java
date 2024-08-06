package sec01.exam01;

public class ExtensExam {

	public static void main(String[] args) {
		
		Child c1 = new Child( );
		c1.printName( );
		System.out.println(c1.name); // 여기에 신경쓰기 
		String str =c1.getName( );
		System.out.println(str);
		
		c1.setName("자식이 보낸이름");
		System.out.println(c1.name);

	}

}
