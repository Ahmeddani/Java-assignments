<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf" %>


    <div class="modal-dialog"> 
				<div class="loginmodal-container">
					<h1>Register here</h1><br>
				<c:set var="confirmarionURL" value="/confirmationPage"/>
				  <form:form action = "${confirmationURL}" method = "POST" modelAttribute="registration">
				  
				  <label for="firstName">First Name</label>
					<form:input path="firstName" /> 
					<form:errors path = "firstName" cssClass="error"/>
				  
				  <label for="lastName">Last Name</label>
					<form:input path="lastName" /> 
					<form:errors path = "lastName" cssClass="error"/>
				  
				  <label for="email">Email</label>
					<form:input path="email" /> 
					<form:errors path = "email" cssClass="error"/>
					<form:errors path = "emailMatching" cssClass="error"/>
				  
				  <label for="confirmEmail">Confirm Email</label>
					<form:input path="confirmEmail" /> 
					<form:errors path = "confirmEmail" cssClass="error"/>
				  
				  <label for="password">Password</label>
					<form:input path="password" type = "password"/> 
					<form:errors path = "password" cssClass="error"/>
					<form:errors path = "passwordMatching" cssClass="error"/>
				  
				  <label for="confirmPassword">Confirm Password</label>
					<form:input path="confirmPassword" type = "password"/> 
					<form:errors path = "confirmPassword" cssClass="error"/>
					
				  <label for="birthDate">Date of Birth</label>
					 <form:input path ="birthDate"/> 
					<form:errors path = "birthDate" cssClass="error"/> 
					<br><br>
					
					<label for="numberOfTickets">Number Of Tickets</label>
					<form:input path="numberOfTickets" /> 
					<form:errors path = "numberOfTickets" cssClass="error"/>
					<br><br>
					<input type="submit"  value="Register">
					
				  </form:form>
				</div>
			</div>
		  </div>   --%>
 
hii
<%@include file="common/footer.jspf" %>