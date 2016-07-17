<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<%@page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />
<link rel="stylesheet" href="resources/css/bootstrap.min.css" type="text/css" />
</head>
<body>
	<tiles:insertAttribute name="content" />

	<script type="text/javascript" src="resources/js/jquery-3.1.0.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/script.js"></script>
</body>
</html>
