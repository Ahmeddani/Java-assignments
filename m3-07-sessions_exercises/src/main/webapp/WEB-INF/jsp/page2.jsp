<c:import url = "/WEB-INF/jsp/common/header.jsp"/>

<section style= "align-content: center">
  <div style = "width:20%; height:50%">
  <h3>What is your favorite food?</h3>
    <c:url var = "page2URL" value = "/page2"/>
      <form action = "${page2URL }" method = "POST">

		<input type = "text" name = "food" id = "food"/>
		<input type = "submit" class = "button primary" value = "Next"/>
      </form>

   </div>
</section>
  </body>
</html>
 