<%-- <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%> 
<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<div style = "width:20%; height:50%;align-content: center">
<h3>What is your favorite color?</h3>
<c:url var = "page1URL" value = "/page1"/>
<form action = "${page1URL }" method = "POST">

<input type = "text" name = "color" id = "color"/>
<input type = "submit" class = "button primary" value = "Next"/>


</form>

</div>

</body>
</html>
 