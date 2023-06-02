import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class check_studentpaiddis extends HttpServlet{
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


out.println("<html><body><table border=1>");


out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td><font color=blue><h4>Month</h4></font></td><td><font color=blue><h4>Year</h4></font></td><td><font color=blue><h4>Name</h4></font></td>    <td><font color=blue><h4>Id</h4></font></td>  <td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>semester1</h4></font></td>    <td><font color=blue><h4>semester2</h4></font></td>        <td><font color=blue><h4>semester3</h4></font></td>         <td><font color=blue><h4>Totalpaid</h4></font></td>        <td><font color=blue><h4>Bank Deposite Slip</h4></font></td> <td><font color=blue><h4>Picture</h4></font></td>    <td><font color=blue><h4>Bank Name</h4></font></td> <td><font color=blue><h4>Passed</h4></font></td>   <td><font color=blue><h4>CGPA</h4></font></td></tr>");

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
	String batch=rs.getString("batch");

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


out.println("<tr><td>"+date+"  </td> <td> "+month+" </td>  <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td><td> "+semester1+" </td><td> "+semester2+" </td><td> "+semester3+" </td><td> "+totalpaid+" </td><td><a href=/msged/Slip/larger_image/check_imagelarger.jsp?id="+id+"&batch="+batch+"&month="+month+"> <img src=/msged/Slip/"+batch+"/"+id+"/"+month+".jpg width=75 height=50></a></td><td><a href=/msged/Slip/larger_image/check_imagelarger.jsp?id="+id+"&batch="+batch+"&month="+id+"> <img src=/msged/Slip/"+batch+"/"+id+"/"+id+".jpg width=75 height=50></a> </td> <td><a href=/msged/stuinfo/account/checkframe/upload_bank_slip.jsp?id="+id+"&batch="+batch+"&month="+month+"></a> </td> <td> "+bankname+" </td> <td> "+pass+" </td> <td> "+cgpa+" </td></tr> ");


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

out.println("<tr><td>   </td>  <td>  </td> <td> </td><td> </td> <td></td><td>  </td><td><font color=blue>Total= "+x.getTotal()+"</font><br><font color=red>Due:= "+duex+" </red></td><td><font color=blue>Total= "+y.getTotal()+"</font><br><font color=red>Due:= "+duey+" </red></td><td><font color=blue>Total= "+z.getTotal()+"</font><br><font color=red>Due:= "+duez+" </red></td><td><font color=blue>Total="+total+"  </font><br><font color=red>Due:= "+totaldue+" </red></td><td>  </td>  </tr> ");


out.println("</table></body></html>");

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
