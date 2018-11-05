<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url = "/WEB-INF/jsp/header.jsp">
<c:param name = "headerTitle" value ="2: Models"/>
</c:import>
    <section id="main-content">
  
  <div class = "container" style = "padding:70px;">
  <c:forEach var = "product" items = "${productList}">
  	<div class = "col1" style = "display:block">
  	
  	<div class = "image">
     <a href = "productDetail?productId=${product.productId}"><img src = "img/${product.imageName}" style = "width:290px"/></a>
     </div>
     <div class = "content">
     <h3>${product.name}
     
     <c:if test="${product.topSeller == true }">
			   <h4 style = "color:red; font-size:15px">BEST SELLER!</h4>
			   </c:if>
       		
     </h3>
     
     <p style = "font-size:1em">by ${product.manufacturer}</p>
     <p style = "color:red"> $${product.price}</p>
     <p> Weight ${product.weightInLbs} lbs</p>
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
       		
       		<img src="${starRating }" style="width:5vw" />
       		</div>
			   
   </div>
  
  
  </c:forEach>
  </div>
  <div class = "row2">
  
  
  
  </div>
   
    </section>
</body>
</html>