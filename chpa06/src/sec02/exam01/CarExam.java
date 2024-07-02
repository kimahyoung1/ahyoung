package sec02.exam01;

public class CarExam {
	//( ) 앞에 있는거 메인
	//( ) 안에 있는거 전달인자
	// void = 리턴할게 없다
	
	public static void main(String[] args) {
	 /*car java랑 합친거*/
		
		
		// 내가 새로 만든 타입
		// 내가 사서 카를 새로 만듦
		// 이 차는 이제 내꺼임
		Car mycar= new Car( );
		Car mycar2= new Car( );

		System.out.println(mycar. model);
		mycar. model = "흑팔라";
		System.out.println(mycar. model);
		
		System.out.println(mycar2. model); // 위에꺼랑 상관 없음 임팔라로 출력됨
		
//		int a;
//		System.out.println(a);
		System.out.println(mycar.speed); // 출력 0이 나옴 // 스피드에 값을 안줌
		
	

		
	}

}
