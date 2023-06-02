
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class student_thesis_insert extends HttpServlet{

Connection con;


	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();



String id=req.getParameter("id");
String name=req.getParameter("name");
String date=req.getParameter("date");
String batch=req.getParameter("batch");
String year=req.getParameter("year");


String istSupervisorName=req.getParameter("1st_Supervisor_Name");
String iind_Supervisor_Name=req.getParameter("2nd_Supervisor_Name");
String thesis=req.getParameter("thesis");

String pkg=req.getParameter("pkg");






try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root",""); 
Statement stmt=con.createStatement();


stmt.executeUpdate("INSERT INTO studentinfo(id,name,date,batch,year,1st_Supervisor_Name,2nd_Supervisor_Name,thesis_title,pkg)VALUES(\'"+id+"\',\'"+name+"\',\'"+date+"\',\'"+batch+"\',\'"+year+"\',\'"+istSupervisorName+"\',\'"+iind_Supervisor_Name+"\',\'"+thesis+"\',\'"+pkg+"\')"); 

res.sendRedirect("/msged/stuinfo/account/checkframe/stupaid/thesis_inrolled.jsp");
              
}
catch(ClassNotFoundException ss){
out.println("could not load Database Driver" +ss.getMessage());
		}
catch(SQLException aa){
out.println("SQLException cought"+aa.getMessage());
		}
finally{
	try{if(con !=null)con.close();
	   }
catch(SQLException ignored)
	{}

   }
}
} 
