package 심화반;

public class forexam {

	public static void main(String[] args) {
//		for( ; ; ) {
// 	 	무한히 돈다 . 포문의 기본 
//		}

		int a = 1; //a를 초기화 했다
//		int c = 0;  
		
		// 딱 세번만 실행하고 싶어
		// 첫번째 실행
		a=a+10;
		System.out.println(a);
		// 첫번째와 같은 코드를 두번째 실행
		a=a+10;
		System.out.println(a);
		//계속 같은 코드를 세번째 실행
		a=a+10;
		System.out.println(a);
		// 첫번째 장소 : 초기화식 : 처음에 딱 한번만 실행됨
		// 두번째 장소 : 조건식 : 거짓이 아닐 때 반복 시키는 조건
//									 : 처음부터 조건이 맞아야 실행됨
		// 세번째 장소 : 증감식 : 사실은 그냥 실행문 끝에 
		//								무조건 실행해야 하는 코드를 넣는 곳
//		for (int b =1;  b<1 ;   ) {
//		}	
		for (int b =1; b <= 31    ;   b = b + 10 ) {
		System.out.println("반복 내용 실행");
		}	
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		// 3부터 100까지 짝수의 개수
		// 짝수일때 갯수를 센다면
		//count =0
		// 만약 y가 짝수라면 ???
		//int y로 시작
		// 증감식 사용할거임
		// 3은 100보다 작아
		
	
		//t % 3== 0 3의 배수라는 얘기
		
//		for (int y = 3; y <= 100;  y+=1) {
//			if(y % 4 == 0) {
//				System.out.println(y);
//			}
//		}
		
		int count = 0;
		for (int t = 3; t <= 100; t += 1) {
			if (t % 2 != 0) {
				count++;
			}	
		} 
		System.out.println(" 3부터 100까지의 개수 : " + count);
		
		// 구구단 2단 출력할겁니다
		// 2단은 1부터 9까지 하나씩 증가함 
		// 2의 배수를 찾아야함
		// 2*1=2, 2*2=4,2*3=6......
		// 출력먼저 해볼거임
		// int 변수를 k 로 입력
		// 1은 9보다 작다
		//System.out.println("2*1=2");
		System.out.println("2x1=2*1");
		System.out.println("2x2=2*2");
		System.out.println("2x3=2*3");
		System.out.println("2x4=2*4");
		
		for (int k = 1; k <= 9; k++) {
			System.out.println("2*" + k + "=" + (2 * k));
			
	}
		
		// 총 싸움 게임을 만들거임
		// 생명이 100이 있어 다 닳으면 죽어 총을 한대씩 맞을건데 총을 한번 맞으면 17번 닳아
		// 총을 몇번맞아야 죽을까.......
		// 100 에서  17을 빼면 83 아직 살아있음 총알 1 
		// 83 에서 17을 빼면 66 아직 살았음 총알 2
		// 0보다 작아지면 총알 몇번쐈는지 출력
		// 체력이 0이하가 될때까지 반복
		// 답이 6번이 나와야함
	
//		System.out.println(100-17);
//		System.out.println(83-17);
//		int hp = 100;
//		hp= hp -17;
		int cnt = 0;
		for(int hp=100;  hp >= 0; ) {
			System.out.println("한대요");
			cnt++;
			hp= hp -17;
			System.out.println("hp : " + hp);
		}
		System.out.println("카운트 : " + cnt);
//		System.out.println("한대요");
//		if ( hp >= 0) {
//			hp = hp - 17;
//			System.out.println("한대요");
//		}
		 
	//10부터 0까지 역순으로 출력
	// for문을 사용해서 만들거임
	// 반복이  날때마다 1이 감소되어야함
	// 초기값을 10으로 
	
		for ( int i = 10; i >= 0; i--) {
			System.out.println(i);
			
		}
		
		
		
		// 0부터 10까지 역순이 아닌 순서
		for ( int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		

		// 100에서 한대씩 맞을때마다 17번씩 닳아 
		// for문 사용
		// 100-17=83
		// 83 - 17 =66
		int cnt2 = 0;
		for(int hp=100;  hp >= 0; ) {
			System.out.println("한대맞음");		
			hp= hp -17;{
			System.out.println("hp : " + hp);
		} 
			System.out.println("카운트"+cnt);
			
		}
		//한 주에 6만원씩 버는데 400만원 모으려면 몇 주가 걸리는지!
		
		int won =0;
		for(int week = 0; week <= 400; week += 6) {		
			won++;
		}
		System.out.println(won + "주 걸림");
		
		
//		int won = 0;
//		for (int week = 0; week <= 400;  week +=6 ) {
//			System.out.println("400만원모으기");
//			week= week + 6; {
//				System.out.println("week : " + week);
//			}
//			System.out.println("돈"+ won);
//					
//		}.
		}
}
