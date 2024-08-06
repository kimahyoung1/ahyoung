package 커피전문점;

public class Cafe  {

	// 스타벅스가서 아이스 아메리카노를 마실거얌 drink 사용
	
	// 만약에 리턴받은 값이 false면 드라이브스루를 이용 못해
	// 얘가 true라면 드라이브 스루 이용 가능해 
	boolean isDT() {
		System.out.println("드라이브스루 이용 안 함!");
		return false;
	}
	
	void ordedr(String menu) {
		System.out.println(menu + "을 주문했습니다. ");
		
		hand(menu);
		drink(menu);
	}
	
	void drink (String menu ) {
		System.out.println( menu +"를 마신다");
		System.out.println("벌컥벌컥");

	}
	
	void hand( String menu ) {
		System.out.println(menu + "를 받았다");
	}
}
