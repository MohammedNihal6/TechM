<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List"  %>
<%@ page import = "org.cms.MODEL.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All students</title>
</head>
<body>
<%  
try {
HttpSession oldsession=request.getSession(false);
List<Login> fetchedLogins=(List<Login>)oldsession.getAttribute("abc");
// project in a html table 

out.println(fetchedLogins);
}catch(Exception e){}
%>
</body>
</html>