package 실습;

public class DictkoEng {
	// 배열로 관리되는 번역사전 시스템
	// 1. 전달인자로 받은 단어에 대응하는 단어를 메소드 만들기
	// 2. 한영/한일 사전을 만들때 공통되는 사전이라는 부모 클래스 활용해보기

	/*
	 * 한영사전 translate("사랑") == "LOVE" ("우정") == "Friendship" (뀁) == " 잘 모르겠어요"
	 *
	 * String target1="LOVE" String ko1 = "사랑" if(word.equls(ko1)){ return en1;
	 * }
	 */
	// ko_word 변수를 넣어준거임
	String ko_word1 = "사랑";
	String en_word1 = "Love";

	String ko_word2 = "우정";
	String en_word2 = "frendship";

	// 배열 기초
	// 스트링만 들어가는 배열 코월드를 뉴 스트링 닫고 대괄호;
	// string으로 이루어진 배열: string [ ]
	// 그 배열의 변수명 : ko_word
	// String으로 이루어진 2개짜리 배열을 새로 생성해라: new String[2 ]
	String[] ko_word = new String[2];
	String[] en_word = new String[2];
	DictkoEng() {

		// 그 2개의 변수 중 첫번째 변수는 : ko_word[0]
		ko_word[0] = "사랑";
		en_word[0] = "Love";

		ko_word[1] = "우정";
		en_word[1] = "friendship";

	}

	// 메소드명 translate
	// 전달인자 String 한글단어
	// 리턴타입 String 영어단어
	// String translate(String word) {
	// if (ko_word1.equals(word)) {
	// return en_word1;
	// } else if (ko_word2.equals(word)) {
	// return en_word2;
	// } else {
	// return "그런단어는 모릅니다";
	// }
	// }

	// 메소드명 translate
	// 전달인자 String 한글단어
	// 리턴타입 String 영어단어
	String translate(String word) {
		for (int i = 0; i < ko_word.length; i++) {
			if (ko_word[i].equals(word)) {
				return en_word[i];

			}
		}
		return "그런 단어는 모릅니다";
	}
}
