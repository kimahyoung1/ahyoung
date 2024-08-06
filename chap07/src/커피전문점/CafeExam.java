package 커피전문점;

public class CafeExam {
	public static void main(String[] args) {

		Dt dt = new Dt();
		// Cafe starbuks = new Starbuks();

		// Cafe aDt = new Dt( );
		Starbuks aStarbuks = new Starbuks();

		Me m = new Me();

		// m.order(aDt, "아아");
		m.order(dt, "아아"); // 자동형변환으로 Cafe 타입으로 변환

	}
}