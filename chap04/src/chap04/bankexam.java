package chap04;

import java.util.Scanner;

public class bankexam {

	public static void main(String[] args) {

		// 은행 계좌의 잔액 관리 시스템
		// 1.입금, 2.출금, 3.조회, 4.종료
		// 입금 : 잔액에 더하기
		// * 0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔액에서 빼기
		// * 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔액 출력
		// 종료 : 반복 종료

		System.out.println("금액을 산출해봅시다");

		System.out.println("1. 입금: 2. 출금: 3.조회 : 4. 종료");

		// 입금하고 잔액을 더하기
		System.out.println("---------------------------");
		System.out.println("입금액:10000+잔액:8000");
		Scanner scan = new Scanner(System.in);
		// System.out.println("입금액: 10000 + 잔액: 8000");
		int sum = 0;
		sum = sum + 10000;
		sum = sum + 8000;
		System.out.println(sum);

		// 출금 잔액에서 빼기
		System.out.println("---------------------------");
		System.out.println("출금액:2000+입금액:16000");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("출금액>2000");
		
		int sum1=0;
		sum1 = sum1 + 10000;
		sum1 = sum1 + 8000;
		System.out.println(-sum + -sum);

		//
		// System.out.println("---------------------------");
		// System.out.println("선택>3");
		// Scanner scan11 = new Scanner(System.in);
		// System.out.println("잔액>8000");
		//
		// System.out.println("---------------------------");
		// System.out.println("선택>4");
		// Scanner scan12 = new Scanner(System.in);
		// System.out.println("종료>");
	}
}