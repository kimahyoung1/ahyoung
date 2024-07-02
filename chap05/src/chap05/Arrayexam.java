package chap05;

import java.awt.List;
import java.util.ArrayList;

public class Arrayexam {

	private static int[] vote;

	public static void main(String[] args) {

		// 기본타입에는 null을 넣을 수 없음
		// null은 인트도 아니고 더블도 아니다
		// int a = null;

		// 배열
		// 한 번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있음
		// 각각생성된 여러 변수들은 인덱스로 관리할 수 있다

		// 선언 방법
		// int로 구성된 배열이다
		int[] score; // 자바 스타일
		int score2[]; // c 스타일

		// 참조 타입이므로 null을 쓸 수있음
		score = null;

		int[] score3 = null;

		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;

		// 배열을 생성할 때 크기를 알려줘야 합니다
		// 첫번째 { } : int [ ] 는 배열인데 int 만 들어가게 해준다
		// 두번째 new int[3]: 배열의 크기 ; 한번에 만들 변수의 개수
		// 연달아서 타입의 크기만큼 메모리 할당
		// 첫번째 변수부터 index 0,으로 시작
		// 세번째 intArray [0] : 만들어진 변수들 중 첫번째 변수를 뜻함

		int[] intArray = new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
		// intArray[2] = 70;

		System.out.println(" intArray[1] : " + intArray[1]);

		// 기본값은 0 또는 false , null로 초기화된다
		System.out.println(" intArray[2] : " + intArray[2]);

		// System.out.println(" intArray[3] : " + intArray[3]);

		// 배열의 모든 값을 1로 바꾼다
		intArray[0] = 1;
		intArray[1] = 1;
		int a = 1;
		a++;
		intArray[a] = 1;

		// for(int i=0; i<=3; i++) {
		for (int i = 0; i < 3; i++) {
			intArray[1] = 1;

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(intArray[i]);
		}

		System.out.println(intArray); // [I@59f95c5d
		System.out.println(intArray.length); // length모든 배열을 다 돈다
		// intArray.length 특성상 값을 다시 바꿀수없다, 한번 선언된 크기는 바꿀 수없다
		// (intArray.length=4;

		// 배열을 선언하는 두번째 방법
		// 1.값을 미리 알고 있을때
		// 크기는 알아서 계산된다
		// int[] intArray2 = new int[]{10, 20, 30, 40};
		// for (int i = 0; i < intArray2.Legth; i++) {
		// System.out.println(intArray[i]);
		// }
		// 세번째 방법
		// 선언과 동시에 초기화 할때만 가능
		int[] intArray2 = new int[]{100, 200, 300, 400}; // for(int i=0;
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		String[] strArry = new String[5];
		for (int i = 0; i < strArry.length; i++) {
			strArry[i] = "김아영" + (i + 1);
		}
		// 1~10가지배열을 넣고
		// 배열의 총 합 출력
		// 배열의 평균값 출력

		int[] score5 = new int[10];
		for (int i = 0; i < score5.length; i++) {
			score5[i] = i + 1;

		}

		int sum = 0;
		for (int i = 0; i < score5.length; i++) {
			sum += score5[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / score5.length;
		System.out.println("평균 :" + avg);

		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];
		// 맨뒤의 []는 배열을 뜻하고 앞에 있는 모든건 배열의 종류
		// int [ ] 변수들로 관리하는 배열이 된다는 뜻
		// 4는 천안의 크기 즉 "천안"으로 관리되는 변수의 개수
		int[][] 천안 = new int[4][22];

		System.out.println(천안); // [[I@9e89d68 //이차원 배열
		System.out.println(천안[0]); // [I@3b192d32 //@가 있으면 안쪽에 뭐가있당
		System.out.println(천안[0][0]); // 0

		int[ ] 클래스1 = 천안[0];
		// int 학생1= 클래스1 [0];
		int 학생1 = 천안[0][0];

		int[ ][ ] test = new int[3][2];
		int[ ] [ ] test2 = {
							{5, 6},
							{12, 15},
							{93, 87}
						};

		int[][] 서울 = new int[4][22];
		int[][] 수원 = new int[4][22];

		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(22 * 4 * 3);
		System.out.println(휴먼); // [[[I@16f65612

		System.out.println("휴먼. Length :  " + 휴먼.length);
		System.out.println("휴먼[0]. Length :  " + 휴먼[0].length);
		System.out.println("휴먼[0][0]. Length :  " + 휴먼[0][0].length);

		int [ ][ ] 달력 = new int[12][31];
		for (int i = 0; i < 달력.length; i++) {
			for (int j = 0; j < 달력[i].length; j++) {
				System.out.println(
						"i : " + i + ",  j: " + j + ", 달력 [i] [j]:" + 달력[i][j]);
			}
		}

		ArrayList List = new ArrayList();
		List.add(1);
		List.add("문자");
		List.add(true);

		System.out.println(List.get(0));
		System.out.println(List.get(1));
		System.out.println(List.get(2));

		// 배열의 Length
		System.out.println(List.size());
		System.out.println(List);

		// System.out.println("--------------------------------"); //배열에서 랜덤으로
		// 뽑기
		// String [ ] study = {"박규태","이제섭","김아영","박경민", "정근승","현준수","남현우","김승환",
		// " 조민정", "이정은"};
		// System.out.println("총" + study. length+"명");{
		// //배열애서 랜덤으로 뽑기
		// double rand =Math.random()*+ study.length;
		// //0~9.99999
		// int index= (int) rand;
		//
		//
		// vote [index] += 1;
		// }
		//
		// for(int i = 0)

		
		// 6개의 로또 번호를 저장하고 싶다
		int [] lotto = new int [6];
		for(int i=0; i<lotto. length; i++) {
			
			lotto[i]= (int) (Math.random() *45) +1;  //1부터 45 1부터 시작해야 할 수 있다
			
		}
		for(int i=0; i<lotto. length; i++) {
			System.out.println(1+"번호: "+ lotto[i]  );
		}
		
		
	}

}
