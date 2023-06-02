
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class studentinsert extends HttpServlet{

Connection con;


	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();



String batch=req.getParameter("batch");

String id=req.getParameter("id");

String semester=req.getParameter("semester");


String month=req.getParameter("monthh");


String date=req.getParameter("datt");


String year=req.getParameter("years");
String name=req.getParameter("name");

String adminfee=req.getParameter("adminfee");
String developmentfee=req.getParameter("developmentfee");

String seminerlibraryfee=req.getParameter("seminerlibraryfee");

String tutionfee=req.getParameter("tutionfee");
String totaltk=req.getParameter("totaltk");
String stuaddress=req.getParameter("stuaddress");
String stumobile=req.getParameter("stumobile");




try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/studentdb","root",""); 
Statement stmt=con.createStatement();
stmt.executeUpdate("INSERT INTO student(batch,id,semester,monthh,datt,years,name,adminfee,developmentfee,seminerlibraryfee,tutionfee,totaltk,stuaddress,stumobile)VALUES(\'"+batch+"\',\'"+id+"\',\'"+semester+"\',\'"+month+"\',\'"+date+"\',\'"+year+"\',\'"+name+"\',\'"+adminfee+"\',\'"+developmentfee+"\',\'"+seminerlibraryfee+"\',\'"+tutionfee+"\',\'"+totaltk+"\',\'"+stuaddress+"\',\'"+stumobile+"\')  "); 
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