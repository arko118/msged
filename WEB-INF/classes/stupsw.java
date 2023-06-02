import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import java. text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;


public class stupsw extends HttpServlet{

Connection con;
	
public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

	
res.setContentType("text/html");
PrintWriter out=res.getWriter();

try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

Statement stmt=con.createStatement();

String stuid=req.getParameter("psw");



ResultSet rs=stmt.executeQuery("select id from psw where id="+stuid+" ");

	

while(rs.next()){
		String d2=new Integer(rs.getInt("id")).toString();
	int sid=new Integer(d2).intValue();
	
	if(d2.equals("111")){       
       	RequestDispatcher dd=req.getRequestDispatcher("/servlet/psw");
	dd.forward(req, res);
	 return;
         }

	
	if(d2.equals("9090")){       
      	RequestDispatcher dd1=req.getRequestDispatcher("/stuinfo/account/checkframe/checkframe.jsp"); 
	dd1.forward(req, res);
	 return;
	
         }

	if(d2.equals("333")){       
      	RequestDispatcher dd2=req.getRequestDispatcher("/stuinfo/account/checkframe/general.jsp"); 
	dd2.forward(req, res);
	 return;
	
         }



out.println("Sorry");
	
}	

	
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

out.println("<html><body><center><table><tr><td>");

out.println("</td></tr></table></center></body></html>");

}
	


} 
