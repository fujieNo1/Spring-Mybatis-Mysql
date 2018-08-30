<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/include/taglib.jsp" %>
<html>
<head>
    <title>用户</title>
</head>
<body>
<div>
<form method="post" action="${ctx}/user/save">

    <label>用户ID</label>
    <input type="text" name="id">

    <label>用户姓名</label>
    <input type="text" name="name">

    <label>用户密码</label>
    <input type="text" name="password">

    <input type="submit" value="保存">
</form>
</div>

</body>
</html>
