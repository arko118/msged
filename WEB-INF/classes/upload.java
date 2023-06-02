import java.io.File;
import java.io.IOException;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
  
@WebServlet("/upload")
@MultipartConfig(fileSizeThreshold=1024*1024*10,    // 10 MB
                 maxFileSize=1024*1024*50,          // 50 MB
                 maxRequestSize=1024*1024*100)      // 100 MB
public class upload extends HttpServlet {

 private static final long serialVersionUID = 205242440643911308L;

String batch1="1";

String batch2="2";

String batch3="3";

String batch4="4";

String batch5="5";

String batch6="6";

String batch7="7";

String batch8="8";

String batch9="9";

String batch10="10";

String batch11="11";

String batch12="12";

String batch13="13";

String batch14="14";

String batch15="15";





private static final String B1 = "/stuinfo/picture/batch/batch1";private static final String B6 = "/stuinfo/picture/batch/batch6";private static final String B11 = "/stuinfo/picture/batch/batch11";

private static final String B2 = "/stuinfo/picture/batch/batch2";private static final String B7 = "/stuinfo/picture/batch/batch7";private static final String B12 = "/stuinfo/picture/batch/batch12";

private static final String B3 = "/stuinfo/picture/batch/batch3";private static final String B8 = "/stuinfo/picture/batch/batch8";private static final String B13 = "/stuinfo/picture/batch/batch13";

private static final String B4 = "/stuinfo/picture/batch/batch4";private static final String B9 = "/stuinfo/picture/batch/batch9";private static final String B14 = "/stuinfo/picture/batch/batch14";

private static final String B5 = "/stuinfo/picture/batch/batch5";private static final String B10 = "/stuinfo/picture/batch/batch10";private static final String B15 = "/stuinfo/picture/batch/batch15";






    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

String id1=request.getParameter("batch"); 

String id=request.getParameter("id"); 


if(id1.equals(batch1)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B1;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B1=""+id+".jpg";part.write(uploadFilePath + File.separator + B1 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+" ");
}


if(id1.equals(batch2)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B2;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B2=""+id+".jpg";part.write(uploadFilePath + File.separator + B2 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch3)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B3;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B3=""+id+".jpg";part.write(uploadFilePath + File.separator + B3 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch4)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B4;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B4=""+id+".jpg";part.write(uploadFilePath + File.separator + B4 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch5)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B5=""+id+".jpg";part.write(uploadFilePath + File.separator + B5 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch6)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B6=""+id+".jpg";part.write(uploadFilePath + File.separator + B6 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch7)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B7=""+id+".jpg";part.write(uploadFilePath + File.separator + B7 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch8)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B8=""+id+".jpg";part.write(uploadFilePath + File.separator + B8 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch9)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B9=""+id+".jpg";part.write(uploadFilePath + File.separator + B9 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch10)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B10=""+id+".jpg";part.write(uploadFilePath + File.separator + B10 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch11)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B11;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B11=""+id+".jpg";part.write(uploadFilePath + File.separator + B11 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch12)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B12;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B12=""+id+".jpg";part.write(uploadFilePath + File.separator + B12 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch13)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B13;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B13=""+id+".jpg";part.write(uploadFilePath + File.separator + B13 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch14)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B14;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B14=""+id+".jpg";part.write(uploadFilePath + File.separator + B14 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}

if(id1.equals(batch15)){
      
        String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B15;
        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath());
        String fileName = null;for (Part part : request.getParts()){String B15=""+id+".jpg";part.write(uploadFilePath + File.separator + B15 );}
        request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/pictureupdate?batch="+id1+"");
}









    }
  
    /**
     * Utility method to get file name from HTTP header content-disposition
     */
    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= "+contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length()-1);
            }
        }
        return "";
    }
}