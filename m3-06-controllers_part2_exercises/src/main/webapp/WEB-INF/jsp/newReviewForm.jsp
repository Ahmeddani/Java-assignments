<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<section>
<c:url value = "/reviewOutput" var = "formAction"/>
<form action="${formAction }" method = "POST">
<div class = "formInput">
<h3 style = "text-align:center">New Dummy review</h3>
<label for = "username">Username: </label>
<input type= "text" id = "username" name = "username" />
	<br><br>
<label for = "title">Title: </label>
<input type= "text" id = "title" name = "title"/>
	<br><br>
<label for = "text">Message: </label>
<input type= "text" id = "text" name = "text"/>
	<br><br>
<label for = "rating"> Rating: </label>
  <select name = "rating" id = "rating">
   <option value = "1">1-star</option>
   <option value = "2">2-star</option>
   <option value = "3">3-star</option>
   <option value = "4">4-star</option>
   <option value = "5">5-star</option>
  </select>
  <br>
<input type = "submit" value ="Submit" />
</div>

</form>

</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>