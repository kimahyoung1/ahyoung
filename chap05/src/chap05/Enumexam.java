package chap05;

public class Enumexam {

	public static void main(String[] args) {

		System.out.println(LoginResult.SUCCES);
		System.out.println(LoginResult.FAIL);

		LoginResult login;
		login = LoginResult.SUCCES;

		// 내가 Login에 어떤 값을 넣었는지 모를 떄
		if (login == LoginResult.SUCCES) {
			System.out.println("성공");
		} else if (login == LoginResult.FAIL) {
			System.out.println("실패");
		}

		
	}

}
