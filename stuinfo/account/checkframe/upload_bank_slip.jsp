

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
String id=request.getParameter("id");
%>


 <%
String batch=request.getParameter("batch");
%>

<%
String month=request.getParameter("month");
%>



<%
out.println("<a href=/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+">Back</a>");
%>

<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 
<form action="/msged/servlet/image_update" method="post" enctype="multipart/form-data">

<%
out.println("<input type=hidden name=id value="+id+"> ");
%>

<%
out.println("<input type=hidden name=batch value="+batch+"> ");
%>
<%
out.println("<input type=hidden name=month value="+month+"> ");
%>

<%
out.println("<input type=file name=filename> ");
%>

<input type=submit value=submit>
</form>



<form action="/msged/servlet/image_update" method="post" enctype="multipart/form-data">

<%
out.println("<input type=hidden name=id value="+id+"> ");
%>

<%
out.println("<input type=hidden name=batch value="+batch+"> ");
%>
<%
out.println("<input type=hidden name=month value="+id+"> ");
%>

<%
out.println("<input type=file name=filename> ");
%>

<input type=submit value=Picture_submit>
</form>


  </myprefix:MyMsg>
</body>
</html>
