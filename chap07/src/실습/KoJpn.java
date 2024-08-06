package 실습;

import java.util.ArrayList;

public class KoJpn extends Dict{ 
	ArrayList jp_word = new ArrayList( );
	
	KoJpn( ){
		ArrayList en_words = null;
		ArrayList jp_words = null;
		jp_words.add("love");
		jp_words.add("friendship");
		
		this.word = en_words;
	}

}
