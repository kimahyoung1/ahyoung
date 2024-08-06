package chap09;

import java.util.Comparator;

public class OrderBy implements Comparator {
// 익명객체로 바꿀거임
	
	
//	Comparator comp = new OrderBy( ); 
//	이거랑 밑에거랑 같은거임
	
	@Override
	public int compare(Object o1, Object o2) {
		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
		
		
		// 여기서 리턴은 양수인지 음수인지 
		return  dto1.getAge( )- dto2.getAge( );
	}

	
}
