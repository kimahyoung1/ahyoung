package kr.or.human.emp.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.emp.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	private  SqlSessionFactory sqlMapper = null;
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDTO> selectEmp() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		return result;		
	}
	
	public  SqlSessionFactory getInstance() {
		if(sqlMapper == null) {
			try {
				String res = "mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(res);
				
				SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
				sqlMapper = ssfb.build(reader);
				
				reader.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return sqlMapper;
	}
	
	public int insertEmp(EmpDTO empDTO){
		int result = -1;
			try {
				result = sqlSession.insert("mapper.emp.insertEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
		
		
		return result;
	}
 
	
	public int updateEmp(EmpDTO empDTO){
		int result = -1;
		
		sqlMapper = getInstance();
		
		if(sqlMapper != null) {
			SqlSession sqlSession = sqlMapper.openSession(true);
			
			try {
				result = sqlSession.insert("mapper.emp.updateEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
			
		} else {
			System.out.println("DB 접속 실패");
		}
		
		return result;
	}
	public int deleteEmp(EmpDTO empDTO){
		int result = -1;
		
		sqlMapper = getInstance();
		
		if(sqlMapper != null) {
			SqlSession sqlSession = sqlMapper.openSession(true);
			
			try {
				result = sqlSession.insert("mapper.emp.deleteEmp", empDTO);
			} catch (Exception e) {
				sqlSession.rollback();
			}
			
		} else {
			System.out.println("DB 접속 실패");
		}
		
		return result;
	}
	
}
