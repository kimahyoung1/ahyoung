package sec01.exam01;

public class TryExam {

	public static void main(String[] args) {

		// 메소드 시작하자마자 try로 감싸기
		// try catch로 시작하기!!
		// Exception 기억하기

		try {
			String s1 = null;
			// System.out.println(s1.length( )); //NullPointerException
			System.out.println(s1);

			int[] a = new int[2];
			// a[100] = 3;

			// String s2 = "20a";
			String s2 = "20";
			int age = 0;

			age = Integer.parseInt(s2); // NumberFormatException
			System.out.println(age + 1);
			// 책에 없는 내용
			ThrowsTest tt = new ThrowsTest();
//			tt.throwException();
			
			tt.human(3);
		} catch ( HumanException he) {
			
			String message = he.getMessage( );
			if ("EC05".equals(message)) {
			System.out.println("5미만은 입력하셨군요. 확인해주세요");
		} else if ("EC10".equals(message)) {
			System.out.println("10초과해서 입력하셨군요. 확인해주세요");
			
		
		}
		} catch (Exception e) {
			System.out.println("오류발생");
			System.out.println("e");
			System.out.println("=============");

			e.printStackTrace(); // 무조건 쓰기, 오류가 확인하기 위해서

			System.out.println("==============");
			System.out.println(e.getMessage());

		}
		System.out.println("완료");

	
	}
}
