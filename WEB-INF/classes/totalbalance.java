import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class totalbalance extends HttpServlet{
Connection con=null;

public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();


Shoppingbean id_id=new Shoppingbean();


String batch1=req.getParameter("batch");
String year=req.getParameter("year");
String m1=req.getParameter("m1");
String m2=req.getParameter("m2");


out.println("<html><body>");
out.println("<table border=1 bgcolor=white>");

//out.println("<table border=1>");
out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td>Month<font color=blue><h4></h4></font></td> <td><font color=blue><h4>Year</h4></font></td>                    <td><font color=blue><h4> Name</h4></font></td>        <td><font color=blue><h4>Id</h4></font></td>     <td><font color=blue><h4>Batch</h4></font></td>   <td><font color=blue><h4>Ist Semester</h4></font></td>  <td><font color=blue><h4>2nd Semester</h4></font></td>    <td><font color=blue><h4>3rd Semester</h4></font></td>   <td><font color=blue><h4>Total Deposite</h4></font></td>  </tr>");
try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");


if(year.equals("2019") || year.equals("2020") || year.equals("2021") || year.equals("2022") || year.equals("2023") || year.equals("2024") || year.equals("2025") || year.equals("2026") || year.equals("2027") || year.equals("2028") || year.equals("2029") || year.equals("2030")){

   Statement stmt1=con.createStatement();
ResultSet rs=stmt1.executeQuery("select * from studentpaid where years=\'"+year+"\'and batch=\'"+batch1+"\' and month between \'"+m1+"\' and \'"+m2+"\' ");

while(rs.next()){
	String month=rs.getString("month");
	String years=rs.getString("years");
	String date=rs.getString("date");
	String name=rs.getString("name");
	String id=rs.getString("id");
	//int sid=new Integer(id).intValue();
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



double abc=s1+s2+s3;





out.println("<tr><td>"+date+"  </td> <td> "+month+" </td>  <td> "+years+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td>   <td>"+s1+"</td>   <td>"+s2+"</td>   <td>"+s3+"</td>  <td>"+abc+"</td>  </tr> ");


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

out.println("<tr><td>   </td>  <td>  </td> <td> </td> <td>  </td><td>  </td><td>  </td><td><font color=blue>Total= "+x.getTotal()+"</font></td><td><font color=blue>Total= "+y.getTotal()+"</font></td><td><font color=blue>Total= "+z.getTotal()+"</font><br></td><td><font color=blue>Total="+total+"  </font></td><td>  </td><td>  </td>  </tr> ");




}


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
out.println("</table></body></html>");






	}
}
