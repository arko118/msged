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



out.println("<style type=text/css>");

out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:red; color:yellow; font-size: 35px;color:blue; border: #feaaee solid 0px; } ");

out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:; color:yellow; font-size: 18px;color:blue; border: #feaaee solid 0px; } ");

out.println("</style> ");



out.println("<html><body>");

out.println("<table border=1><tr><td> ");




out.println("<div align=top class=styles> <table width=500 height=0 border=0>");
out.println("<tr><td></td><td  class=style2 class=styles><center>Semester Final Examination  </center></td> </tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Department of Geography and Environment</center></td></tr>");
out.println("<tr><td></td><td  class=style3 class=styles><center>Master in GIS for Environment & Development</center></td></tr>");
out.println("<tr> <td></td> <td  class=style1 ><center>Admit Card</center></td></tr>");
out.println("</table></div> "); 



out.println("<table border=0 width=100 height=125 align=top> ");

out.println("<tr>");



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




   }


out.println("<td>");
out.println("<table><tr>");
out.println("<td> <img src=/msged/Slip/picture/"+x.getBid()+"/"+x.getMid()+".jpg width=100 height=125><br>Name: <font color=blue><b>"+x.getName()+"</b></font><br>Id:   <font color=blue><b>"+x.getMid()+" </b></font><br>Batch:  <font color=blue> <b>"+x.getBid()+"</b></font></td></tr></table>");
out.println("</td>");



out.println("<td>");
out.println("<div> <table border=1>");

out.println("<tr><td>   <font color=blue>1st Semester</font></td> <td><font color=blue>2nd Semester</font></td> <td><font color=blue>3rd Semester</font>                 </td></tr>");

out.println("<tr> <td>          <font color=red>"+x.getTotal()+"</font></td> <td><font color=red>"+y.getTotal()+"</font></td> <td><font color=red>"+z.getTotal()+"</font>                    </td></tr>");









}


catch(ClassNotFoundException cc){out.println("could not load Database Driver" +cc.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }


//.....................................Right Side.....................................................




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
x.setTrimester1(trimester1);
y.setTrimester2(trimester2);
z.setTrimester3(trimester3);

String waiber=rs1.getString("weber");
x.setUserName(waiber);

String course_semester1=rs1.getString("course_semester1");
String course_semester2=rs1.getString("course_semester2");
String course_semester3=rs1.getString("course_semester3");
x.setCName(course_semester1);
y.setDat(course_semester2);
z.setCountry(course_semester3);


out.println("<tr>  <td>"+x.getCName()+"</td>        <td>"+y.getDat()+"</td>        <td>"+z.getCountry()+"</td> </tr>");
out.println("<tr> <td>"+x.getTrimester1()+"</td>   <td>"+y.getTrimester2()+"</td> <td>"+z.getTrimester3()+"</td> </tr>");




}

//*******************************************************************************************






out.println("<tr> <td>Waiver:</td>   <td></td> <td>"+x.getUserName()+"</td> </tr>");







out.println("</table></div>");

out.println("</td>");


out.println("</tr>");

out.println("</table><br><br>");







}


catch(ClassNotFoundException bb){out.println("could not load Database Driver" +bb.getMessage());}
catch(SQLException aa){out.println("SQLException cought"+aa.getMessage());}finally{try{if(con !=null)con.close();}catch(SQLException ignored){} }



out.println("</table>");




//...........................................
out.println("<SCRIPT LANGUAGE=javascript>");
var message = "Accountant(MSGED Program)";
out.println(" function printpage() {window.print();} ");
out.println("</SCRIPT>");
out.println("<table><tr><td class=font1><FORM> <INPUT TYPE=button VALUE=\" "+message+" \" onClick=\"printpage()\"></FORM></td> <td></td>      <td> </td> <td> </td><td>Coordinator<br>MSGED Program </td>  </tr></table>");


out.println("</body>");




out.println("</html>");


//............................................


	}
}
