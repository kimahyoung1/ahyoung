	package chap04;

	public class Ifexam {

	public static void main(String[] args) {
		//if는 참일 때만 동작
		//거짓일때면 없었던 것 처럼 동작함.
		
		int score = 97;
		//if (score > 90) {
		if (score >= 90) {
			System.out.println("90점 이상입니다");
			
		if(score >= 95) {
				System.out.println( "95점 이상입니다");
			}
			
		}
		
		if(score <90) {
			System.out.println("90점 미만입니다"); //거짓이라서 동작하지 않음
		}
		//참고로 
		boolean up90 = score >= 90;
		if(up90) {
			System.out.println("up90");
		}
		if (! up90) {
			System.out.println("!up90");
		}
		if (up90) {
			System.out.println("참");
		} else {
			// else는 위의 조건이 하나도 만족하지 않는 경우 무조건 실행
			System.out.println("거짓");
		}
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A");
		}
		if(score < 90 && score >=80) {
			System.out.println("90점 미만 80점 이상입니다");
			System.out.println("학점은 B");
		}
		if(score >= 90)
			System.out.println("학점은 A");
		
		else if (score < 90 && score >=80) {
		System.out.println("학점은 B");
	}
	
	
	//3은 짝수 인가?
	
	
		String a="abc"; 
		String b= "abc";
		//		if(a==b)
		if(a.equals(b)) {
			System.out.println("a와b가같다");
			
		} else {
			System.out.println("a와 b가다르다");
		}
		
		double rand= Math.random();
		System.out.println("rand: "+ rand);
		//		랜덤은 0이상 1미만이 나온다
		
		//주사위 1~6까지 
		
	
		
	}	
	}
	


