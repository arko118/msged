
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

<td>

<table>
<form action=http://localhost:8080/msged/servlet/pictureupdate target="/msged/stuinfo/studentquery/querydisplay.jsp" method=get>

 <tr><td align=left>Roll :</td><td align=right><input type=text name="roll" size=9></td></tr>
 <tr><td align=left>Batch:</td><td align=right><input type=text name="batch" size=9></td></tr>


<tr><td align=left><input type=submit value=submit></td><td align=left><input type=reset value=Reset></td></tr>
</form>




</table></td>


</center>
</tr>





<tr>
<td>








<font color=blue><h4>Insert</h4></font>
<table width=420>
<form action=http://localhost:8080/msged/servlet/studentinsert target="/msged/stuinfo/studentquery/querydisplay.jsp" method=get>

 <tr><td align=left>Batch :</td><td align=right><input type=text name="batch" size=35></td></tr>
 <tr><td align=left>Id/Roll:</td><td align=right><input type=text name="id" size=35></td></tr>

<tr><td align=left>S.S.C :</td><td align=right><input type=text name="ssc" size=35></td></tr>
<tr><td align=left>H.S.C :</td><td align=right><input type=text name="hsc" size=35></td></tr>
<tr><td align=left>B.Sc :</td><td align=right><input type=text name="bsc" size=35></td></tr>
<tr><td align=left>M.Sc :</td><td align=right><input type=text name="msc" size=35></td></tr>
<tr><td align=left>Board :</td><td align=right><input type=text name="board" size=35></td></tr>
<tr><td align=left>University :</td><td align=right><input type=text name="university" size=35></td></tr>


 <tr><td align=left>Semester :</td><td align=right><input type=text name="semester" size=35></td></tr>
 

 <tr><td align=left>Student Name :</td><td align=right><input type=text name="name" size=35></td></tr>
 <tr><td align=left>Admission Fee:</td><td align=right><input type=text name="adminfee" size=35></td></tr>

 <tr><td align=left>Development Fee :</td><td align=right><input type=text name="developmentfee" size=35></td></tr>
 <tr><td align=left>Seminar Fee:</td><td align=right><input type=text name="seminerlibraryfee" size=35></td></tr>

 <tr><td align=left>Tution Fee :</td><td align=right><input type=text name="tutionfee" size=35></td></tr>



 <tr><td align=left>Total Taka:</td><td align=right><input type=text name="totaltk" size=35></td></tr>


 <tr><td align=left>Bank Receive:</td><td align=right><input type=text name="bankreceive" size=35></td></tr>



 <tr><td align=left>Address :</td><td align=right><input type=text name="stuaddress" size=35></td></tr>
 <tr><td align=left>Mobile :</td><td align=right><input type=text name="stumobile" size=35></td></tr>





<tr><td align=left><input type=submit value=submit></td><td align=left><input type=reset value=Reset></td></tr>
</form>




</table>









</td>
</tr>





</table>



</body>


</html>               


