import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class payment_status extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();


Shoppingbean p=new Shoppingbean();
Shoppingbean q=new Shoppingbean();
Shoppingbean r=new Shoppingbean();

String sid=req.getParameter("id");

String b=req.getParameter("batch");



out.println("<style type=text/css>");

out.println(".st{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; text-decoration: none;  background-image: url(''); background-color:#ffe6ff; font-size: 17px;color:green; border: #feaaee solid 0px; }");


out.println(".st2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:#ffe6ff; color:yellow; font-size: 10px;color: rgb(0,0,0); border: red solid 4px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");



out.println("<html><body>");

//out.println(" <div align=left> <img src=> </div>  <div align=center> <h16><b>Payment Receipt<b></h16><br>For<b><h20> MSGED</h20></b><b><h16>Program</h16></b>  </div>   <div align=right> </div> ");
out.println("<table width=100% class=st1>");



try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

Statement stmt1=con.createStatement();

ResultSet rs11=stmt1.executeQuery("select id,batch,SUM(semester1),SUM(semester2),SUM(semester3) from studentpaid where id="+sid+" and batch="+b+" group BY id HAVING COUNT(*)>0");



//ResultSet rs11=stmt.executeQuery("select id,batch,SUM(semester1),SUM(semester2),SUM(semester3) from studentpaid where id="+sid+" && batch="+b+" group BY id HAVING COUNT(*)>0");

//............................................................


   
//ResultSet rs11=stmt1.executeQuery("select month,years,date,name,id,batch,semester1,semester1due,semester2,semester2due,semester3,semester3due,totaldue,totalpaid,stuid,stuname,chequeno,pay,bankname,student,totaltaka,twenty_percent_deposite,eighty_percent_deposite,passed,cgpa from studentpaid where id="+sid+" && batch="+b+" ");

while(rs11.next()){
	String iid=rs11.getString("id");
	int id1=new Integer(iid).intValue();
	String batch1=rs11.getString("batch");
	 int batch11=new Integer(batch1).intValue();
	 
	 double p1=new Double(rs11.getDouble("SUM(semester1)")).doubleValue();
	double p2=new Double(rs11.getDouble("SUM(semester2)")).doubleValue();
	double p3=new Double(rs11.getDouble("SUM(semester3)")).doubleValue();
	 
	x.setAid(id1);
	x.setBid(batch11);
	p.setTotal(p1);
	q.setTotal(p2);
	r.setTotal(p3);
}
	
//...........................................................
out.println("<tr > <td> <div class=st align=center> <table width=100%><tr> <td width=33% align=left> <img src=/msged/Slip/picture/"+x.getBid()+"/"+x.getAid()+".jpg width=100 height=125> </td>   <td width=33% align=middle> <h10>Payment Receipt<br>for</h10><br><h10>MSGED Program<br>Department of Geography and Environment<br>Jahangirnagar University </td> <td width=33% align=right> <img src=/msged/stuinfo/admidcard/dpt.jpg width=100 height=125></td>      </tr></table></div> </td> </tr>");



out.println("<table border=1 width=100% class=st>");

out.println("<tr class=st> ");

out.println("<tr><td><font color=blue><h4>Date</h4></font></td><td><font color=blue><h4>Name</h4></font></td>    <td><font color=blue><h4>Id</h4></font></td>  <td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>semester1</h4></font></td>    <td><font color=blue><h4>semester2</h4></font></td>       <td><font color=blue><h4>semester3</h4></font></td>     <td><font color=blue><h4>Totalpaid</h4></font></td></tr>");

//try{


//Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");





    Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select month,years,date,name,id,batch,semester1,semester1due,semester2,semester2due,semester3,semester3due,totaldue,totalpaid,stuid,stuname,chequeno,pay,bankname,student,totaltaka,twenty_percent_deposite,eighty_percent_deposite,passed,cgpa from studentpaid where id="+sid+" && batch="+b+" ");

