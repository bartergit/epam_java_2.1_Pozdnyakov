<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title1</title>
</head>
<body>
<%--  <form method="POST" enctype="multipart/form-data" action="controller">--%>
<%--    File to upload: <input type="file" name="upfile"><br/>--%>
<%--    <br/>--%>
<%--    <input type="submit" value="Press"> to upload the file!--%>
<%--  </form>--%>
<form method="GET" action="controller">
    <p>
        First value:
        <input type="number" name="value1"/>
    </p>
    <p>
        Second value
        <input type="number" name="value2"/>
    </p>
    <br>
    <input type="submit" value="Sum"/>
</form>
</body>
</html>
