import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class thesis_display extends HttpServlet{
Connection con=null;





public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<script>");
out.println("function openWin() {");
out.println(" function openWin() { window.open(https://www.w3schools.com, width=400,height=400);}  ");

out.println("</script> ");



Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();

String sid=req.getParameter("id");

String b=req.getParameter("batch");

String pkg=req.getParameter("pkg");


out.println("<html><body><table border=1>");


out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td><font color=blue><h4>Month</h4></font></td><td><font color=blue><h4>Year</h4></font></td><td><font color=blue><h4>Name</h4></font></td>    <td><font color=blue><h4>Id</h4></font></td>  <td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>semester1</h4></font></td>   <td><font color=blue><h4>Drop</h4></font></td> <td><font color=blue><h4>semester2</h4></font></td>     <td><font color=blue><h4>Drop</h4></font></td>    <td><font color=blue><h4>semester3</h4></font></td>    <td><font color=blue><h4>Drop</h4></font></td>    <td><font color=blue><h4>Totalpaid</h4></font></td>        <td><font color=blue><h4>Bank Deposite Slip</h4></font></td> <td><font color=blue><h4>Picture</h4></font></td>    <td><font color=blue><h4>Bank Name</h4></font></td> <td><font color=blue><h4>Passed</h4></font></td>   <td><font color=blue><h4>CGPA</h4></font></td></tr>");

try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

    Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select id,date,year,name,batch,course_semester1,course_semester2,course_semester3,trimester1,trimester2,trimester3,weber,thesis_title,passed,cgpa,1st_Supervisor_Name,2nd_Supervisor_Name from studentinfo where id="+sid+" && batch="+b+" ");

while(rs.next()){
	String id=rs.getString("id");
	String date=rs.getString("date");
	String year=rs.getString("year");
	String name=rs.getString("name");
	String batch=rs.getString("batch");

	String thesis_title=rs.getString("thesis_title");
	
	String ist_Supervisor_Name=rs.getString("1st_Supervisor_Name");
	String iind_Supervisor_Name=rs.getString("2nd_Supervisor_Name");
	
	
	




out.println("<tr><td>"+id+"  </td> <td> "+date+" </td>  <td> "+year+" </td><td> "+name+" </td> <td> "+batch+" </td><td> "+thesis_title+" </td><td class=style1> "+ist_Supervisor_Name+" </td><td> "+iind_Supervisor_Name+" </td></tr> ");


}


//..................................................................

out.println("<style type=text/css>");

out.println(".style1{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; text-decoration: none;  background-image: url(''); background-color:#ffe6ff; font-size: 17px;color:green; border: #feaaee solid 0px; }");


out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: red solid 4px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");


//<input type="button" value="Delay for Semester2" onclick="openWin()">
 
 
//out.println("function openwin() { a= window.open(\"/msged/servlet/admitcard?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 

 

//.................................................................

   
out.println("</table>");

//.................................................................................................

//<FORM> <INPUT TYPE=button VALUE=\"Admit Card\" onClick=\"openwin();\"></FORM>  <FORM> <INPUT TYPE=button VALUE=\"Payment Status\" onClick=\"payment();\"></FORM>


//out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:#ffe6ff; color:yellow; font-size: 17px;color: rgb(0,0,0); border: #feaaee solid 0px; } ");

out.println("<SCRIPT LANGUAGE=javascript>");
out.println("<!--");



out.println("function open4() { a= window.open(\"/msged/servlet/admitcard?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 

out.println("function payment() { a= window.open(\"/msged/servlet/payment_status?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 


out.println("//-->");
out.println("</SCRIPT>");

out.println("<FORM> <INPUT TYPE=button VALUE=\"Admit Card\" onClick=\"open4();\"></FORM>  <FORM> <INPUT TYPE=button VALUE=\"Payment Status\" onClick=\"payment();\"></FORM>");

//..................................................................................................
 

out.println("</body></html>");

}

catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("SQLException cought"+aa.getMessage());
		}
finally{
	try{if(con !=null)
	
	con.close();
	   }
catch(SQLException ignored)
	{


}
 


}


	}
}
