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

out.println("<html><body><table>");

out.println("<div align=top class=styles> <center><table width=500 height=0 border=0>");
out.println("<tr><td></td><td  class=style2 class=styles><center>Semester Final Examination  </center></td> </tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Department of Geography and Environment</center></td></tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Master in GIS for Environment & Development</center></td></tr>");
out.println("<tr> <td></td> <td  class=style1 ><center>Admit Card</center></td></tr>");
out.println("</table></center></div> "); 

out.println("<tr><td>  <table border=1><tr><td width="+200+" height="+150+">");



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

//out.println(" <div align=left><td><table border=1 > <tr><td width="+100+" height="+20+"><font color=blue>"+x.getTotal()+"</font></th></td></tr>");
//out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+y.getTotal()+"</font></td></tr>");
//out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+z.getTotal()+"</font></td></tr></table></td></div>");



   }

out.println("<div align=left><table width=200 height=300><tr><td> <img src=/msged/Slip/picture/"+x.getBid()+"/"+x.getMid()+".jpg width=150 height=150><br>Name: <font color=blue><b>"+x.getName()+"</b></font><br>Id:   <font color=blue><b>"+x.getMid()+" </b></font><br>Batch:  <font color=blue> <b>"+x.getBid()+"</b></font><br><br><br></td></tr></table></div>");



out.println("</td>");
}


catch(ClassNotFoundException cc){out.println("could not load Database Driver" +cc.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }


//..........................................................................................
out.println("<td>");
out.println(" <div align=right><table border=0 >");

out.println("<tr><td width="+100+" height="+20+"><font color=blue>Tuition Fees </font></th></td> <td width="+200+" height="+20+"  > Course Number   </td>   <td width="+100+" height="+20+">Trimester</td></tr> ");




try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");


Statement stmt1=con.createStatement();
ResultSet rs1=stmt1.executeQuery("select id,name,date,batch,year,course_semester1,course_semester2,course_semester3,trimester1,trimester2,trimester3,weber from studentinfo where id="+sid+" && batch="+b+" ");
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

String course_semester1=rs1.getString("course_semester1");
String course_semester2=rs1.getString("course_semester2");
String course_semester3=rs1.getString("course_semester3");
x.setCName(course_semester1);
y.setDat(course_semester2);
z.setCountry(course_semester3);


//out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+x.getTotal()+"</font></th></td> <td width="+200+" height="+20+"  > "+x.getCName()+"   </td>   <td width="+100+" height="+20+">"+trimester1+"</td></tr> ");
//out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+y.getTotal()+"</font></td><td width="+200+" height="+20+"> "+y.getDat()+"       </td>    <td width="+100+" height="+20+">"+trimester2+"</td></tr>");
//out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+z.getTotal()+"</font></td><td width="+200+" height="+20+">  "+z.getCountry()+"  </td>    <td width="+100+" height="+20+">"+trimester3+"</td></tr>");





}

//*******************************************************************************************


out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+x.getTotal()+"</font></th></td> <td width="+200+" height="+20+"  > "+x.getCName()+"   </td>   <td width="+100+" height="+20+">"+x.getUserEmail()+"</td></tr> ");
out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+y.getTotal()+"</font></td><td width="+200+" height="+20+"> "+y.getDat()+"       </td>    <td width="+100+" height="+20+">"+y.getStreet()+"</td></tr>");
out.println("<tr><td width="+100+" height="+20+"><font color=blue>"+z.getTotal()+"</font></td><td width="+200+" height="+20+">  "+z.getCountry()+"  </td>    <td width="+100+" height="+20+">"+z.getHolding()+"</td></tr>");



out.println("<tr> <td></td>  <td></td>   <td></td>  <td align=right> <br>Coordinator<br>MSGED Program </td></tr>");

		



out.println("</td></tr></table>");
out.println("</td>");

out.println("</tr></table>");



}

catch(ClassNotFoundException bb){out.println("could not load Database Driver" +bb.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }


//...........................................
out.println("<SCRIPT LANGUAGE=javascript>");
var message = "Accountant(MSGED Program)";
out.println(" function printpage() {window.print();} ");
out.println("</SCRIPT>");
out.println("<table align=left><tr><td class=font1><FORM> <INPUT TYPE=button VALUE=\" "+message+" \" onClick=\"printpage()\"></FORM></td></tr></table>");


out.println("</body>");




out.println("</html>");


//............................................


	}
}
