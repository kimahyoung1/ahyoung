package 심화반;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {

		// 묶여있으면 거짓이면 밑으로 내려가고 참이면 멈춘다
		int a = 10;
		boolean b = a < 5;
		// if (a > 5) {
		if (a < 5) {
			System.out.println(a + "은 5보다 작다");
		} else if (a < 15) {
			System.out.println(a + "은 15보다 작다");

		} else if (a < 25) {
			System.out.println(a + "은 25보다 작다");
		}

		// else가 있다면 이 중에 하나는 실행된다

		if (a < 5) {
			System.out.println(a + "은 5보다 작다");
		}

		if (a >= 5 && a < 15) {
			System.out.println(a + "은 15보다 작다");

		}
		if (a >= 5 && a < 25) {
			System.out.println(a + "은 25보다 작다");
		}

		// if 는 따로 여서 거짓이면 거짓 참이면 참 같이 실행된다

		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;
		// 앤드는 둘중에 하나가 false이면 false
		// 앤드는 가다가 false를 만나면 끝내
		// &&만 있는 경우 false가 나오면 그 뒤는 쳐다도 안본다
		System.out.println(a1 && a3 && a2);
		// String b1 = "치킨";
		String b1 = null;
		if (b1 != null) {
			System.out.println(123);

			if (b1.length() > 4) {
				System.out.println(b1);
			}

		}
		// b1 != null 거짓이니까 끝내라
		// false로 끝나면 끝난다
		if (b1 != null && b1.length() > 4) {
			System.out.println(b1);
		}

		// (||)or은 두개 다 true이면 true
		// or은 참을 찾아가는 과정
		// ||는 true를 만나면 더 이상 실행하지 않는다
		System.out.println(a1 || a3 || a2);

		// &&연산자가 먼저 실행된다 // 그래서 true
		// 헷갈리면 괄호 치기
		System.out.println((false || true) && true);

		// 블리언이랑 인트는 비교가 안된다
		// 트루랑 5는 비교가 안된다
		// if ( 30 < a < 50) {
		// if ( ( 3 < 4) < 5) {
		// if ( true < 5) {

		// }

		a = 40;
		if (30 < a) {
			if (a < 50) {
				System.out.println(a);
			}

			if (30 < a && a < 50) {
				System.out.println(a);
			}
		}

		double rand = Math.random();
		// double 답 1 = rand * 100.0 ;
		// rand * 100.0
		// 0 <= rand <1.0
		System.out.println((int) -3.5);

		// 5~7까지 랜덤으로 뽑고 싶을때
		// 5+(0~2)
		int 결과 = (int) (Math.random() * 3) + 5;

		int b02 = (int) (Math.random() * 6849684) % 3; // 0~9999

		// 로또 6개 나오게 만들기
		int number = 0;
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		// if (a4 > 0) {
		// System.out.println("영상입니다");
		// } else if ( a4 <= 0) {
		// System.out.println("영하입니다");
		//
		// }

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);

		// 내주머니에 만원 있음
		// 술을 마시고 싶어요
		// 소주:5000원
		// 과자:2000원
		// 컵라면:1500
		// 족발 : 35000

		// int로 -7이였으면 영상인지 영하인지 출력
		// 그게 30도로 바뀌었을때 영상인지 영하인지

		int a5 = 30;
		// a4를 if문으로 만들었을 때 영하인지 출력되어야 함 0
		// boolean b2 = a4 > -7;
		// if (a5 > 0);{
		// System.out.println("영상입니다");
		// } else (a5 <= 0);
		//

		// 2000과 3000사이의 수인지 판단한다
		// int를 이용해서 2000과 3000사이의 수를 판단해야한다
		// boolean을 이용해서 참인지 거짓인지 판단한다
		int d = 2000;
		int s = 12500;
		int h = 3000;
		boolean j = d < s; // int d가 int s보다 작다
		boolean k = s < h; // s가 h보다 작다
		if (j ) {
			System.out.println(s+"는 "+d + "보다 크다");
		}
		if( k) {
			System.out.println(s+"는"+ h + "보다 작다");
		}
		if ( j && k)
		{
			System.out.println("사이의 수");
		} else {
			System.out.println("사이의 수 아님");
		}
		
		
		//월이 입력되면 계절이 나오도록 
	      //3,4,5봄 6,7,8여름 9,10,11가을 12,1,2겨울
	      
	      //월이 입력되면 계절이 나오도록 코드를 짤거임
	      //scanner를 사용해 월 입력받을거임
	     
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("월을 입력하세요 (1부터 12 사이의 숫자): ");
	      int month = scanner.nextInt();

//	      String season = "";

	      if (month >= 3 && month <= 5) {
	         System.out.println(month+"월은 봄 입니다"); 
	      } else if (month >= 6 && month <= 8) {
	    	  System.out.println(month+"월은 여름 입니다"); 
	      } else if (month >= 9 && month <= 11) {
	    	  System.out.println(month+"월은 가을 입니다"); 
	      } else if (month == 12 || month == 1 || month == 2) {
	    	  System.out.println(month+"월은 겨울 입니다"); 
	      } 
	     
	      //28도랑 영하 5도

		// int로 -5면 영하 나오게
		// int로 28도 영상
	      
//	      int a4 = -5;
//	      int j1 = 28;
//	      boolean b2 = a4 > -5;
//	      if (a4 < 0);{

	  	// -5도 이면 영하 5도 입니다
	    // 28도면 영상입니다

	      
//	int h1 = -5;
//	if (k) {
//		System.out.println( h1+"은 영상입니다 ");
//	} else if {
//		System.out.println( h1 + "은 영하입니다");
//	}
	}
	}

