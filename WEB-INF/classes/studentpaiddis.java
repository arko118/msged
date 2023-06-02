import java.text.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class studentpaiddis extends HttpServlet{
Connection con=null;





public void doGet(HttpServletRequest req , HttpServletResponse res)
throws ServletException, IOException{


res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<script>");
out.println("function openWin() {");
out.println(" function openWin() { window.open(https://www.w3schools.com, width=400,height=400);}  ");

out.println("</script> ");



Shoppingbean x=new Shoppingbean();
Shoppingbean y=new Shoppingbean();
Shoppingbean z=new Shoppingbean();

String sid=req.getParameter("id");

String b=req.getParameter("batch");


out.println("<html><body><table border=1>");


out.println("<tr><td><font color=blue><h4>Date</h4></font></td> <td><font color=blue><h4>Month</h4></font></td><td><font color=blue><h4>Year</h4></font></td><td><font color=blue><h4>Name</h4></font></td>    <td><font color=blue><h4>Id</h4></font></td>  <td><font color=blue><h4>Batch</h4></font></td>    <td><font color=blue><h4>semester1</h4></font></td>   <td><font color=blue><h4>Drop</h4></font></td> <td><font color=blue><h4>semester2</h4></font></td>     <td><font color=blue><h4>Drop</h4></font></td>    <td><font color=blue><h4>semester3</h4></font></td>    <td><font color=blue><h4>Drop</h4></font></td>    <td><font color=blue><h4>Totalpaid</h4></font></td>        <td><font color=blue><h4>Bank Deposite Slip</h4></font></td> <td><font color=blue><h4>Picture</h4></font></td>    <td><font color=blue><h4>Bank Name</h4></font></td> <td><font color=blue><h4>Passed</h4></font></td>   <td><font color=blue><h4>CGPA</h4></font></td></tr>");

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
	
	String delay1=rs.getString("semester1due");
	String delay2=rs.getString("semester2due");
	String delay3=rs.getString("semester3due");
	
	x.setCName("semester1due");
	x.setName("semester2due");
	x.setCountry("semester3due");
	
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






out.println("<tr><td>"+date+"  </td> <td> "+month+" </td>  <td> "+year+" </td><td> "+name+" </td> <td> "+id+" </td> <td> "+batch+" </td><td> "+semester1+" </td><td class=style1> "+delay1+" </td><td> "+semester2+" </td><td class=style1> "+delay2+"</td> <td> "+semester3+" </td> <td class=style1> "+delay3+"</td> <td> "+totalpaid+" </td><td><a href=/msged/Slip/larger_image/imagelarger.jsp?id="+id+"&batch="+batch+"&month="+month+"> <img src=/msged/Slip/"+batch+"/"+id+"/"+month+".jpg width=75 height=50></a></td><td><a href=/msged/Slip/larger_image/imagelarger.jsp?id="+id+"&batch="+batch+"&month="+id+"> <img src=/msged/Slip/"+batch+"/"+id+"/"+id+".jpg width=75 height=50></a> </td> <td><a href=/msged/stuinfo/account/checkframe/upload_bank_slip.jsp?id="+id+"&batch="+batch+"&month="+month+">Upload_Bank_Deposite_Slip</a> </td> <td> "+bankname+" </td> <td> "+pass+" </td> <td> "+cgpa+" </td></tr> ");


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

//..................................................................

out.println("<style type=text/css>");

out.println(".style1{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; text-decoration: none;  background-image: url(''); background-color:#ffe6ff; font-size: 17px;color:green; border: #feaaee solid 0px; }");


out.println(".style2{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-color:red; color:yellow; font-size: 20px;color: rgb(0,0,0); border: red solid 4px; } ");

out.println(".btop{background-image: url(''); border-top: 1px solid #0066001;} ");
out.println(".bimage1{background-image: url('/shopping/image/pro_manu.jpg'); border: 0px ridge light;font-size: 13px;} ");
out.println(" ");
out.println(" ");
out.println("</style> ");


//<input type="button" value="Delay for Semester2" onclick="openWin()">
 
 
//out.println("function openwin() { a= window.open(\"/msged/servlet/admitcard?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 

 

//.................................................................
out.println("<tr><td>   </td>  <td>  </td> <td> </td><td> </td> <td></td><td>  </td>");



out.println(" <td><font color=blue>Total= "+x.getTotal()+"</font><br><font color=red>Due:= "+duex+" </red></td>  <td> <SCRIPT LANGUAGE=javascript> function opens1_win() { a= window.open(\"/msged/servlet/studentpaiddis_del_update?id="+sid+"&&batch="+b+"&&delay1="+x.getCName()+"\",\"myName0\",\"width=400,height=380,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") }  </SCRIPT>  <FORM> <INPUT TYPE=button VALUE=\"Drop\" onClick=\"opens1_win();\"></FORM>  </td>  ");   
   
 

 out.println(" <td><font color=blue>Total= "+y.getTotal()+"</font><br><font color=red>Due:= "+duey+" </red></td>  <td> <SCRIPT LANGUAGE=javascript> function opens2_win() { a= window.open(\"/msged/servlet/studentpaiddis_del_update?id="+sid+"&&batch="+b+"&&delay2="+x.getName()+"\",\"myName0\",\"width=400,height=380,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") }  </SCRIPT>  <FORM> <INPUT TYPE=button VALUE=\"Drop\" onClick=\"opens2_win();\"></FORM>  </td>  ");   
   
        
     out.println("<td><font color=blue>Total= "+z.getTotal()+"</font><br><font color=red>Due:= "+duez+" </red></td>  <td> <SCRIPT LANGUAGE=javascript> function opens3_win() { a= window.open(\"/msged/servlet/studentpaiddis_del_update?id="+sid+"&&batch="+b+"&&delay3="+x.getCountry()+"\",\"myName0\",\"width=400,height=380,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") }  </SCRIPT>  <FORM> <INPUT TYPE=button VALUE=\"Drop\" onClick=\"opens3_win();\"></FORM> </td> <td><font color=blue>Total="+total+"  </font><br><font color=red>Due:= "+totaldue+" </red></td><td>  </td>  </tr> ");


out.println("</table>");

//.................................................................................................

//<FORM> <INPUT TYPE=button VALUE=\"Admit Card\" onClick=\"openwin();\"></FORM>  <FORM> <INPUT TYPE=button VALUE=\"Payment Status\" onClick=\"payment();\"></FORM>


//out.println(".style1{padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif; TEXT-DECORATION: none; background-image: url(''); background-color:#ffe6ff; color:yellow; font-size: 17px;color: rgb(0,0,0); border: #feaaee solid 0px; } ");

out.println("<SCRIPT LANGUAGE=javascript>");
out.println("<!--");



out.println("function open4() { a= window.open(\"/msged/servlet/admitcard?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 

out.println("function payment() { a= window.open(\"/msged/servlet/payment_status?id="+sid+"&batch="+b+"\",\"myName0\",\"width=700,height=580,top='+screen.availTop+',left=0',status,toolbar=1,scrollbars,manu,location\") } "); 


out.println("//-->");
out.println("</SCRIPT>");

out.println("<FORM> <INPUT TYPE=button VALUE=\"Admit Card\" onClick=\"open4();\"></FORM>  <FORM> <INPUT TYPE=button VALUE=\"Payment Status\" onClick=\"payment();\"></FORM>");

//..................................................................................................
 

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
