<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url = "/WEB-INF/jsp/header.jsp">
   <c:param name = "headerTitle" value ="3: Detail Views"/>
</c:import>
    
    <section id = "main-content">
   
    
<div class="d-flex flex-row">
  <div class="p-2"><img src = "img/${product.imageName}"/></div>
  <div class="p-2" style = "text-align: left">
    <div>
  	<h3>${product.name}</h3>
      <h4>by ${product.manufacturer}</h4>
      <c:choose>
       				<c:when test="${product.averageRating > 4.5 }">
       					<c:set var="starRating" value="img/5-star.png" />
       				</c:when>
       				<c:when test="${product.averageRating > 3.5 }">
       					<c:set var="starRating" value="img/4-star.png" />
       				</c:when>
       				<c:when test="${product.averageRating > 2.5 }">
       					<c:set var="starRating" value="img/3-star.png" />
       				</c:when>
       				<c:when test="${product.averageRating > 1.5 }">
       					<c:set var="starRating" value="img/2-star.png" />
       				</c:when>
       				<c:when test="${product.averageRating > 0.5 }">
       					<c:set var="starRating" value="img/1-star.png" />
       				</c:when>
       </c:choose>
       		<img src="${starRating }" style="width:7vw" />
    
       <h4 style = "color:darkred">Price: $${product.price}</h4>
       <h4>Weight ${product.weightInLbs} lbs</h4>
       </br>
       </div>
   <div class="p-2">
	   <c:if test="${product.topSeller == true }">
	   <h4 style = "color:red">BEST SELLER!</h4>
	   </c:if>
   </div>
       <div>
         <p>${product.description}</p>
       </div>
       </div>
   
       
  
  </div>
   
   

    </section>