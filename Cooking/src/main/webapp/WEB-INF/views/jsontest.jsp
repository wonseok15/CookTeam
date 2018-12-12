<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"  src="./res/js/jquery-3.3.1.min.js"></script>
<script>


$(function(){
	 var Obj = [{jsonKey: '키', jsonValue : '값'},{jsonKey: '키2', jsonValue: '값2'} ];
	 var jsonData = JSON.stringify(Obj); 
// 	 var jsonData = Obj.serialize(); 
	
	
	$('#btn').on('click', function(){
		
	alert(jsonData);
	  $.ajax({
		url: "jsonajaxPost",
		method : "POST",
		data: jsonData,
		contentType: "application/json;charset=UTF-8",
		success : function(resp){
			alert(JSON.stringify(resp));
		},
		error : function(xht, status){
			alert("실패" + xht.status);
		}
	  });
	});
  
});
	
</script>
<title>Insert title here</title>
</head>
<body>
<button id="btn" type="button">전송하기</button>



</body>
</html>