<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url value = "/customerSearch" var = "formAction"/>
<form action = "${formAction}" method = "GET">
<label for = "searchName">Enter a search name: </label>
<input type = "text" name = "searchName" id = "searchName"/>
<br>
<label for ="order">Select order: </label>
<select name = "order">
  <option value = "last_name">Last Name</option>
  <option value = "email">Email</option>
  <option value = "active">Active</option>
</select>
<br><br>
<input type = "submit" value = "search"/>
</form>
<br>

<table border = "1">
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Active</th>
  </tr>
  
  <c:forEach var = "customer" items = "${customers}">
  
  <tr>
    <td>${customer.firstName}</td>
    <td>${customer.email}</td>
    <c:choose>
      <c:when test="${customer.active}">
      <c:set var = "active" value = "Yes"/>
     </c:when>
     <c:otherwise>
      <c:set var = "active" value = "No"/>
     </c:otherwise>
   </c:choose>
    <td>${active}</td>
  </tr>
  </c:forEach> 
</table>

<%@include file="common/footer.jspf"%>