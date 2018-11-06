<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url = "/WEB-INF/jsp/header.jsp">
<c:param name = "headerTitle" value ="2: Models"/>
</c:import>
    <section id="main-content">
    
    <h1>Toy Department</h1>
    
<div style = "padding-left: 20px; padding-right: 20px">
<c:forEach var = "product" items = "${productList}">
<c:url var = "imageURL" value ="img/${product.imageName}"/>
	<div class="d-flex flex-row" style = "height: 200px">
	  <div class="p-2">
	   <a href = "productDetail?productId=${product.productId }"><img src = "${imageURL}" style = "width:200px"/></a>
	  </div>
	    <div class="p-2">
          <h4 style = "align:left">${product.name}</h4>
   		  <p>by ${product.manufacturer}</p>
   		  <p style = "">$${product.price}</p>
   		  <p>weight${product.weightInLbs}</p>
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
       			<img src="${starRating }" style="width:10vw" />
        </div>
  <div class="p-2">
   <c:if test="${product.topSeller == true }">
   <h4 style = "color:red">BEST SELLER!</h4>
   </c:if>
   
</div>
</div>
<hr>
</c:forEach>
</div>
    </section>
</body>
</html>