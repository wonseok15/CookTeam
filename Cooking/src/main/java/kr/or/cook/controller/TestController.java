
package kr.or.cook.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.cook.dao.ITestDAO;
import kr.or.cook.vo.JsonModel;
import kr.or.cook.vo.TestVO;

@Controller
public class TestController {
	@Autowired //나중에 inject 로 바꾸기
	ITestDAO dao;

	@RequestMapping("/test.do")
	public String testHandler(Model model){
		model.addAttribute("data", dao.selectTestList()); //db 테스트
		
		testInsert();
		
		
		return "test";
	}
	
	
	
	public String testInsert(){
		TestVO test = new TestVO();
		test.setCol1("누");
		test.setCol2("나");
		
		dao.insertTest(test);
		
		return "test";
	}
	
	
	//json 방식으로 뿌려주기
		@RequestMapping(value="/jsonpost.do", produces="text/plain;charset=UTF-8")
		public @ResponseBody String jsonObj() throws JsonProcessingException{
			
			ObjectMapper mapper = new ObjectMapper();
			
			HashMap<String, String> jsonMap = new HashMap<>();
			jsonMap.put("json1", "안녕1");
			jsonMap.put("json2", "안녕2");
			jsonMap.put("json3", "안녕3");
			jsonMap.put("json4", "안녕4");
			jsonMap.put("json5", "안녕5");
			
			
			String responseString = mapper.writeValueAsString(jsonMap);
			
			System.out.println(responseString);
			
			return responseString;
			
		}
		
		@RequestMapping(value="/jsonajax", method = RequestMethod.GET)
		public String jsonajaxget(){
			
			return "jsonAjax";
		}
		
	   @RequestMapping(value="jsonajaxPost", method=RequestMethod.POST)
	   @ResponseBody
	   public String jsonajax(@RequestBody List<JsonModel> model){
		   System.out.println("jsonTest");
		   System.out.println(model.get(0).getJsonKey()+" : "+ model.get(0).getJsonValue());
		   String val = model.toString();
		   
		   
		   return "jsonAjax";
	   }
	
	
	
	
	
	
	
}
