<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url = "/WEB-INF/jsp/header.jsp">
<c:param name = "headerTitle" value ="2: Models"/>
</c:import>
    <section id="main-content">

       <h1>Toy Department</h1><br/>
       <table class="table table-striped">
  <thead>
    <tr>
      <th></th>
      <th><a href = "productDetail?productId=${product.productId }"><img src = "img/toy-balls.jpg" style="width:10vw"/></a></th>
      <th><img src = "img/toy-car.jpg" style="width:10vw"/></th>
      <th><img src = "img/toy-gym.jpg" style="width:10vw"/></th>
      <th><img src = "img/toy-horse.jpg" style="width:10vw"/></th>
      <th><img src = "img/toy-snail.jpg" style="width:10vw"/></th>
      <th><img src = "img/toy-tricycle.jpg" style="width:10vw"/></th>
    </tr>
  </thead>
  <tbody>
  
  
  <tr>
   <th scope = "row" style = "padding-right: 30px"> </th>
	  <c:forEach var = "product" items = "${productList}">
		  <c:choose>
			  <c:when test="${product.topSeller == true }">
			  <td><p style ="color:red; font-size: 0.5em">BEST SELLER!</p></td>
		  	  </c:when>
			  <c:otherwise>
			  <td> </td>
			  </c:otherwise>
		  </c:choose>
	  </c:forEach>
  </tr>
    <tr>
      <th scope="row" style = "padding-right: 30;text-align: left">Name</th>
     
	      <c:forEach var = "product" items = "${productList}">
	      <td style = "background-color: lightgrey"><a href = "productDetail?productId=${product.productId }">${product.name}</a></td>
	      </c:forEach>
      
    </tr>
    <tr>
      <th scope="row" style = "padding-right: 30px;text-align: left">Rating</th>
     	<c:forEach var="product" items= "${productList}">
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
       		
       		<td class = "gray-background"><img src="${starRating }" style="width:5vw" /></td>
       		</c:forEach>
     
    </tr>
    <tr >
      <th scope="row" style="text-align: left;; padding-right: 30px">Mfr</th>
      <c:forEach var = "product" items = "${productList}">
	      <td style = "background-color: lightgrey">${product.manufacturer}</td>
	  </c:forEach>
	      
	<tr>
      <th scope="row" style="text-align: left; padding-right: 30px" >Price</th>
      <c:forEach var = "product" items = "${productList}">
	      <td style = "color:red">$${product.price}</td>
	  </c:forEach>
	      
	<tr>
      <th scope="row" style="text-align: left; padding-right: 30px" >Wt.in(lbs)</th>
      <c:forEach var = "product" items = "${productList}">
	      <td style = "background-color: lightgrey">${product.weightInLbs}</td>
	  </c:forEach>
  </tbody>
</table>
       
       
    </section>
</body>
</html>