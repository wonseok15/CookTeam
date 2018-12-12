package kr.or.cook.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.cook.vo.TestVO;

@Repository   //Repository는 구현체에서 쓰는건데 구현체를 만들지 않고 바로 인터페이스에서 처리하는방식 
public interface ITestDAO {
		public List<TestVO> selectTestList();
		public TestVO selectTest(String col1);
		
		
		public void insertTest(TestVO test);
		

}
