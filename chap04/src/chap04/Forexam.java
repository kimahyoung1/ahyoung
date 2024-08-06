package chap04;

public class Forexam {
	public static void main(String[] args) {

		// 1씩 증가하는 걸 5번 반복할꺼다
		// 1+1+1+1+1
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		// sum+=1;
		// ++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;

		System.out.println(sum);
		// 참고) 1~n까지 더한 값
		// n*(n+1) /2

		// 1+2+3+4+5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);

		// 이번에는 1,2,3에 해당하는걸 변수에 넣어보자
		sum = 0;

		// 초기화식
		int i = 0;

		// 증감식
		i++; // i==1

		// 실행문
		sum = sum + i; // +1 //sum=sum +1;
		i++; // i==2;
		// sum = sum + i+1; //+2 //sum=sum +1;

		i++; // i==3
		sum = sum + i; // +2

		i++;
		sum = sum + i;

		/*
		 * <반복문 만드는 원리> 반복되는걸 찾기 (복붙해도 없는것 (ctrl+ c, v해도 없는것) 반복되지 않는것 (패턴 (규칙)을
		 * 찾을수 있다면 반복문을 만들 수 있음 변수를 활용해서 반복되게 만들기 반복되지 않는것의 시작조건 찾기 종료 조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우 while : 반복 횟수를 모르는 경우
		 */

		// 맨 처음 한번만 초기화식 실행
		// 조건이 참이면
		// 실행블럭 실행하고
		// 증감식 실행하고
		// 다시 조건보기 반복
		// for (초기화식;조건;증감식) {
		// 실행블럭
		// }

		int sum2 = 0;
		for (int e = 1; e <= 5; e++) {
			sum2 = sum2 + e;
			System.out.println("안쪽에서는 e : " + e + " , sum2: " + sum2);
		}
		System.out.println("for 사용 sum2 :" + sum2);

		int sum3 = 0;
		for (int t = 6; t <= 34; t++) {
			sum3 = sum3 + t;
			t++;
			t++;
			t++;
			t++;
			t++;
			t++;

			System.out.println("t:" + t + " , sum3: " + sum3);
			

			// 1~10까지 출력
			// 첫 번째 방법
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);

			// 반복되는걸 찾는 쉬운방법
			// 일단 복사
			// 그리고 붙여넣기
			// 마지막으로 변경할 것 찾기
			// 변경할 것 규칙 찾기
			// 변경되는 걸 변수로 바꾼다
			System.out.println(6);
			int i2 = 6 + 1;
			System.out.println(i2); // 7
			i2 = i2 + 1;
			// i2++;
			System.out.println(i2); // 8
			

			// for으로 만들자
			// for (int i3 = 1; i3 <= 10; i3 += 1) {
			// System.out.println(i3);
			// }
			//
			// for (int i3 = 1; i3 <= 10; i3 = +1) {
			// System.out.println(i3+",");
			//
			//
			// }
			// 조금 쉬운문제 {1}
			// 1~10까지짝수만 출력하기
			System.out.println(2);

			System.out.println(4);

			System.out.println(6);
			// 1. 증감식 이용하기
			// 2. if문 사용하기
			System.out.println("++++++++++++");
			// 조금 어려운 문제
			// 1~10까지 한줄에 3개씩 출력되게
			System.out.println(123);
			System.out.println(456);

			System.out.println(1);
			System.out.println(2);
			System.out.println(3); // 3이 출력
			System.out.println();
			int num3 = 3;
			num3++;
			System.out.println(num3);
			num3++;
			System.out.println(num3);
			num3++;
			System.out.println(num3); // 6이 출력
			if (num3 % 3 == 0) {
				System.out.println();

			}
			System.out.println("*************");
			for (int num4 = 1; num4 <= 10; num4++) {
				System.out.println(num4 + ", ");
				if (num4 % 3 == 0) {
					System.out.println();
				}

			}

		}

		// <1번 문제 짝수만 출력하기 위해선 2로 나눠보고 나머지 0이나 1로 해보기>
		System.out.println("-----------------------------");
		for (int y = 1; y <= 10; y++) {
			if (y % 2 == 0) // 만약에 y가 짝수라면
			{
				System.out.println(y);
			}
		}

		int j;
		for (j = 0; j <= 10; j++) {

		}
		System.out.println("j : " + j);

		int x, y;
		System.out.println("----------------");
		// 1~100까지 3의 배수가 몇개 있는가?
		// System.out.println(3); 내가 한거...
		// System.out.println(6);
		// System.out.println(9);
		// System.out.println(12);
		// System.out.println(15);
		// System.out.println(18);
		// System.out.println(21);
		// System.out.println(24);
		// System.out.println(27);
		// int num4 = 3;
		// num4++;
		// System.out.println(30);

		int count = 0;
		for (int t = 1; t <= 100; t += 1) {
			if (t % 3 == 0) {
				count++;

			}
		}
		System.out.println("3의 배수의 개수는 : " + count);

		// 구구단 2단 출력
	
		System.out.println("2*1=2");
		System.out.println("2*2=4");
		System.out.println("2*3=6");
		int cnt = 3;

		cnt++;
		System.out.println("2 *" + cnt + "=" + (2 * cnt));

		System.out.println("----------------s");
		for (int k = 1; k <= 9; k++) {
			System.out.println("2*" + k + "=" + (2 * k));
		}

		for (int k = 1; k <= 9; k++) {
			System.out.println("3*" + k + "=" + (3 * k));
		}

		int dan = 3;
		dan++;
		for (int k = 1; k <= 9; k++) {
			System.out.println("dan+" + k + "=" + (dan * k));
		}

		System.out.println("--------------------------");
		for (int dan2 = 2; dan2 <= 9; dan2++) {
			for (int k = 1; k <= 9; k++) {
				System.out.println(dan2 + " *" + k + "=" + (dan2 * k));
			}

		}
	}
}