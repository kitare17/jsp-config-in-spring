<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<form:form action="showmess" modelAttribute="home">
    <form:input path="id" placeholder="lmao"></form:input>
    <form:errors path="id" ></form:errors>
    <br>
    <form:input path="homeName"></form:input>
    <form:errors path="homeName" ></form:errors>
    <br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>