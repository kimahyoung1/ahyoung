package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {
		
		int a= 2 + (2 * 2) ;
			
		long b= (long)a;  // int인 a를 long type으로 바꿈
								// long이 long 타입에 들어가는건 문제가 안됨
		long c= a; //작은거에서 큰걸로 바뀔때는 손실이 없으므로
					// 형변환을 생략 할 수 있다
					//자동 형변환라고함
					// 묵시적, 암시적 형변환이라고도 부름 (암무적 형변환)
		System.out.println("c " + c);
		
		a = (int)c;  //큰거에서 작은거로 바뀔때는 손실이 있을 수 있다
					// 그래서 형변환을 생략할 수 없다
					//이것을 명시적(강제) 형변환이라고 한다
		
		double d2 = 3.14;
		int i = (int)d2;
		System.out.println("i " +i) ;
		
		//int result = 43;
		//double result =(double) 43;
		double result = 43;
		int count = 10;
		System.out.println( "(double)count:" +(double)count );
		System.out.println(result/ (double)count );
		System.out.println(result/ count );
		// 더블과 인트 연산할 때 인트가 더블로 자동 형변환 되서 연산됨
		
	 int i2= 2100000000;
	 int i3 = i2 *2; // int 끼리 연산해서 java 문제 없다고 생각한다
	 System.out.println("i3:" + i3); // 결과가 -94967296 넘쳐서 그렇다
	 
	 System.out.println(3 + "문자");
	 System.out.println(3 +4 + "문자");
	 System.out.println(""+1+300+"px"); // 문자로 시작하면 계산 안됨
	 System.out.println(""+(1+300)+"px");  //괄호치면 괄호 먼저 계산되서 301px)
	 
	 System.out.println("------hr---------");
	 
	 System.out.print("첫 번째줄");   //span과 같음
	 System.out.print("두 번째줄");
	 System.out.println("i3의 값은 : ");
	 System.out.println(i3);
	 System.out.println("------hr---------");
	 System.out.println("i3의 값은 : %d, i3 ");
	 System.out.println(); //br의 의미
	 System.out.printf("i2의 값은 : "+ i2 +", i3 : " + i3);
	 System.out.println(); 
	 System.out.printf("i2의 값은 : + %d,  i3 : %d" , i2 , i3);
	 	
	 System.out.println("------hr---------");
	 System.out.println("아무거나입력하세요..");
	 Scanner scan = new  Scanner (System.in); //입력받으려고 준비.  //굳이 몰라도 되는부분!! 나중에 배워용~
	 String input = scan .nextLine();
	 System.out.println("input : " + input);
	 
			 
	 
	 
	}
	
	

}
