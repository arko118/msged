
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

<body bgcolor=lightyellow><table>

<tr>
<td ><font color=red>Sent to 0200008995709 Form</font>
<table width=420>
<form action=http://localhost:8080/msged/servlet/insert_bank  method=post>

 <tr><td align=left>Date<font color=white>..................</font>:<input type=text name="date" size="15"></td></tr>
 <tr><td align=left>Batch<font color=white>.................</font>:<input type=text name="batch" size="15"></td></tr>
 <tr><td align=left>Semester<font color=white>............</font>:<input type=text name="semester" size="15"></td></tr>
 
 <tr><td align=left>Cheque Number<font color=white>.</font>:<input type=text name="cheque" size="15"></td></tr>
 <tr><td align=left>Bankdebit<font color=white>..</font>:<input type=text name="bankdebit" size="15"></td></tr>

<tr><td align=left><input type=submit value=submit></td></tr><tr><td align=left><input type=reset value=Reset></td></tr>
</form>
</table>
</td>
</tr>

<tr>
<td>
<a href=/msged/servlet/showposted target=/msged/servlet/e808dis>Show Posted</a>
</td>
</tr>




</table>



</body>


</html>               


