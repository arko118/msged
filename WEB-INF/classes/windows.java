
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

out.println("<SCRIPT LANGUAGE=javascript>");

var message = "Print this Page";
out.println(" function printpage() {window.print();} ");

out.println("</SCRIPT>");
out.println("<FORM> <INPUT TYPE=button VALUE=\" "+message+" \" onClick=\"printpage()\"></FORM>");




out.println("</td></tr></table><body><html>");





}
} 
