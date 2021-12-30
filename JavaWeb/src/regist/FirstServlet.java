package regist;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cris on 2016/8/8.
 */
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html;charset=gbk");

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        System.out.println("name:"+name+"/r"+"pass:"+pass);

        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
        for(Cookie cookie : cookies){
            cookie.getName();// get the cookie name
            cookie.getValue(); // get the cookie value
            System.out.println(cookie.getName()+"---"+cookie.getName());
        }

        PrintWriter pw = response.getWriter();
        pw.write("<h1> hello first符号 servlet!</h1>");
    }
}
