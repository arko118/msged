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

String year=req.getParameter("year");


out.println("<html><body>");
out.println("<table border=1 bgcolor=lightgray>");

//out.println("<table border=1>");
out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td><font color=blue><h4>Month</h4></font></td><td><font color=blue><h4>Name</h4></font></td>                    <td><font color=blue><h4> Vouchernumber</h4></font></td>        <td><font color=blue><h4>Particulars</h4></font></td>     <td><font color=blue><h4>checknumber</h4></font></td>   <td><font color=blue><h4>Officecredit</h4></font></td>   <td><font color=blue><h4>Bankcredit</h4></font></td>   <td><font color=blue><h4>Year</h4></font></td> </tr>");
try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");


if(year.equals("2019") || year.equals("2020") || year.equals("2021") || year.equals("2022") || year.equals("2023") || year.equals("2024") || year.equals("2025") || year.equals("2026") || year.equals("2027") || year.equals("2028") || year.equals("2029") || year.equals("2030")){

   Statement stmt1=con.createStatement();
ResultSet rs1=stmt1.executeQuery("select * from studentpaid where years=\'"+year+"\' and month between 1 and 6 ");

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


out.println("<tr><td>"+date+"  </td> <td> "+month+" </td>  <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td><td> "+semester1+" </td><td> "+semester2+" </td><td> "+semester3+" </td><td> "+totalpaid+" </td><td> "+chequeno+" </td>  <td> "+bankname+" </td> <td> "+pass+" </td> <td> "+cgpa+" </td></tr> ");


}

out.println("<tr><td> </td> <td> </td> <td>  </td><td>  </td> <td> </td>  <td><font color=red>Total Expenditure of<br> January to June,"+x.getPid()+":</red> </td><td bgcolor=yellow>  "+y.getTotal()+"   </td> <td bgcolor=magenda> "+x.getTotal()+" </td><td> </td></tr> ");



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
