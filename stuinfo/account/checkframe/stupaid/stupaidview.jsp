

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

 <form action="/msged/servlet/total_stu_credit" target="/msged/stuinfo/account/checkframe/stupaid/window1.jsp" method="get" >
<%
out.println("<align=left><center><H3><font color=red>Total Debit:</font></h3> </center> </align>");
out.println("Year:...<input type=text  name=year size=5><br> ");
out.println("Month:<input type=text name=m1 size=3>To :<input type=text name=m2 size=3 >Month");

%>
<br><center><input type=submit value=submit><input type=reset value=reset></center>
</form> 


<br>

<form action="/msged/servlet/totalbalance" target="/msged/stuinfo/account/checkframe/stupaid/window1.jsp" method="get" >
<%
out.println("<align=left><center><H3><font color=red>Total Debit as Batch :</font></h3> </center> </align>");
out.println("Batch_No:<input type=text  name=batch size=5><br> ");
out.println("Month:......<input type=text name=m1 size=3>To :<input type=text name=m2 size=3 >Month");
out.println("<align=left><br>Year:........<input type=text name=year size=5></align> ");
%>
<br><center><input type=submit value=submit><input type=reset value=reset></center>
</form> 


<br>

<form action="/msged/servlet/studentpaiddis" target="/msged/stuinfo/account/checkframe/stupaid/window1.jsp" method="get" >
<%
out.println("<font color=blue>-----------------------------------------------------------</font> ");
out.println("<center>Batch_No:<input type=text name=batch size=3> ");
out.println("Student Id:<input type=text name=id size=3><input type=submit value=submit><input type=reset value=reset></center> ");
%>

</form> 

<form action="/msged/servlet/semesterdis" target="/msged/stuinfo/account/checkframe/stupaid/window1.jsp" method="get" >
<%
out.println("<font color=blue>-----------------------------------------------------------</font> ");
out.println("<center>Batch_No:<input type=text name=batch size=3> ");

out.println("Semester:<select name=semester size=1 ><option value=></option><option value=semester1>Semester1</option><option value=semester2>Semester2</option><option value=semester3>Semester3</option></select>");
out.println("<input type=submit value=submit><input type=reset value=reset></center> ");
%>

</form> 






<form action="/msged/servlet/batch_student" target="/msged/stuinfo/account/checkframe/stupaid/window1.jsp" method="get" >
<%
out.println("<font color=blue>-----------------------------------------------------------</font> ");
out.println("<center>Batch  No:      <input type=text    name=batch size=3><input type=submit value=submit><input type=reset value=reset></center> ");

%>

<center></center>

</form> 

  </myprefix:MyMsg>
</body>
</html>
