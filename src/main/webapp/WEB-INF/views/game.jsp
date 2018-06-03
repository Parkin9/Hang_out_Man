<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: parkin9
  Date: 29.05.18
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://fonts.googleapis.com/css?family=Inconsolata:400,700&amp;subset=latin-ext" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
    <title>Hang out, Man!</title>
</head>
<body>

<div id="container">
    <div id="title">Hang out, Man!</div>
    <hr/>
    <div id="board"></div>
    <div id="picture">
        <img src="img/s0.jpg" alt=""/>
    </div>
    <div id="alphabet"></div>
    <div style="clear: both;"></div>
</div>

<input type="hidden" id="modelCodeword" value="${codeword}"/>
<script src="javascript/JScript.js"></script>
</body>
</html>
