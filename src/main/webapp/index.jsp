<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="studentDb/register" method="post">
    姓名:<input type="text" name="name"> <br>
    年龄:<input type="text" name="age"> <br>
    <input type="submit" value="注册"> <br>
</form>
<hr>
<form action="studentDb/find" method="post">
    id:<input type="text" name="id"> <br>
    <input type="submit" value="查询"> <br>
</form>
<hr>
<a href="studentDb/count">查询员工总数</a>
</body>
</html>
