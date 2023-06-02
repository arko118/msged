import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class studentpaiddis_del_update extends HttpServlet{
Connection con=null;



public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();



res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<script>");
out.println("function openWin() {");
out.println(" function openWin() { window.open(https://www.w3schools.com, width=400,height=400);}  ");

out.println("</script> ");


out.println("<style type=text/css>");

out.println(".style1{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; text-decoration: none;  background-image: url(''); background-color:#ffe6ff; font-size: 17px;color:green; border: #feaaee solid 0px; }");


out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: red solid 4px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");



String sid=req.getParameter("id");

String b=req.getParameter("batch");

String delay1=req.getParameter("delay1");//x.setCName("semester1due");
String delay2=req.getParameter("delay2");//x.setName("semester2due");
String delay3=req.getParameter("delay3");//x.setCountry("semester3due");

//String d=req.getParameter("d");

out.println("<html><body><table border=1 align=left width=50%>");

//out.println("<tr><td><font color=blue><h4>Id</h4></font> "+milliseconds+", "+seconds+" </td> </tr>");

 // out.println("<tr><td><font color=blue><h4>Id</h4></font>  "+ (++iHitCounter) +"</td> </tr>");

  //out.println("<tr><td><font color=blue><h4>Id</h4></font>  "+ (++d) +"</td> </tr>");

 // Date d = new Date();
 // time = System.currentTimeMillis();
 // Calendar calendar = new GregorianCalendar();
    
     // int second = calendar.get(Calendar.SECOND);
      
      
 // out.println("<tr>  <td class=style1> "+second+" </td></tr>");

try{


Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost/accounttingdb","root","");

String semester1due="semester1due";
String semester2due="semester2due";
String semester3due="semester3due";

    Statement stmt=con.createStatement();
    
    if(semester1due.equals(delay1)){
    ResultSet rs1=stmt.executeQuery("select d,id,name,batch,semester1due from studentpaid where id="+sid+" && batch="+b+" ");



while(rs1.next()){	
	
	String d1=rs1.getString("d");
	 String id=rs1.getString("id");
	 String name1=rs1.getString("name");
	  String batch11=rs1.getString("batch");
	  int batch1=new Integer(batch11).intValue();
	 int id1=new Integer(rs1.getInt("id")).intValue();
	
	String delay_1=rs1.getString("semester1due");
	x.setPid(id1);
	x.setBid(batch1);
	x.setName(name1);
out.println("<tr>  <td class=style1> "+delay_1+" </td> <td> </td> <td> <a href=/msged/servlet/delet_delay?id="+id1+"&&batch="+batch1+"&&delay="+delay1+"&&del="+d1+">Del</a></td></tr> "); 

//out.println(" Show:"+x.getName()+" ");
}

}


if(semester2due.equals(delay2)){
    ResultSet rs2=stmt.executeQuery("select d,id,name,batch,semester2due from studentpaid where id="+sid+" && batch="+b+" ");
    
    
while(rs2.next()){	
	
	String d2=rs2.getString("d");
	// String id=rs2.getString("id");
	String name2=rs2.getString("name");
	  String batch22=rs2.getString("batch");
	  int batch2=new Integer(batch22).intValue();
	 int id2=new Integer(rs2.getInt("id")).intValue();
	
	String delay_2=rs2.getString("semester2due");
	x.setName(name2);
	x.setPid(id2);
	x.setBid(batch2);
out.println("<tr>  <td class=style1> "+delay_2+" </td> <td> </td> <td> <a href=/msged/servlet/delet_delay?id="+id2+"&&batch="+batch2+"&&delay="+delay2+"&&del="+d2+">Del</a></td></tr> "); 


}
}



if(semester3due.equals(delay3)){
    ResultSet rs3=stmt.executeQuery("select d,id,name,batch,semester3due from studentpaid where id="+sid+" && batch="+b+" ");
    
        
while(rs3.next()){	
	
	String d3=rs3.getString("d");
	// String id=rs2.getString("id");
	String name3=rs3.getString("name");
	  String batch33=rs3.getString("batch");
	  int batch3=new Integer(batch33).intValue();
	 int id3=new Integer(rs3.getInt("id")).intValue();
	
	String delay_3=rs3.getString("semester3due");
	x.setName(name3);
	x.setPid(id3);
	x.setBid(batch3);
out.println("<tr>  <td class=style1> "+delay_3+" </td> <td> </td> <td> <a href=/msged/servlet/delet_delay?id="+id3+"&&batch="+batch3+"&&delay="+delay3+"&&del="+d3+">Del</a></td></tr> "); 


}
    
    
}



out.println("</table>");
//..................................................................

//out.println(" "+ (++d) +" ");
//x.setCName("+ (++d) +");
out.println(" Show:"+x.getName()+" ");


out.println("<table border=1 align=right width=50%>");

out.println("<tr>");
out.println("<td><form action=/msged/servlet/delayupdate method=get>");
//out.println("<input type=hidden name=d value="+x.getCName()+"> ");
out.println("<input type=hidden name=id value="+x.getPid()+"> ");
out.println("<input type=hidden name=batch value="+x.getBid()+"> ");
out.println("<input type=hidden name=name value="+x.getName()+"> ");

out.println("First Semester:<input type=text name=user1 size=10>");





out.println("<input type=submit value=submit><br><br>");
out.println("</form>");
out.println("<td>");
out.println("</tr>");


out.println("<tr>");
out.println("<td><form action=/msged/servlet/delayupdate method=get>");
out.println("<input type=hidden name=id value="+x.getPid()+"> ");
out.println("<input type=hidden name=batch value="+x.getBid()+"> ");
out.println("<input type=hidden name=name value="+x.getName()+"> ");

out.println("Second Semester:<input type=text name=user2 size=10>");
out.println("<input type=submit value=submit><br><br>");
out.println("</form>");
out.println("<td>");
out.println("</tr>");



out.println("<tr>");
out.println("<td><form action=/msged/servlet/delayupdate method=get>");
out.println("<input type=hidden name=id value="+x.getPid()+"> ");
out.println("<input type=hidden name=batch value="+x.getBid()+"> ");
out.println("<input type=hidden name=name value="+x.getName()+"> ");

out.println("Third Semester:<input type=text name=user3 size=10>");
out.println("<input type=submit value=submit><br><br>");
out.println("</form>");
out.println("<td>");
out.println("</tr>");


out.println("</table>");


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
