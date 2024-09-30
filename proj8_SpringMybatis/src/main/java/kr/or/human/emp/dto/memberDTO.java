package kr.or.human.emp.dto;

import lombok.Data;

/*@Getter
@Setter
@ToString
@RequiredArgsConstructor //생성자
@EqualsAndHashCode*/
@Data
public class memberDTO {

	private String userId;
	private String userpw;
	private int age;
	
}
