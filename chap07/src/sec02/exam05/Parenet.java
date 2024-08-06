package sec02.exam05;

public class Parenet {
	public String field1 = "parent 의 field";
	
	public void method1(String field1) {
		System.out.println("parent의 method1 실행");
		this.field1=field1;
		System.out.println("전달인자 field1: " +field1 );
		System.out.println("필드 field1:"+ this.field1 );
	}
	}


