<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/include/taglib.jsp" %>
<html>
<head>
    <title>用户</title>
</head>
<body>
<div>
<table border="1" cellpadding="0">
    <tr>
    <th>id</th>
    <th>姓名</th>
    <th>密码</th>
    </tr>

    <c:forEach items="${userList}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.password}</td>
    </tr>
    </c:forEach>
</table>
</div>

<div>
    <img src="${ctxStatic}/images/touxiang.png" style="width:100px;">
</div>
</body>
</html>
