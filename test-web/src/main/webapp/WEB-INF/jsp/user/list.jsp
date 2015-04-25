<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gushunbin
  Date: 15-4-20
  Time: 下午5:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<a href="${pageContext.request.contextPath}/user/create">新增用户</a>
<table border="1" width="50%">
    <tr>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.userName}</td>
            <td>${user.realName}</td>
            <td><a href="${pageContext.request.contextPath}/user/update?username=${user.userName}">更新</a></td>
            <td><a href="${pageContext.request.contextPath}/user/delete?username=${user.userName}">删除</a></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
