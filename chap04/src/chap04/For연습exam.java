package chap04;

import java.util.Scanner;

public class For연습exam {

	public static void main(String[] args) {

		// 주어진 수가 양수 (0포함), 음수 여부 출력
		Scanner scan = new Scanner(System.in);
		// int a= 0;
		// System.out.println("숫자를 입력하세요");
		// int a= scan. nextInt();
		// if(a.=0 ) {
		// System.out.println();
		// }
		//
		// int a= -3;
		// if(a>=0) {
		// System.out.println(a + " :양수 ");
		//
		// }else {
		// System.out.println(a+"음수");
		// }
		// 입력받은 숫자가 0이 아닌 동안 계속 반복
		// for (int a = 1; a != 0;) {
		// System.out.println("숫자를 입력하세요(종료:0) ");
		// a = scan.nextInt();
		// if (a >= 0) {
		// System.out.println(a + "양수");
		//
		// } else {
		// System.out.println(a + "음수");
		// }
		// }
		// System.out.println("종료되었습니다");
		System.out.println("---------------------------------");

		// 피라미드

		/*
		 * 0단계 + + + + +
		 */
		// System.out.println("+");
		// System.out.println("+");
		System.out.println("0단계");
		for (int i = 1; i <= 5; i++) {
			System.out.println("+");
		}

		/*
		 * 1단계 +++++
		 */

		System.out.println("1단계");
		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.print("+");
		}
		System.out.println();

		/*
		 * 2단계 +++++ +++++ +++++
		 */
		System.out.println("2단계");
		for (int j = 1; j <= 3; j++) {
			
			for (int i = 1; i <= 5; i++) {
				System.out.print("+");
			}
			System.out.println();
		}

		/*
		 * 2-1단계 + + + + +
		 * 
		 */
		// System.out.println("+");
		System.out.println("2-1단계 ");
		for (int i = 1; i <= 5; i++) {
			System.out.print("+");
			System.out.print(" ");
		}
		System.out.println();

		// 3단계는 마지막줄 +가 다섯개
		// 네번째줄 +4개
		// 세번째줄 +3개
		// 두번째줄 +2개
		// 첫번째줄 +1개가 나오게 2단계 이해하고 만들기

		System.out.println("3단계");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("+");
			}
			System.out.println(" ");
		}

		// 4단계는 첫번째 줄 +....
		// 두번째줄 ++...
		// 세번째줄 +++..
		// 네번째줄 ++++.
		// 마지막줄 +++++
		System.out.println("4단계");
		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= k; j++) {
				System.out.print("+");
			}
			for (int s = 4; s >= k; s--) {
				System.out.print(".");
			}
			System.out.println(" ");
		}

		System.out.println("5단계");
		// 5단계
		// ....+
		// ...++
		// ..+++
		// .++++
		// +++++
		//첫번째 줄에 ....+가 나와야하는데 .....으로 반복됨..이것을 찾아서 수정해야함
		//(k=0에서 1로 변경하였고, j도 1로 변경해서 수정하였음)
		//예) k=0, j=0, j<=4를 k=1, j=1, j<=로 변경.
		//마지막 줄 k-1해서 +6개를 5개로 만들었음.
		//k=5번 반복되게 해야함.
		
		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= 5 - k; j++) {
				System.out.print(".");
			}
			for (int s = 0; s <= k-1; s++) {
				System.out.print("+");
			}

			System.out.println("");
		}
		
		
		System.out.println("6단계");
		
		//6단계
		/*	....+
			...+++
			..+++++
			.+++++++
			+++++++++
		*/
		
		//마지막줄 8개의 +로 만들어야함.
		//홀수에 곱하기 해서 8개로 만들어냄.
		//for (int s = 1; s <= 2*  k -1; s++
		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= 5 - k; j++) {
				System.out.print(".");
			}
			for (int s = 1; s <= 2*  k -1; s++) {
				System.out.print("+");
			}

			System.out.println("");
		}
		
		
		System.out.println("7단계");
		
		//7단계
		//		....+....
		//		...+++...
		//		..+++++..
		//		.+++++++.
		//		+++++++++
		//.의 양쪽 대칭이 맞아야함
		//6단계에서 했던 첫 번째 식을 마지막에 똑같이 복붙하기
		
		for (int k = 1; k <= 5; k++) {
			for (int j = 1; j <= 5 -k; j++) {
				System.out.print(".");
			}
			for (int s = 1; s <= 2*  k -1; s++) {
				System.out.print("+");
			}
				for (int j = 1; j <= 5 -k; j++) {
				System.out.print(".");
			}

			System.out.println("");
		}
		
		
		System.out.println("-----------------");
		System.out.println("구구단");
		//구구단 한 단을 옆으로 출력
		//2*1=2 2*2=4...
		//3*1=3 3*2=6...
		
			System.out.print("2*1=2");
			System.out.print("2*2=4");
			System.out.print("2*3=6");
			System.out.print("2*4=8");
			int cnt=4;
			System.out.println("2 *" + cnt + "=" + (2 * cnt));

		
		
		
		/*
		 * 1단계 구구단 한단을 옆으로 출력 2x1=2 2x2=4... 3x1=3 3x2=6... ...
		 * 
		 * 2단계 구구단 옆으로 3단씩 출력 2x1=2 3x1=3 4x1=4 ...
		 * 
		 * 5x1=5 6x1=6 7x1=7 ...
		 */

		/*
		 * 주사위 두개 굴림 1단계 주사위 2개로 굴려서 나올 수 있는 모든 조합을 출력
		 * 
		 * 2단계 합 별로 나올 수 있는 조합 합이 2 : [1,1] 합이 3 : [1,2] [2,1]
		 */

	}
}
