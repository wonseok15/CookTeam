package kr.or.cook.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.cook.vo.TestVO;

//@Repository 구현체를 만들어서 사용할 경우
public class TestDAOImpl implements ITestDAO {
	@Autowired
	SqlSessionTemplate template;
	
	@Override
	public List<TestVO> selectTestList() {
//		template.insert(statement)
//		template.update(statement)
//		template.delete(statement)
//		template.select(statement, handler); 이런형태로 사용해도 된다. 아니면 밑에 처럼 Mapper를 이용해서 바로 넘겨줄수도 있다.
		
		ITestDAO mapper = template.getMapper(ITestDAO.class);
		return mapper.selectTestList();
		
	}


	@Override
	public TestVO selectTest(String col1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insertTest(TestVO test) {
		ITestDAO mapper = template.getMapper(ITestDAO.class);
		mapper.insertTest(test);
		
	}

}