while(rs.next()){
	String month=rs.getString("month");
	String year=rs.getString("years");
	String date=rs.getString("date");
	String name=rs.getString("name");
	
	String iid=rs.getString("id");
	int id=new Integer(iid).intValue();
	
	String batch1=rs.getString("batch");
	 int batch=new Integer(batch1).intValue();
	 
	double s1=new Double(rs.getDouble("semester1")).doubleValue();
	double s2=new Double(rs.getDouble("semester2")).doubleValue();
	double s3=new Double(rs.getDouble("semester3")).doubleValue();
	
	

	String semester1=rs.getString("semester1");
	String d_semester1=rs.getString("semester1due");
	x.setCName(d_semester1);
	String semester2=rs.getString("semester2");
	String d_semester2=rs.getString("semester2due");
	x.setCountry(d_semester2);
	String semester3=rs.getString("semester3");
	String d_semester3=rs.getString("semester3due");
	x.setDivision(d_semester3);
	
	String totalpaid=rs.getString("totalpaid");
	String chequeno=rs.getString("chequeno");
	String bankname=rs.getString("bankname");
	String pass=rs.getString("passed");
	
	String cgpa=rs.getString("cgpa");

	x.setTotal(s1);
	y.setTotal(s2);
	z.setTotal(s3);
	x.setAid(id);
	x.setBid(batch);
	

	
	
out.println("<tr><td>"+date+"  </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td><td> "+semester1+" </td><td> "+semester2+" </td><td> "+semester3+" </td><td>  </td></tr> ");


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

out.println("<tr> <td> </td><td> </td> <td></td><td>  </td><td><font color=blue>Total= "+x.getTotal()+"</font><br><font color=red>Due:= "+duex+" </red></td><td><font color=blue>Total= "+y.getTotal()+"</font><br><font color=red>Due:= "+duey+" </red></td><td><font color=blue>Total= "+z.getTotal()+"</font><br><font color=red>Due:= "+duez+" </red></td><td><font color=blue>In Total="+total+"  </font><br><font color=red>Due:= "+totaldue+" </red></td>  </tr> ");
 

out.println("  </table>");

out.println("</table>");

//.................................................................................................


out.println("<style type=text/css>");

//out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:red; color:yellow; font-size: 17px;color: rgb(0,0,0); border: #feaaee solid 0px; } ");

out.println(".style1{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; text-decoration: none;  background-image: url(''); background-color:#ffe6ff; font-size: 17px;color:green; border: #feaaee solid 0px; }");


out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: red solid 4px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");

out.println("<SCRIPT LANGUAGE=javascript>");
String message = "Accountant";
out.println(" function printpage() {window.print();} ");
out.println("</SCRIPT>");

out.println("<table align=right><tr><td></td><td><font color=red>"+x.getCName()+"</font></td> <td><font color=red>"+x.getCountry()+"</font></td> <td><font color=red>"+x.getDivision()+"</font></td> </tr></table>");


out.println("<table align=center class=st2><center><tr><td> <b> GOOD TO KNOW</b> </td></tr></center>");

out.println("<tr><td><b>Payment to Bkash [If you have following causes]   </b></td></tr>");
out.println("<tr><td>Delay Fee................................................. 1000/-   </td></tr>");
out.println("<tr><td>Semester Drop Penalty Fee..................... 4200/-   </td></tr>");
out.println("<tr><td>Retake Exam Fee Per course...................4200/-   </td></tr>");
out.println("<tr><td>Especial Exam Fee.................................. 10000/-   </td></tr>");

out.println("</table");


out.println("<table align=left ><tr><td><img src=/msged/stuinfo/admidcard/r.jpg width=88 height=35></td></tr><tr><td class=font1><FORM> <INPUT TYPE=button VALUE=\" "+message+" \"  onClick=\"printpage()\"></FORM>MSGED Program</td> </tr><br>");

out.println("<tr><td ><font size=1>  &&  </font></td></tr><br>");
out.println("<tr><td ><font size=1>  Chief Experimental Officer </font> </td></tr><br>");
out.println("<tr><td ><font size=1>  Department Of Geography and Environment </font> </td></tr><br>");
out.println("<tr><td ><font size=1>  Jahangirnagar University </font> </td></tr><br>");
out.println("<tr><td ><font size=1>  Email:krislamju@yahoo.com </font> </td></tr>");

out.println("</table");

//..................................................................................................
 
out.println("<br><center><table align=bottom><tr><td><font size=1><b> Software Developed by Kazi Rafiqul Islam (Phone:01818634538 && 01963220853)</b></font></td> </tr></table></center>");

out.println("</body></html>");

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
