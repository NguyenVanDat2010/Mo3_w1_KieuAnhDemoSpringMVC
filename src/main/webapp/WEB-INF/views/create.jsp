<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: VCOM
  Date: 06/07/2020
  Time: 10:47 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${mess}
<c:form method="post" modelAttribute="student">
    <lable>Name</lable>
    <c:input path="name"></c:input>
    <input type="text" name="name">
    <lable>Address</lable>
    <input type="text" name="address">
    <input type="submit" value="Tao moi">

</c:form>
</body>
</html>
