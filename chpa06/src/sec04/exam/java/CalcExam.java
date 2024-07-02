package sec04.exam.java;

public class CalcExam {

	public static void main(String[ ] args) {
		poweron( );   //이건 내꺼
		poweron( );  // 두번 써도 되서 두번씀
		
		calc calc = new calc( );
		calc.poweroff( );
		System.out.println(calc);
		calc calc2 = new calc( );
		System.out.println(calc2);
	}

	static void poweron() {
		System.out.println("전원을 킵니다");
	
	}
}
