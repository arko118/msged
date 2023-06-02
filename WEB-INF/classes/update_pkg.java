import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class update_pkg extends HttpServlet{
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

String pkg1=req.getParameter("pkg");


out.println("<html><body><table border=1>");


out.println("<tr><td><font color=blue><h4>Id</h4></font></td> <td><font color=blue><h4>Date</h4></font></td><td><font color=blue><h4>Name</h4></font></td><td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>Thesis Title</h4></font></td>  <td><font color=blue><h4>1st_Supervisor_Name</h4></font></td>    <td><font color=blue><h4>2nd_Supervisor_Name</h4></font></td>  <td><font color=blue><h4>Packeg Number</h4></font></td></tr>");

try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

    Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select id,date,year,name,batch,course_semester1,course_semester2,course_semester3,trimester1,trimester2,trimester3,weber,thesis_title,passed,cgpa,1st_Supervisor_Name,2nd_Supervisor_Name,pkg from studentinfo where pkg="+pkg1+" ");

while(rs.next()){
	String id=rs.getString("id");
	String date=rs.getString("date");
	String year=rs.getString("year");
	String name=rs.getString("name");
	String batch=rs.getString("batch");

	String thesis_title=rs.getString("thesis_title");
	
	String ist_Supervisor_Name=rs.getString("1st_Supervisor_Name");
	String iind_Supervisor_Name=rs.getString("2nd_Supervisor_Name");
	
	String pakg=rs.getString("pkg");
	




out.println("<tr><td class=style1>"+id+"  </td> <td class=style1> "+date+" </td> <td class=style1> "+name+" </td> <td class=style1> "+batch+" </td><td class=style1> "+thesis_title+" </td><td class=style1> "+ist_Supervisor_Name+" </td><td class=style1> "+iind_Supervisor_Name+" </td> <td class=style1> "+pakg+" </td> <td> <a href=/msged/servlet/del_pkg?id="+id+"&batch="+batch+"&pkg="+pakg+" >Del</a></td></tr> ");


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



//out.println("function open4() { a= window.open(\"/msged/servlet/admitcard?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 

//out.println("function payment() { a= window.open(\"/msged/servlet/payment_status?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 


out.println("//-->");
out.println("</SCRIPT>");

//out.println("<FORM> <INPUT TYPE=button VALUE=\"Admit Card\" onClick=\"open4();\"></FORM>  <FORM> <INPUT TYPE=button VALUE=\"Payment Status\" onClick=\"payment();\"></FORM>");

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
