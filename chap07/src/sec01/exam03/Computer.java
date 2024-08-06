package sec01.exam03;

public class Computer extends Calc {
	
	
	
		// 메소드에서만 붙음 
		// 잘못 입력하면 오류가 난다
		// 부모거가 있는지 없는지 찾아준다
		// 쓰면부모의 메소드인걸 티가남 
			@Override
		double areaCircle(double r ) {
		System.out.println("Computer 객체의 areaCircle실행");
		return Math.PI * r * r;
	}
			
//			int plus (int x, int y) {
//				System.out.println("문의하신 정답은");
//				int result = super.plus(x,y);
//				System.out.println(result+ "입니다");
//				return result;
			}
//}
