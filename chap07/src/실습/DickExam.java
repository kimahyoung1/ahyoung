package 실습;

public class DickExam {

	public static void main(String[] args) {
		KorEng ke = new KorEng( );
		String result = ke.translate("사랑");
				System.out.println(result);

				KorEng kj = new Korjpn( );
				result = ke.translate("우정");
						System.out.println(result);

	}

}
