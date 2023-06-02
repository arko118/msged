import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class course_update_submit extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

String semester_one="1";
String semester_two="2";
String semester_three="3";


String trimester1_one="tr1";
String trimester2_two="tr2";
String trimester3_three="tr3";

String id=req.getParameter("id");
String batch=req.getParameter("batch");
String usr=req.getParameter("user");

String semester1=req.getParameter("semester1");
String semester2=req.getParameter("semester2");
String semester3=req.getParameter("semester3");

String trimester1=req.getParameter("trimester1");
String trimester2=req.getParameter("trimester2");
String trimester3=req.getParameter("trimester3");

String tr1=req.getParameter("tr1");
String tr2=req.getParameter("tr2");
String tr3=req.getParameter("tr3");



out.println("<html><body><table border=1>");


try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");


if(semester_one=="1")  { 
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET course_semester1=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' and trimester1=\'"+tr1+"\' ");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}

if(semester_two=="2"){
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET course_semester2=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' and trimester2=\'"+tr2+"\'");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}

if(semester_three=="3"){
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET course_semester3=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' and trimester3=\'"+tr3+"\'");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}



if(trimester1_one.equals(trimester1)){
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET trimester1=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' ");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}
if(trimester2_two.equals(trimester2)){
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET trimester2=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' ");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}
if(trimester3_three.equals(trimester3)){
    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentinfo SET trimester3=\'"+usr+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' ");
res.sendRedirect("/msged/servlet/studentcourse?id="+id+"&batch="+batch+" ");
}


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
