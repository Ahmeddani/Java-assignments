<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<section style= "align-content: center">

<div style = "width:20%; height:50%">
<h3>What is your favorite soccer club?</h3>
<c:url var = "page3URL" value = "/page3"/>
<form action = "${page3URL }" method = "POST">

<input type="radio" name="club" value="Arsenal"> Arsenal<br>
<input type="radio" name="club" value="Manchester"> Manchester<br>
<input type="radio" name="club" value="Chelsea"> Chelsea<br>
<input type="radio" name="club" value="Liverpool"> Liverpool<br>

</selection>
<input type = "submit" class = "button primary" value = "Next"/>


</form>

</div>
</section>
</body>
</html>
 