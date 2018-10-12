<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <style type="text/css">
    a{
    text-decoration:none;
    color:black;
    }
    
    </style>
  </head>
  <body>
   <strong>HI ${student.name} ,</strong> <br/>
   <strong>HI ${student.age} ,</strong> 
        <table border="1" align="center" style="width:400px">
            <th>学生id</th>
        	<th>姓名</th>
        	<th>年龄</th>
        	 <th>课程</th>
        	<th>地址</th> 
        	<th>操作</th>
          <c:forEach var="st" items="${students }">
         	<tr>
         		<td>${st.id }</td>
         		<td>${st.name }</td>
         		<td>${st.age }</td>
         		 <td>${st.grade.gradeName}</td>
         		<td>${st.address.address }</td> 
         		<td><a href="deleteStudent?id=${st.id}">删除</a>&nbsp;&nbsp;<a href="updateStudent?id=${st.id}">修改</a></td>
         	</tr>
         	
         </c:forEach>
         </table>
  </body>
</html>
