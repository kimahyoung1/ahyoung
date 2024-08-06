package 실습;

import java.util.ArrayList;

public class Dict {

	ArrayList ko_words = new ArrayList();
	ArrayList word = new ArrayList();

	Dict() {
		// 한글센팅도 자식이 해도 되겠다
		ko_words.add("사랑");
		ko_words.add("우정");
	}

	String translate(String word) {

		for (int i = 0; i < ko_words.size(); i++) {
			if (ko_words.get(i).equals(word)) {
				ArrayList words = null;
				return (String)words.get(i);

			}
		}
		return "그런 단어는 모릅니다";
	}
}
