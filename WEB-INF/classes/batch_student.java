import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class batch_student extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();

Shoppingbean a=new Shoppingbean();
Shoppingbean b=new Shoppingbean();
Shoppingbean c=new Shoppingbean();

//String sid=req.getParameter("id");

String b1=req.getParameter("batch");

out.println("<html><body>");

out.println("<tr><td> <center><h2><font color=blue>Batch No:</font> <font color=red>"+b1+" </font> </h2> </center> </td></tr>");


out.println("<table><tr><td><table border=1>");

out.println("");

out.println("<tr><td><font color=blue>Id:</font></td> <td><font color=blue>Name:</font></td><td><font color=blue>Semester:1</font></td><td><font color=blue>Semester:2</font></td> <td><font color=blue>Semester:3</font></td> <td><font color=blue>Total</font></td></tr>");

//....................................................................................

try{

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

Statement stmt=con.createStatement();
//ResultSet rs=stmt.executeQuery("select month,years,date,name,id,batch,semester1,semester1due,semester2,semester2due,semester3,semester3due,totaldue,totalpaid,stuid,stuname,chequeno,pay,bankname,student,totaltaka,twenty_percent_deposite,eighty_percent_deposite,passed,cgpa from studentpaid where batch="+b1+" group BY id HAVING COUNT(*)>0");


//ResultSet rs=stmt.executeQuery("select id,name,SUM(semester1),SUM(semester2),SUM(semester3) from studentpaid where batch="+b1+" group BY id HAVING COUNT(*)>1");


ResultSet rs=stmt.executeQuery("select id,name,SUM(semester1),SUM(semester2),SUM(semester3) from studentpaid where batch="+b1+" group BY id HAVING COUNT(*)>0");

while(rs.next()){

	//String month=rs.getString("month");
	//String year=rs.getString("years");
	//String date=rs.getString("date");
	String name=rs.getString("name");
	String id=rs.getString("id");
	// int iid=new Integer(id).intValue();
	//String batch=rs.getString("batch");
	//int batch1=new Integer(batch).intValue();

	double s1=new Double(rs.getDouble("SUM(semester1)")).doubleValue();
	double s2=new Double(rs.getDouble("SUM(semester2)")).doubleValue();
	double s3=new Double(rs.getDouble("SUM(semester3)")).doubleValue();

  	 double total=s1+s2+s3;

	//double s1=new Double(rs.getDouble("semester1")).doubleValue();
	//double s2=new Double(rs.getDouble("semester2")).doubleValue();
	//double s3=new Double(rs.getDouble("semester3")).doubleValue();

x.setTotal(total);
a.setTotal(s1);
b.setTotal(s2);
c.setTotal(s3);
//double a1=new Double("+x.getTotal()+"+"+y.getTotal()+"+"+ z.getTotal()+");


//b.setTotal(a1);

out.println("<tr><td><font color=blue>"+id+"</font></td> <td><font color=blue>"+name+"</font></td><td><font color=blue>"+s1+"</font></td><td><font color=blue>"+s2+"</font></td> <td><font color=blue>"+s3+"</font></td> <td><font color=blue>"+total+"</font></td></tr>");


}


out.println("<tr><td><font color=blue></font></td> <td><font color=blue></font></td><td><font color=blue>"+a.getTotal()+"</font></td><td><font color=blue>"+b.getTotal()+"</font></td> <td><font color=blue>"+c.getTotal()+"</font></td> <td><font color=red>"+x.getTotal()+"</font></td></tr>");




out.println("<style type=text/css>");

out.println(".font1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:red; color:yellow; font-size: 9px;color:blue; border: #feaaee solid 0px; } ");


out.println(".style{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");

out.println(".styles{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");



out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:rgb(191, 0, 255); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none;   font-size: 15px;color: rgb(0,0,0); border: red solid 0px; } ");

out.println(".style3{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none;   font-size: 11px;color: rgb(0,0,0); border: red solid 0px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");

out.println("");




out.println("</table><table><tr><td align=right> <br><br><br><br>Coordinator<br>MSGED Program </td></tr></table></div></td>");
//out.println("</table><table><tr><td align=right> </td></tr></table></div></td>");
out.println("</tr>");
out.println("</table></div>");


out.println("</td></tr></table>");


out.println("<SCRIPT LANGUAGE=javascript>");
String message = "";
out.println(" function printpage() {window.print();} ");
out.println("</SCRIPT>");
out.println("<table><tr><td class=font1><FORM> <INPUT TYPE=button VALUE=\" "+message+" \" onClick=\"printpage()\"></FORM></td></tr></table>");




}

catch(ClassNotFoundException ss){out.println("could not load Database Driver" +ss.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }


//...........................................

out.println("</body>");

out.println("</html>");


//............................................


	}
}
