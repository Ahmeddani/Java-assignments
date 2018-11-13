<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf" %>

<!--  <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
 -->    	  <div class="modal-dialog">
				<div class="loginmodal-container">
					<h1>Login to Your Account</h1><br>
				<c:set var="confirmarionURL" value="/confirmationPage"/>
				  <form:form action = "${confirmationURL}" method = "POST" modelAttribute="login">
				  <label for="email">Email</label>
					<form:input path="email" /> 
					<form:errors path = "email" cssClass="error"/>
					<label for="password">Password</label>
					 <form:input path ="password" type = "password"/> 
					<form:errors path = "password" cssClass="error"/>
					<br><br>
					<input type="submit"  value="Login">
				  </form:form>
				</div>
			</div>
		  </div>  
		  
		  

<%@include file="common/footer.jspf" %>