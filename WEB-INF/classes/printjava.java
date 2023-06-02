
import java.util.*;
import java.io.*;
import java.text.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class windows extends HttpServlet{


public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{

Shoppingbean x=new Shoppingbean();
	
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body><table><tr><td>");
out.println("<title>");
out.println("Employee Home Page");
out.println("</TITLE>");

out.println("<SCRIPT LANGUAGE=javascript>");
out.println("<!--");
out.println("function open4() { a= window.open(\"/msged/servlet/admitcard?id="+183102+"&batch="+8+"\") } "); 
out.println("//-->");
out.println("</SCRIPT>");

out.println("<FORM> <INPUT TYPE=button VALUE=\"OpenWindows\" onClick=\"open4();\"></FORM>");



out.println("</td></tr></table><body><html>");





}
} 
