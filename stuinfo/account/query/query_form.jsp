

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
 

 

<center><h4>Query</h4></center>
<form action="/msged/servlet/month_display" target="/msged/stuinfo/account/query/querywin.jsp" method="get" enctype="multipart/form-data">
<%
out.println("<center>Month:<input type=text name=month size=10 ></center> ");
%>
</center><input type=submit value=submit></center>
</form> 


<center><h4>Query</h4></center>
<form action="/msged/servlet/month_display" target="/msged/stuinfo/account/query/querywin.jsp" method="get" enctype="multipart/form-data">
<%
out.println("<center>date:<input type=text name=date size=10 ></center> ");
%>
<input type=submit value=submit></center>
</form> 
</center>
  </myprefix:MyMsg>
</body>
</html>
