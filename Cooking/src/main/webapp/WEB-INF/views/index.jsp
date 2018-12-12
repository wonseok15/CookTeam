<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./res/js/jquery-3.3.1.min.js"></script> 
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
<script>
$(document).ready(function(){
    $("p").click(function(){
        alert("The paragraph was clicked.");
    });
});
</script>
<title>Insert title here</title>
</head>
<body>
<p>Click on this paragraph.</p>
메인 테스트
</body>
</html>