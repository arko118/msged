
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class studentcourseinsert extends HttpServlet{

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
String semester1=req.getParameter("semester1");


String semester2=req.getParameter("semester2");

String semester3=req.getParameter("semester3");

String trimester1=req.getParameter("trimester1");
String trimester2=req.getParameter("trimester2");
String trimester3=req.getParameter("trimester3");

String weber=req.getParameter("weber");






try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root",""); 
Statement stmt=con.createStatement();


stmt.executeUpdate("INSERT INTO studentinfo(id,name,date,batch,year,course_semester1,course_semester2,course_semester3,trimester1,trimester2,trimester3,weber)VALUES(\'"+id+"\',\'"+name+"\',\'"+date+"\',\'"+batch+"\',\'"+year+"\',\'"+semester1+"\',\'"+semester2+"\',\'"+semester3+"\',\'"+trimester1+"\',\'"+trimester2+"\',\'"+trimester3+"\',\'"+weber+"\')"); 

res.sendRedirect("/msged/stuinfo/account/checkframe/stupaid/course.jsp");

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
