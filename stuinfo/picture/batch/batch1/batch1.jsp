

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


 <%
String batch=request.getParameter("batch");
%>

 <%
String id=request.getParameter("id");
%>




<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 

 




<form action="/msged/servlet/upload" method="post" enctype="multipart/form-data">
<%
out.println("<input type=hidden name=batch value="+batch+"> ");
%>

<%
out.println("<input type=hidden name=id value="+id+"> ");
%>



<%
out.println("<input type=file name=filename> ");
%>

<input type=submit value=submit>
</form>




  </myprefix:MyMsg>
</body>
</html>
