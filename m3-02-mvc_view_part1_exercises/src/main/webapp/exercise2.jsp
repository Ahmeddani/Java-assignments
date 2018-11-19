<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		
		
		
		
			<c:set var="number" value="0" />
			<c:set var="lastNumber" value="1" />
			<c:forEach begin="1" end="25" var="numbers">
		    	<c:set var="temp" value="${number}" />
		    	<c:set var="number" value="${lastNumber + number}" />
		    	<c:set var="lastNumber" value="${temp}" />
		    	
		    	<li>${number}</li>
		      
	
		    </c:forEach>
		</ul>
	</body>
</html>