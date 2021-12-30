package regist;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * MultiPartServlet
 * @author lyh
 * @version 2013-4-10
 * @see MultiPartServlet
 * @since
 */
public class MultiPartServlet extends HttpServlet
{
    private static final long serialVersionUID = 1325954832925856683L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        doPost(req, resp);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        Cookie[] cookies = req.getCookies();//这样便可以获取一个cookie数组
        for(Cookie cookie : cookies){
            cookie.getName();// get the cookie name
            cookie.getValue(); // get the cookie value
            System.out.println(cookie.getName()+"---"+cookie.getName());
        }

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
//        MultipartFile file = multipartRequest.getFile("userfile");
//        String filename = file.getOriginalFilename();
//        System.out.println(filename);
        String name=req.getParameter("referer");  //用于用户验证
        String pwd=req.getParameter("eb42Zw");
        System.out.println("-------------------------------------");
        System.out.println(name+"----"+pwd);
        System.out.println("-------------------------------------");
        resp.setContentType("text/html;charset=gbk");
        PrintWriter pw = resp.getWriter();
        pw.write("<h1> hello first符号 servlet!</h1>");

        //-------------------------------------------------------------------
        // SetCharacterEncoding = UTF-8
//        req.setCharacterEncoding("utf-8");
//
//        // Judge multipart or not
//        boolean isMultipart = ServletFileUpload.isMultipartContent(req);
//
//        // Multipart form
//        if (isMultipart)
//        {
//            // Create a factory for disk-based file items
//            FileItemFactory factory = new DiskFileItemFactory();
//
//            // Create a new file upload handler
//            ServletFileUpload upload = new ServletFileUpload(factory);
//
//            try
//            {
//                // Parse the request
//                List<FileItem> items = upload.parseRequest(req);
//
//                // Process the uploaded items
//                Iterator<FileItem> iter = items.iterator();
//
//                // Parameters map
//                Map<String,String> params = new HashMap<String,String>();
//
//                // Do list
//                while (iter.hasNext())
//                {
//                    FileItem item = iter.next();
//
//                    // Form Field
//                    if (item.isFormField())
//                    {
//                        // Field name
//                        String name = item.getFieldName();
//
//                        // Set charset = UTF-8 Default = ISO-8859-1
//                        // Get field value
//                        String value = item.getString("utf-8");
//
//                        // Put into map
//                        params.put(name, value.trim());
//                    }
//                }
//                // Set contentType= html charset=utf-8
//                resp.setContentType("text/html;charset=utf-8");
//
//                String userName = (String)params.get("userName");
//
//                PrintWriter out = resp.getWriter();
//
//                // Write out
//                out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//                out.println("<HTML>");
//                out.println(" <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//                out.println(" <BODY>");
//                out.print("username:" + userName + "<br>");
//                out.println(" </BODY>");
//                out.println("</HTML>");
//                out.flush();
//                out.close();
//
//            }
//            catch (Exception fue)
//            {
//                fue.printStackTrace();
//            }
//
//        }
//        // Simple form
//        else
//        {
//            // SetCharacterEncoding = UTF-8
//            req.setCharacterEncoding("utf-8");
//
//            // Set contentType= html charset=utf-8
//            resp.setContentType("text/html;charset=utf-8");
//
//            String userName = (String)req.getParameter("userName");
//
//            PrintWriter out = resp.getWriter();
//
//            // Write out
//            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//            out.println("<HTML>");
//            out.println(" <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//            out.println(" <BODY>");
//            out.print("username:" + userName + "<br>");
//            out.println(" </BODY>");
//            out.println("</HTML>");
//            out.flush();
//            out.close();
//        }

    }
}