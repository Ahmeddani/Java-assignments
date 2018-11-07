<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<section>

<div class = "lower">

<h3 style = "text-align: center">For Dummies Forum</h3>
 <h4 style = "text-align: center"><a href = "newReviewForm" >post a review</a></h4>
<c:set var = "count" value = "1"/>
<c:forEach var = "review" items = "${reviewList}">
 <c:choose>
 <c:when test="${count % 2 == 0}">
<div class = "column" style = "padding-left:20px; background-color:rgb(211,211,211)">
</c:when>
<c:otherwise>
<div class = "column" style = "padding-left:20px">
</c:otherwise>	
</c:choose>
<b><c:out value = "${review.title}"/></b><br>
by <c:out value = "${review.username}"/> on ${review.dateSubmitted}<br><br>
<c:out value = "${review.text}"/> <br>
<c:choose>
       				<c:when test="${review.rating > 4.5 }">
       					<c:set var="starRating" value="img/5-star.png" />
       				</c:when>
       				<c:when test="${review.rating > 3.5 }">
       					<c:set var="starRating" value="img/4-star.png" />
       				</c:when>
       				<c:when test="${review.rating > 2.5 }">
       					<c:set var="starRating" value="img/3-star.png" />
       				</c:when>
       				<c:when test="${review.rating > 1.5 }">
       					<c:set var="starRating" value="img/2-star.png" />
       				</c:when>
       				<c:when test="${review.rating > 0.5 }">
       					<c:set var="starRating" value="img/1-star.png" />
       				</c:when>
       			</c:choose>
       			<img src="${starRating }" style="width:10vw" />
</div>
<br>

<c:set var = "count" value = "${count +1}"/>
</c:forEach>


</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>