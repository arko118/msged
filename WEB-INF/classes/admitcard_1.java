import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class admitcard extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();

String sid=req.getParameter("id");

String b=req.getParameter("batch");

out.println("<html><body><table><tr><td>");
//....................................................................................
try{

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");


}
catch(ClassNotFoundException ss){out.println("could not load Database Driver" +ss.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }


//.....................................................................................
try{

Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select month,years,date,name,id,batch,semester1,semester1due,semester2,semester2due,semester3,semester3due,totaldue,totalpaid,stuid,stuname,chequeno,pay,bankname,student,totaltaka,twenty_percent_deposite,eighty_percent_deposite,passed,cgpa from studentpaid where id="+sid+" && batch="+b+" ");



while(rs.next()){

	String month=rs.getString("month");
	String year=rs.getString("years");
	String date=rs.getString("date");
	String name=rs.getString("name");
	String id=rs.getString("id");
int iid=new Integer(id).intValue();
	String batch=rs.getString("batch");
int batch1=new Integer(batch).intValue();

	double s1=new Double(rs.getDouble("semester1")).doubleValue();
	double s2=new Double(rs.getDouble("semester2")).doubleValue();
	double s3=new Double(rs.getDouble("semester3")).doubleValue();

	String semester1=rs.getString("semester1");
	String semester2=rs.getString("semester2");
	String semester3=rs.getString("semester3");
	String totalpaid=rs.getString("totalpaid");
	String chequeno=rs.getString("chequeno");
	String bankname=rs.getString("bankname");
	String pass=rs.getString("passed");
	
	String cgpa=rs.getString("cgpa");

	x.setTotal(s1);
	y.setTotal(s2);
	z.setTotal(s3);
x.setName(name);
x.setMid(iid);
x.setBid(batch1);
//..........................................................................................

Statement stmt1=con.createStatement();
ResultSet rs1=stmt1.executeQuery("select id,name,date,batch,year,semester1,semester2,semester3,trimester1,trimester2,trimester3,weber from studentinfo where id="+sid+" && batch="+b+" ");
while(rs1.next()){
String year1=rs1.getString("year");
x.setDivision(year1);

String trimester1=rs1.getString("trimester1");
String trimester2=rs1.getString("trimester2");
String trimester3=rs1.getString("trimester3");
x.setUserEmail(trimester1);
x.setStreet(trimester2);
x.setHolding(trimester3);

String waiber=rs1.getString("weber");
x.setUserName(waiber);

String course_semester1=rs1.getString("semester1");
String course_semester2=rs1.getString("semester2");
String course_semester3=rs1.getString("semester3");
x.setCName(course_semester1);
y.setDat(course_semester2);
z.setCountry(course_semester3);
}

//........................................................................................
}
double due1=38000;
double duex1 =x.getTotal() ;
double duex =due1-duex1;


double due2=40000;
double duey2 =y.getTotal() ;
double duey =due2-duey2;


double due3=40000;
double duez3 =z.getTotal() ;
double duez =due3-duez3;

double total=duex1+duey2+duez3;
double totaldue=118000-total;

x.getName();




out.println("<style type=text/css>");

out.println(".font1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:red; color:yellow; font-size: 9px;color:blue; border: #feaaee solid 0px; } ");


out.println(".style{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");

out.println(".styles{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");



out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:rgb(255,99,71); color:yellow; font-size: 30px;color:yellow; border: #feaaee solid 0px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none;   font-size: 15px;color: rgb(0,0,0); border: red solid 0px; } ");

out.println(".style3{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none;   font-size: 11px;color: rgb(0,0,0); border: red solid 0px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");

out.println("");

out.println("<table border=1><tr><td>");

out.println("<div></div>");


out.println("<div align=top class=styles> <center><table width=500 height=0 border=0>");
out.println("<tr><td></td><td  class=style2 class=styles><center>Semester Final Examination  </center></td> </tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Department of Geography and Environment</center></td></tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Master in GIS for Environment & Development</center></td></tr>");
out.println("<tr> <td></td> <td  class=style1 ><center>Admit Card</center></td></tr>");
out.println("</table></center></div> "); 



//**************************************************************************
//Left Side
out.println("<div> <table border=0 width=425 height=200>");
out.println("<tr><td> <div align=left><table width=200 height=300><tr><td> <img src=/msged/Slip/picture/"+x.getBid()+"/"+x.getMid()+".jpg width=150 height=150><br>Name: <font color=blue><b>"+x.getName()+"</b></font><br>Id:   <font color=blue><b>"+x.getMid()+" </b></font><br>Batch:  <font color=blue> <b>"+x.getBid()+"</b></font><br><br><br></td></tr></table></div></td>");



//Right Side
out.println("<td><div align=right><table border=1>");

out.println("<tr><td><table width=425 height=50 bgcolor=lightcyan border=1><tr><td><font color=blue> Semester Paid:</font></td><td>Course Number:</td>  <td>Trimester </td></tr></table> </td></tr>");

out.println("<tr><td><table width=425 height=50  ><tr><td > Semester1:<font color=blue>"+x.getTotal()+"</font></td><td >  "+x.getCName()+" </td>   <td >"+x.getUserEmail()+" </td></tr></table> </td></tr>");

out.println("<tr><td><table width=425 height=50  ><tr><td >Semester2:<font color=blue>"+y.getTotal()+" </font></td><td > "+y.getDat()+"  </td>    <td >"+x.getStreet()+" </td></tr></table> </td></tr>");

out.println("<tr><td><table width=425 height=50  ><tr><td > Semester3:<font color=blue>"+z.getTotal()+"</font></td><td > "+z.getCountry()+"</td>   <td >"+x.getHolding()+"</td></tr></table> </td></tr>");

out.println("<tr><td><table width=425 height=50  border=0><tr><td> Waiver:<font color=blue></font></td><td>Course No:"+x.getUserName()+"  </td></tr></table> </td></tr>");

out.println("</table><table><tr><td align=right> <br>Coordinator<br>MSGED Program </td></tr></table></div> </td>");

out.println("</tr>");
out.println("</table></div>");
//*******************************************************************************************

out.println("</td></tr></table>");


out.println("<SCRIPT LANGUAGE=javascript>");
var message = "Accountant(MSGED Program)";
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
