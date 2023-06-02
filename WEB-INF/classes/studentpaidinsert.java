
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class studentpaidinsert extends HttpServlet{

Connection con;


	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();



String dat=req.getParameter("date");
String month=req.getParameter("month");
String name=req.getParameter("name");
String id=req.getParameter("id");
String batch=req.getParameter("batch");

String semester1=req.getParameter("semester1");

String semester1due=req.getParameter("semester1due");

String semester2=req.getParameter("semester2");
String semester2due=req.getParameter("semester2due");

String semester3=req.getParameter("semester3");
String semester3due=req.getParameter("semester3due");

String totaldue=req.getParameter("totaldue"); 
String totalpaid=req.getParameter("totalPaid");

   String stuid=req.getParameter("stuid");
 String stuname=req.getParameter("stuname"); 


String chequeno=req.getParameter("cheque_no");
String pay=req.getParameter("pay");
String bankname=req.getParameter("bankname");
String student=req.getParameter("student");

String totaltaka=req.getParameter("totaltaka");
String twenty_percent_deposite=req.getParameter("20percentdeposite");

String eighty_percent_deposite=req.getParameter("80percentdeposite");
String year=req.getParameter("year");
String passed=req.getParameter("passed");
String cgpa=req.getParameter("cgpa");

// 	course_semester1  trimester1

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root",""); 
Statement stmt=con.createStatement();
stmt.executeUpdate("INSERT INTO studentpaid(month,date,name,id,batch,semester1,semester1due,semester2,semester2due,semester3,semester3due,totaldue,totalpaid,stuid,stuname,chequeno,pay,bankname,student,totaltaka,twenty_percent_deposite,eighty_percent_deposite,years,passed,cgpa)VALUES(\'"+month+"\',\'"+dat+"\',\'"+name+"\',\'"+id+"\',\'"+batch+"\',\'"+semester1+"\',\'"+semester1due+"\',\'"+semester2+"\',\'"+semester2due+"\',\'"+semester3+"\',\'"+semester3due+"\',\'"+totaldue+"\',\'"+totalpaid+"\',\'"+stuid+"\',\'"+stuname+"\',\'"+chequeno+"\',\'"+pay+"\',\'"+bankname+"\',\'"+student+"\',\'"+totaltaka+"\',\'"+twenty_percent_deposite+"\',\'"+eighty_percent_deposite+"\',\'"+year+"\',\'"+passed+"\',\'"+cgpa+"\')  "); 
res.sendRedirect("/msged/stuinfo/account/checkframe/stupaid/insertform.jsp");

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
