import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class studentcourse extends HttpServlet{
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


out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td><font color=blue><h4>Year</h4></font></td><td><font color=blue><h4>Name</h4></font></td>    <td><font color=blue><h4>Id</h4></font></td>  <td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>semester1</h4></font></td>    <td><font color=blue><h4>semester2</h4></font></td>        <td><font color=blue><h4>semester3</h4></font></td>         <td><font color=blue><h4>Trimester</h4></font></td>        <td><font color=blue><h4>Weber</h4></font></td> </tr>");

try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");





    Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select id,name,date,batch,year,course_semester1,course_semester2,course_semester3,trimester1,trimester2,trimester3,weber from studentinfo where id="+sid+" && batch="+b+" ");

while(rs.next()){
	
	String year=rs.getString("year");
	String date=rs.getString("date");
	String name=rs.getString("name");
	String id=rs.getString("id");
	String batch=rs.getString("batch");

	String semester1=rs.getString("course_semester1");
	String semester2=rs.getString("course_semester2");
	String semester3=rs.getString("course_semester3");
	String trimester1=rs.getString("trimester1");
	String trimester2=rs.getString("trimester2");
	String trimester3=rs.getString("trimester3");
	String weber=rs.getString("weber");
	


out.println("<tr><td>"+date+"  </td> <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td>                                    <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester1="+semester1+"&trimester1="+trimester1+">"+semester1+"</a> </td> <td></td> <td></td> <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester1="+semester1+"&trimester1="+trimester1+">"+trimester1+"</a> </td>  </tr> ");

out.println("<tr><td>"+date+"  </td> <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td> <td></td>                <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester2="+semester2+"&trimester2="+trimester2+">"+semester2+"</a> </td> <td></td> <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester2="+semester2+"&trimester2="+trimester2+">"+trimester2+"</a> </td>  </tr> ");



out.println("<tr><td>"+date+"  </td> <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td>                                    <td></td> <td></td><td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester3="+semester3+"&trimester3="+trimester3+">"+semester3+"</a> </td> <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester3="+semester3+"&trimester3="+trimester3+">"+trimester3+"</a> </td>  </tr> ");





                //  <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&semester3=3"+semester3+"&trimester3=tr3>"+trimester3+"</a> </td>                                                          <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update.jsp?id="+id+"&batch="+batch+"&trimester1=tr1>"+trimester1+"</a> </td><td>  <td><a href=/msged/stuinfo/account/checkframe/stupaid/update/course_semester1_update?id="+id+"&batch="+batch+"&trimester3=tr3>"+trimester3+"</a> </td><td> "+weber+" </td> </tr> ");


}


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
