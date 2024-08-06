package sec02.exam01;

// 대리기사
public class Driver {

	// 아반떼를 전달인자로 받음
	// 스파크만 운전할 수 있는 대리기사님
//	void run(Avante a) {
//		System.out.println("전달인자로 아반떼만 받음");
//		a.drive();
//	}
//
//	void run (Spark s) {
//		System.out.println("전달인자로 스파크를 받음");
//		s.drive( );
//	}
	void run (Car c) {
		System.out.println("전달인자로 Car만 받음");
		c.drive( );
	
}
}
