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
<form action="${pageContext.request.contextPath}/user/update" method="post"
        >
    用户名：<input type="text" name="userName" value="${command.userName}">
    真实姓名：<input type="text" name="realName" value="${command.realName}">
    <input type="submit" value="更新"/>
</form>

</body>
</html>
