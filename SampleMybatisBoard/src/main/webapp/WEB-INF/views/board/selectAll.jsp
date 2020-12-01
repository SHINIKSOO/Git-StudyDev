<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

tr,td{
border:1px solid
}
</style>
</head>
<body>
   
 <table style="border:1px solid">
  <tr>
  <th>번호</th><th>제목</th><th>작성자</th><th>작성시간</th>
  </tr>
  
  <tr>
  <c:forEach items="${vo}" var="vo">
  <td>${vo.bno}</td>
  <td>${vo.btitle}</td>
  <td>${vo.bid}</td>
  <td>${vo.bdate}</td>
  </c:forEach>
  
  </tr>
 
 
 </table>

</body>
</html>