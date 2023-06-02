
<html>
<script Language="JavaScript">
<!-- Begin
function regular1() {
window.open('http://localhost:8080/Attendence/group.html','600x300','toolbar=,status=,scrollbars=yes,location=,menubar=yes,directories=,width=600,height=300')}



// End -->

function winopen1 () {
msg=open("","","toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,copyhistory=no,width=300,height=300");
msg.location = "http://localhost:8080/servlet/ist"

}

</script>

<body bgcolor=lightyellow><table border=><tr>

<td align=left>

<form>
Display
<a href="/msged/servlet/allstudentdis" target="/msged/stuinfo/studentquery/querydisplay.jsp" ><h5><i><font color=blue>All_Student</font></i></h5></a>

</form>

</td>
<td>
<table>
<form action=http://localhost:8080/msged/servlet/studentdis target="/msged/stuinfo/studentquery/querydisplay.jsp" method=get>

 <tr><td align=left></td><td align=right></td></tr>
 <tr><td align=left>Batch:</td><td align=right><input type=text name="batch" size=9></td></tr>


<tr><td align=left><input type=submit value=submit></td><td align=left><input type=reset value=Reset></td></tr>
</form>




</table></td>


</center>
</tr></table>



</body>


</html>               


