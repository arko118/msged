import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class del_pkg extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();

Shoppingbean y=new Shoppingbean();

String id=req.getParameter("id");
String batch=req.getParameter("batch");

String pkg=req.getParameter("pkg");


String del=req.getParameter("del");
String delay=req.getParameter("delay");


out.println("<html><body>");
out.println("<table border=1 bgcolor=lightgray>");


//UPDATE `studentpaid` SET `semester1due`='' WHERE `batch`='10' and `id`='193122'
String d="0";

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

   Statement s=con.createStatement();
   
   
 s.executeUpdate("delete from studentinfo where id="+id+" and batch="+batch+" ");

 res.sendRedirect("/msged/servlet/update_pkg?pkg="+pkg+" ");
  
//s.executeUpdate("UPDATE studentpaid SET "+delay+"="123"  WHERE batch="+batch+" and id="+id+" ");

//s.executeUpdate(" update studentpaid SET "+delay+"=" "  WHERE batch="+batch+" and id="+id+" ");

//s.executeUpdate(" UPDATE `studentpaid` SET `semester1due`='' WHERE `batch`='"+batch+"' and `id`='"+id+"' ");
 //s.executeUpdate(" UPDATE `studentpaid` SET `"+delay+"`='' WHERE `batch`='"+batch+"' and `id`='"+id+"' and `d`='"+del+"'");
  
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
out.println("</table></body></html>");






	}
}
