package chap09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();

		m1.setName("김아영");
		m1.setAge(20);

		m2.setName("이정은");
		m2.setAge(22);

		m3.setName("김소원");
		m3.setAge(21);

		System.out.println(m1.getAge() > m2.getAge());

		MemberDTO m4 = compareMemberDTO(m1, m2);
		System.out.println(m4);

		// 실무에서 이렇게씀
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list); // 정렬 되지 않을때 출력한것

		// Comparator comp = new OrderBy( );

		// 상속받을것은 new하고 괄호 사이에 넣는다
		// 위의 new OrderBy( );와 아래의 코드는 완전히 같은 코드이다.
		// 아래방법을 익명객체라고 한다
		// 이름이 없는 클래스를 new하고
		// new( ) { }
		// 뭔가 클래스명을 적어야 할 것 같은곳에
		// interface를 적용
		// 단, 하난의 인터페이스만 사용할 수 있음
		// 이러면 그 인터페이스를 구현한 익명 클래스가 된다
		// 익명객체를 쓰는 이유는 클래스를 만들지 않기 위해서이다.

		Comparator comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO) o1;
				MemberDTO dto2 = (MemberDTO) o2;

				// 여기서 리턴은 양수인지 음수인지
				return dto1.getAge() - dto2.getAge();
				// return 0;
			}

		};

		Collections.sort(list, comp);
		System.out.println(list);

	}
	/**
	 * 기능 : 둘 중에 나이카 큰 MemberDTO를 돌려줌
	 * 
	 * @param MemberDTO,
	 *            MemberDTO
	 * @return MemberDTO
	 */

	// 나이가 많을 것을 꺼내서 돌려준다
	static MemberDTO compareMemberDTO(MemberDTO dto1, MemberDTO dto2) {
		// if(dto1.getAge( ) > dto2.getAge( )) {
		// return dto1;
		// }else {
		// return dto2;
		// }
		if (dto1.getAge() - dto2.getAge() > 0) {
			return dto1;
		} else {
			return dto2;
		}
	}
}