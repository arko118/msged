

<%@ page import="java.sql.*" %>

<%@ page import="java.io.*" %>

<%@ page import="javax.servlet.*" %>

<%@ page import="javax.servlet.http.*" %>


<html>
<script>
function winopen(){
window.open("LINK LOCATION", "WINDOW NAME", "toolbar=yes,location=yes,directories=no,status=no, menubar=yes,scrollbars=yes,resizable=no,copyhistory=yes,width=200,height=260")
}
</script>





<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 

 

<center><h4>Password</h4></center>


<form action="/msged/servlet/stupsw" method="get" enctype="multipart/form-data">
<%
out.println("<center><input type=password name=psw ></center> ");
%>




<center><input type=submit value=submit></center>

</form> 




  </myprefix:MyMsg>
</body>
</html>
