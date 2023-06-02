

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
 <%
String month=request.getParameter("month");
%>



<br><br><br><br><br><br>
<body onLoad="winopen()">


<myprefix:MyMsg>
 

 



<%
out.println("<center><a href=/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+"><img src=/msged/Slip/"+batch+"/"+id+"/"+month+".jpg width=800 height=700></a></center>");
%>

<%
out.println("<center><a href=/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+"><img src=/msged/Slip/"+batch+"/"+id+"/"+id+".jpg width=800 height=700></a></center>");
%>




  </myprefix:MyMsg>
</body>
</html>
