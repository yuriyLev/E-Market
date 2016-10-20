<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">  <!--support IE 9 or IE8 !-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="computer suppliers"> <!--for search engines!-->
    <title>Home page</title>
    <script src="resources/vendor/js/jquery-3.1.1.js"></script>
    <script src="resources/vendor/js/bootstrap.js"></script>
    <link href="resources/vendor/css/bootstrap.css" rel="stylesheet"/>
</head>
<body>
<h3>${msg}</h3>
<b>Current Time is</b>: <%=new Date() %>
</body>
</html>