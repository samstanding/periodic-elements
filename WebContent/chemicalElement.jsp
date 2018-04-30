<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="stylesheets/style.css" rel="stylesheet">
<title>Chemical Element</title>

</head>
<body>
	<div class="periodicTableBox ${chemicalElement.metalGroup}">
	<div class="centered">${chemicalElement.atomicNumber}</div>
	<div class="symbol">${chemicalElement.symbol}</div>
	<div class="centered">${chemicalElement.name }</div>
</div>
</body>
</html>