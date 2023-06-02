
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
 
<form action=/msged/servlet/course_update_submit method=get>


 <%
String id=request.getParameter("id");
%>

 <%
String batch=request.getParameter("batch");
%>
 <%
String batch=request.getParameter("batch");
%>

 <%
String semester1=request.getParameter("semester1");
%>
<%
String semester2=request.getParameter("semester2");
%>
<%
String semester3=request.getParameter("semester3");
%>

 <%
String trimester1=request.getParameter("trimester1");
%>
<%
String trimester2=request.getParameter("trimester2");
%>
<%
String trimester3=request.getParameter("trimester3");
%>


<%
out.println("<input type=hidden name=id value="+id+"> ");

out.println("<input type=hidden name=batch value="+batch+"> ");

out.println("<input type=hidden name=semester1 value="+semester1+"> ");
out.println("<input type=hidden name=semester2 value="+semester2+"> ");
out.println("<input type=hidden name=semester3 value="+semester3+"> ");

out.println("<input type=hidden name=trimester1 value="+trimester1+"> ");
out.println("<input type=hidden name=trimester2 value="+trimester2+"> ");
out.println("<input type=hidden name=trimester3 value="+trimester3+"> ");

out.println("Change Name:<input type=text name=user size=10>");

%>

<input type=submit value=submit>
</form>

  </myprefix:MyMsg>
</body>
</html>
