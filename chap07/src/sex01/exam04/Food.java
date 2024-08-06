package sex01.exam04;

public class Food {

	Food() {
		System.out.println("Food 생성자 실행");
	}

	/*
	 * 이름 : name 가격 :price 주재료:recipe 종류 : type
	 */

	String name;
	int price;
	String recipe;
	String type;

	/*
	 * 먹는다 eat () 
	 * 주문한다 order( ) 
	 * 요리한다 Cook( )
	 */

	int eat() {
		System.out.println(this.name + " 먹는다");
		return (int) (Math.random() * 5) + 1;   // 별점임 
	}

	int order(int money) {
		int change = 0; // 거스름돈

		if (money < this.price) {
			System.out.println(this.name + "금액부족으로 취소한다");
		} else {
			System.out.println(this.name + " 주문한다");
			change = money - this.price;
		}

		return change;
	}

	/**
	 * 
	 * @param int master 요리숙련도
	 * @return 
	 * @return String 조리결과
	 */
	String cook (int master) {
		if(master > 7) {
			return "잘됨";
		} else if (master > 4) {
			return "먹을만함";
		} else 
			return "나혼자먹어";
	}
}
