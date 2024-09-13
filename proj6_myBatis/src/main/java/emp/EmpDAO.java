package emp;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class EmpDAO {

	private SqlSessionFactory sqlMapper = null;

	public SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				// sqlmap을 읽어오는 소스
				String res = "mybatis/SqlMapConfig.xml";
				// 글씨를 읽는것들은 read라고 붙인다
				Reader reader = Resources.getResourceAsReader(res);

				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				sqlMapper = ssfb.build(reader);

				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return sqlMapper;
	}

	public List<EmpDTO> selectEmp() {
		List<EmpDTO> empList = null;

		// 얘가하는 역할
		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			// openSession = 디비와의 접속을 시도
			SqlSession sqlSession = sqlMapper.openSession();

			// 실행방법
			// sqlSession 얘가 갖고있던 mapper.emp.selectAllEmp 를 가져와라
			empList = sqlSession.selectList("mapper.emp.selectAllEmp");
			System.out.println("empList.size:" + empList.size());
		} else {
			System.out.println("DB 접속 실패");
		}

		return empList;
	}

	public List<Map> selectAllEmpMap() {
		List<Map> empList = null;

		// 얘가하는 역할
		// SqlMapConfig.xml을 읽어옴
		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			// openSession = 디비와의 접속을 시도
			SqlSession sqlSession = sqlMapper.openSession();

			// 실행방법
			empList = sqlSession.selectList("mapper.emp.selectAllEmpMap");
			System.out.println("empList.size:" + empList.size());
		} else {
			System.out.println("DB 접속 실패");
		}

		return empList;
	}

	public EmpDTO selectOneEmp() {
		EmpDTO empDTO = null;

		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			SqlSession sqlSession = sqlMapper.openSession();
			try {
				// 실행방법
				empDTO = (EmpDTO) sqlSession
						.selectOne("mapper.emp.selectOneEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return empDTO;
	}

	public int selectTotalEmp() {
		int total = -1;
		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			SqlSession sqlSession = sqlMapper.openSession();
			try {
				// 실행방법
				total = (int) sqlSession.selectOne("mapper.emp.selectTotalEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return total;
	}

	public String selectEnameEmp() {
		String ename = null;
		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			SqlSession sqlSession = sqlMapper.openSession();
			try {
				// 실행방법
				ename = (String) sqlSession
						.selectOne("mapper.emp.selectEnameEmp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패 ");
		}

		return ename;
	}

	public int updateEmp(EmpDTO empDTO) {
		int result = -1;

		// sqlMapper = getInstance();

		if (sqlMapper != null) {

			// DB접속
			// 자동커밋 : sqlMapper = getInstance();
			// 수동커밋 : sqlMapper = getInstance(false));
			SqlSession sqlSession = sqlMapper.openSession(false);
			try {
				// 실행방법
				result = sqlSession.update("mapper.emp.updateEmp", empDTO);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패 ");
		}

		return result;
	}
	

	public EmpDTO selectEmpByEname(String ename) {
		EmpDTO empDTO = null;

		sqlMapper = getInstance();
		if (sqlMapper != null) {

			// DB접속
			SqlSession sqlSession = sqlMapper.openSession();
			try {
				// 실행방법
				empDTO = (EmpDTO) sqlSession
						.selectOne("mapper.emp.selectEmpByEname",ename);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("DB 접속 실패");
		}

		return empDTO;
	}
}