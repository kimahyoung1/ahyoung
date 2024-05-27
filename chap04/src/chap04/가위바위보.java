package chap04;

public class 가위바위보 {

	public static void main(String[] args) {

		double rand = Math.random();
		System.out.println("rand : " + rand);
		// 0이상 1미만

		// 주사위 : 1~6까지
		int dice = (int) (rand * 6) + 1;
		System.out.println("주사위 숫자는 : " + dice);

		if (dice == 6) {
			System.out.println("6이 나옴");
		}

		rand = Math.random();
		int rsp = (int) (rand * 3);
		if (rsp == 0) {
			System.out.println("가위");
		} else if (rsp == 1) {
			System.out.println("바위");
		} else if (rsp == 1) {
			System.out.println("보");
		}

		int my = 1; // 바위
		if (rsp == 0 && my == 0) {
			System.out.println("비김");
		} else if (rsp == 0 && my == 1) {
			System.out.println("내가 이김");
		} else {
			System.out.println("내가 짐");
		}

		double rand2 = Math.random();
		System.out.println("rand2: " + rand);
		// 0이상 1미만

		// 주사위 : 1~6까지
		int dice2 = (int) (rand2 * 6) + 1;
		System.out.println("주사위 숫자는 : " + dice2);

		if (dice2 == 1) {
			System.out.println("주사위 1이 나옴");
		} else if (dice2 == 2) {
			System.out.println("주사위 2가나옴");
		}
		// if 중에서 ==또는 equals인 경우 스위치로 바꿀 수 있다.

		// 브레이크가 없으면 그 다음것도 같이 나온다
		switch (dice2) {
			case 1 :
				System.out.println("주사위 1이 나옴");
				break;
			case 2 :
				System.out.println("주사위 2나옴");
				break;
			case 3 :
				System.out.println("주사위 3 나옴");
				break;

			case 4 :
				System.out.println("주사위 4나옴");
				break;

			case 5 : // else if
				System.out.println("주사위 5 나옴");
				break;

			default : // if 의 else
				System.out.println("주사위 6 나옴");
				break;
		}
		int month = 5;

		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month >= 12 && month <= 2) {
			System.out.println("겨울");
		}
		// 브레이크가 없을때 다은 케이스도 실행되는 원리를 이용해서
		switch (month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄 2");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름 2");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을 2");
				break;
			default :
				System.out.println("겨울 2");
				break;
				
			//char, byte, short, int (즉 int 이하), string만 허용됨
			//boolean, long ,float, double은 못씀

		}

	}
}
