import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class studentpaiddis_update_submit extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();


String id=req.getParameter("id");
String batch=req.getParameter("batch");
String name=req.getParameter("user");


out.println("<html><body><table border=1>");


try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");





    Statement stmt=con.createStatement();
stmt.executeUpdate("UPDATE studentpaid SET name=\'"+name+"\' WHERE id=\'"+id+"\' and batch=\'"+batch+"\' ");

res.sendRedirect("/msged/servlet/studentpaiddis_update?id="+id+"&batch="+batch+" ");



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
