package chap04;

public class breaexam {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int count = 0;
		while (true) {
			// count++; //무조건 세지는 위치
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break; // 브레이크는 가장 가까운 반복문을 종료한다
			}
			count++; // 브레이크를 만났을때만 세지는 위치
		}
		System.out.println("게임종료: 총 " + count);

		System.out.println("------for문----------");

		// ==보다는 크거나 작다
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
			if (i == 7) {
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료");

		for (int i = 0; i < 5; i++) {
			System.out.println("i:" + i);

			for (int j = 0; j < 3; j++) {
				System.out.println("j  " + j);

				if (j >= 1) {
					break; 				//j에 대한 for문만 종료한다.
				}

			}
			System.out.println();
		}
		
		for(int i=0; i<10;  i++){
			if(i %2 !=0) {
				continue;				//이후 실행문은 무시한다.
				
			}
			System.out.println("짝수?" +i);
		}
		// continue : 다음 쇼츠로 넘어가기
		//break: 유튜브 끄기
	}
}