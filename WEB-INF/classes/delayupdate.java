
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class delayupdate extends HttpServlet{

Connection con;

 

	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();



String id=req.getParameter("id");
//String name=req.getParameter("name");
String batch=req.getParameter("batch");

String semester1due=req.getParameter("user1");
String semester2due=req.getParameter("user2");
String semester3due=req.getParameter("user3");

String semester1=req.getParameter("user1");
String semester2=req.getParameter("user2");
String semester3=req.getParameter("user3");
String d=req.getParameter("d");

out.println("<tr><td></td> </tr>");
Calendar calendar = new GregorianCalendar();
    
 int d1 = calendar.get(Calendar.SECOND);

out.println(" "+d1+" ");


try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root",""); 



  Statement stmt1=con.createStatement();
  ResultSet rs1=stmt1.executeQuery("select d,id,name,batch,semester1due from studentpaid where id="+id+" && batch="+batch+" ");


  while(rs1.next()){	
	//String d1=rs1.getString("d");
	 //String id=rs1.getString("id");
	 String name=rs1.getString("name");
	// String batch11=rs1.getString("batch");
	 //int batch1=new Integer(batch11).intValue();
	// int id1=new Integer(rs1.getInt("id")).intValue();
	
	//String delay_1=rs1.getString("semester1due");
	
	x.setName(name);

}


Statement stmt=con.createStatement();

stmt.executeUpdate("INSERT INTO studentpaid(d,id,name,batch,semester1due,semester2due,semester3due)VALUES("+d1+",\'"+id+"\',\'"+x.getName()+"\',\'"+batch+"\',\'"+semester1due+"\',\'"+semester2due+"\',\'"+semester3due+"\')  "); 


res.sendRedirect("/msged/servlet/studentpaiddis_del_update?id="+id+"&&batch="+batch+"");



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
