package chap04;

public class Lotto {
	public static void main(String[] args) {
		double rand = Math.random();
		// 0 이상 1 미만
		/*
		 * 0 <= rand && rand < 1 0 * 45 <= rand * 45 < 1*45 0 ~ 45 * 0.9999999
		 * == 44.9999999 int로 바꾸면 0 ~ 44 까지 나오고 1을 더하면 1 ~ 45 까지 random한 숫자가 나온다
		 */

		int number = (int) (rand * 45); // 0~ 44 까지
		number = number + 1; // 1 ~ 45 까지
		number = (int) (rand * 45) + 1; // 위에 한번에 쓴 거 // 공식 1

		number = ((int) (rand * 10000)) % 45 + 1; // 공식 2
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

		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
	}
}