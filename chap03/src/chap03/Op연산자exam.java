package chap03;

public class Op연산자exam {

	public static void main(String[] args) {
		int a= 10;
//		a = 11;
//		a=10 + 1;
		int b= a+ 1;
		
//		a = 10 + 1;
		a= a+1; // a= 1 +a
		a += 1; // a=a+1과 같다
		a++; 	 // a += 1과 같다
		++a;
		
		a=10;
		a++;
		System.out.println("a: " + a);
		
		a=a-2;
		a -=2;
		a -= 1;
		a --; // a=a -1 과 같다
		
		a=10;
		a --;
		System.out.println("a: " + a);
		//현재 가 9
		System.out.println("++a: "+ ++a); // 출력 10
		//현재 가 10
		System.out.println("++a: "+ a++); //출력 10
		System.out.println("a: "+ a);
		//현재 a 가 11
		
		System.out.println(a++   +   ++a) ;
		// 11 + (a가 12가된 상태)에다가 1 더하기 (11+13)
		//위 내용을 풀어쓰기
		a=11;
		int result = a; //a
		a = a + 1;	//a다음에 오는 ++
		a = a+ 1; 	// 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : "+ c);
		c = !c;
		System.out.println("!c : "+ c);
		
		// ! 는 반대를 뜻한다. (참이 아니다)
		
		int d =9;
		System.out.println(d/3); //(인트나누기 인트라서 3이 나옴)
//		System.out.println(3/0);  //0은 무한대로 넘어감 (오류가 나옴)
									// double 일 때는 인피니티 인프 일때는 
		int f = 10;
		int p = 5;
		System.out.println("몫 :" +  (f/p));
		System.out.println( " 나머지 : " + (f%p));		
		//나머지는 3이상 나올 수 가 없다.
		
		//돈(h)이 10000원이 있음
		//커피(u)4500원 짜리 몇잔 살수있나 
		
		int h= 10000;
		int u= 4500;
		int count = h/u ;
		System.out.println("만원:" + (h/u));
		int change = h % u;  
		System.out.println("잔돈: "+ u);
		
		//올리브영에서 전품목 15% 행사를 합니다.
		//1. 꿀홍차 5000원을 샀을때 얼마를 내야하나요
		//2. 꿀홍차 5000원과 립스틱 10000을 샀어요 얼마를 내야하나요? 
		
		double perecent = 0.15;
		int tea= 5000;
		double discount= tea * perecent;
		System.out.println("할인 받을 금액: " + discount);
		double pay = tea - discount;
		System.out.println("내야하는 돈 :  "+ pay);
		
		//7234원이 있음
		// 5000원, 1000원, 500원, 100원, 50원, 10원, 1원
		// 각각 최대 몇개까지 표현할 수 있나요?
		
		int won = 7234;
		int k= 5000;
		int l= 1000;
		int w= 100;
		int q= 10;
		int x= 1;
	   
//		5000원을 won에서 나눠요
		int y= won/k;
		System.out.println("5000: " +y);
		
		/*
		 * 1000원 두장 나오게할건데
		 * 5000원 한장을 사용해서 천원이 두장이 나와야한다.
		 */
		
		int o= won/l;
		System.out.println("1000: " +l*2);

		/* 5000원을 한장 나눴고 
		 * 1000원을 두장 나눠서
		 * 100원이 3개가 나와야함.
		 */
		
		int  g1= won/w;
		System.out.println("100:"  +w*2);
		
	
		int g2 = won/q;
		System.out.println("10;"  +q*3);
		
		int h1=won/x;
		System.out.println("1;"  +x*4);
		
		
		String left = "수박";
		String right = "멜론";

	
		// 단, left = "멜론" 금지
		System.out.println(left);    // 결과 : 멜론
		System.out.println(right);    // 결과 : 수박
		String prev_left= left;
		right= left;
		left=prev_left;
		
		
		System.out.println(3>5);
		boolean bool = (3>5);
		System.out.println(bool);
		
		
		System.out.println(0.1 == 0.1f);   //결과 false
		//같은 타입으로 변경해서 비교하자
		System.out.println();
		
		System.out.println("3==3");
		
		

	 String  str1= "김아영" ; 
	 String  str2= "김아영" ;
	 
	 //	 System.out.println(str1 == str2);
	 //글씨 비교는 ==사용 금지
	 //string 변수나 ""dp .equals ()를 붙여서 사용 ()안에 글씨와 비교
	 System.out.println(  str1 .equals(str2) );
	 
	 
	 //<비트연산자> && 많이 사용하게됨
	 //	 System.out.println(10 | 3);   //&하나만 쓰면 비트 연산자
	 //	 System.out.println(10 & 3);
						
	
	int i1 = 3;
	int i2 = 15;
	int i3 = 7;

	System.out.println ("i3이 가장 큰 값인가? "
				+(  (i3 >= i1) && (i3 >= i2)   )   ) ;
	       //이항 연산자
	
	boolean i4가  = i3 > i2;
	System.out.println( i4가 ? "i3이 크다": "i3이 작거나 같다" );
				
	//	131페이지 6번문제
	//나누기를 먼저하기!!
	int k1= 356;
	System.out.println(k1/100*100);

		//5번 문제
		int var1= 5;     
		int var2= 2;		
		double var3=var1/var2;  //예상 : 2.5	
		System.out.println("var3:  "+ var3);// 출력 2.0
		int var4= (int) (var3*var2);
		System.out.println("var4: " + var4);
		
		
	}
	
}
