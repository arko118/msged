import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class studentdis extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();



String sid=req.getParameter("id");
//String n=req.getParameter("name");
String b=req.getParameter("batch");


out.println("<html><body><table border=1>");


out.println("<tr><td><font color=blue><h4>Batch</h4></font></td> <td><font color=blue><h4>Roll/Id</h4></font></td>    <td><font color=blue><h4>Month</h4></font></td>  <td><font color=blue><h4>Date</h4></font></td>    <td><font color=blue><h4>Year</h4></font></td>    <td><font color=blue><h4>Name</h4></font></td>        <td><font color=blue><h4>Development Fee</h4></font></td>         <td><font color=blue><h4>Seminer Library Fee</h4></font></td>        <td><font color=blue><h4>Tution Fee</h4></font></td>        <td><font color=blue><h4>Total Taka</h4></font></td>    <td><font color=blue><h4>Sudent Address</h4></font></td>     <td><font color=blue><h4>Mobile Number</h4></font></td>  <td>Picture</td>   </tr>");

try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root","");





    Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select batch,id,semester,monthh,datt,years,name,adminfee,developmentfee,seminerlibraryfee,tutionfee,totaltk,stuaddress,stumobile from student where batch="+b+" ");

while(rs.next()){
	
	String batch=rs.getString("batch");
	String id=rs.getString("id");
	String month=rs.getString("monthh");
	String dat=rs.getString("datt");
	String year=rs.getString("years");
	String name=rs.getString("name");
	String developmentfee=rs.getString("developmentfee");
	String seminerlibraryfee=rs.getString("seminerlibraryfee");
	String tutionfee=rs.getString("tutionfee");
	String totaltk=rs.getString("totaltk");
	String stuaddress=rs.getString("stuaddress");	
       	String stumobile=rs.getString("stumobile");
	



out.println("<tr><td> "+batch+" </td>  <td> "+id+" </td> <td> "+month+" </td> <td> "+dat+" </td><td> "+year+" </td><td> "+name+" </td><td> "+developmentfee+" </td><td> "+seminerlibraryfee+" </td><td> "+tutionfee+" </td><td> "+totaltk+" </td><td> "+stuaddress+" </td><td> "+stumobile+" </td>   <td><iframe src=/msged/stuinfo/picture/batch/batch"+batch+"/"+id+".jpg frameborder=0 scrolling=no width=60 height=80 ></iframe></td>     </tr> ");

}
	


out.println("</table></body></html>");

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
