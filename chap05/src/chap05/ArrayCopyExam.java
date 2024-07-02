package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];

		coffee[0] = "카푸치노";
		coffee[1] = "아메리카노";
		coffee[2] = "모카라떼";

		// 2호점에서 1호점과 똑같은 커피를 판매합니다
		/*
		 * 얕은복사 shallow copy, thin copy, call by reference steak 영역의 값만 (주소만 )
		 * 복사 원본이 바뀌면 당연히도 내 값도 바뀜 (원본에 있는주소만 따온거)
		 *
		 */

		String[] coffee2 = coffee;
		for (int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}

		// 얕은 복사로 연결되어 있어서
		// 내껄 바꿔도 원본이 바뀐다
		// 원본의 주소를 공유하고 있기 때문에 coffee나 coffee2는 같은거다
		// !!!!주소만 공유!!!!!
		coffee2[1] = "연유라떼";
		System.out.println("coffee2[1]의  값을 바꾸고 원번인 coffee를 출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);

		}

		// 할 일 크기와 내용을 동일하게 가지는 새로운 배열을 만들겠다
		/*
		 * 깊은 복사, deep copy, deep clone, call by value heap 영역에 새로운 번지(주소)에 자리를
		 * 마련하고 변수에 주소를 넣는다 그리고 원본의 값들을 복사해서 채워넣는다 그래서 원본과 동일하게 생기지만 전혀 다른 주소를
		 * 가지게 된다 즉 내 값을 바꿔도 원본이 바뀌지 않음
		 */
		String[] coffee3 = new String[coffee.length];
		// coffee3[0] = coffee[0]; //수동이여서 원본이 바뀌면 이것도 바꿔줘야 하니까
		// coffee3[0] = coffee[0];
		System.out.println("coffee3 출력");
		coffee3[2] = "아샷추";
		for (int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}

		System.out.println("coffee3[2]의  값을 바꾸고 원본인 coffee를 출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);

		}

		// coffee3에 "사라다 빵" 추가하려면???
		// coffee3 = new String[]{"따아", "사라다빵", "아샷추", "연유라떼"};

		// 커피라는 원본을 새로만든거 하나보다 크게 만들고 0번지 1번지 복사해와 마지막에 새로 사라다빵을 입력해봐
		// 내가한고,,,,
		// String [ ] coffee4= new String[coffee.length] ;
		// coffee[0] = "카푸치노";
		// coffee[1] = "아메리카노";
		// coffee[2] = "모카라떼";
		//
		// System.out.println("coffee4 출력");
		// for(int i = 0; i <coffee4 .length i++ ) {
		// System.out.println(coffee[i]);;
		//

		/*
		 * 전략 : 커피의 크기보다 1개 많은 새로운 배열을 만들고 앞에서 부터 복사해 놓고 마지막에 추가할 값을 적어보자
		 */
		coffee3 = new String[coffee.length + 1];
		// 앞에 3개만 복사
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
		// 비어있는
		coffee3[3] = "사라다빵";
		System.out.println("4번째 메뉴를 추가한 결과");
		for (int i = 0; i < coffee3.length; i++) {
			String menu = coffee3 [i];
			System.out.println(coffee3[i]);
		}

		// 중간에 어떻게 넣지

		// 향상된 for문
		System.out.println("향상된 for문");
//		int cnt = 0;
		for (String menu : coffee3) {
//			cnt++;
			System.out.println(menu);
		}
		
		//모든 자식 배열의 크기가 같게 설정할 수 밖에 없음
		int [ ] [ ] a2= new int[10] [100];
		//자식별로 크기를 다르게 선언할 수 있음
		int [ ] [ ] a3= { {1,2,}, {1,2,3,}  }; 
		
		
		
		
	}

}
