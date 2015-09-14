<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
결과 페이지<br>
<%
	String name = request.getParameter("name");
	String pw = request.getParameter("pw");
	String size = request.getParameter("size");
//	String lang = request.getParameter("lang");
	String[] langs = request.getParameterValues("lang");
	String result = "";
	if(langs != null){
	for(String s : langs){
		result += s+" ";		
		}
	}else{
		result = "선택된 언어가 없습니다.";
	}
	String body = request.getParameter("body");
	String job = request.getParameter("job");
%>
이름 <%= name %><br>
암호 <%= pw %><br>
사이즈 <%= size %><br>
언어 <%= result %><br>
body <%=body %><br>
job <%= job %>
</body>
</html>