package org.clay.tom.ex02;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet{


    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {

        System.out.println("from service");
        PrintWriter out = response.getWriter();//是从response中获得PrintWriter对象的，response中的writer对象是自己创建的（针对server.getOutputStream）
        String msg = "HTTP/1.1 200 OK\r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n";
        out.write(msg);
        out.println("Hello Roses are red ");
        out.print("Violets are blue ");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

        System.out.println("destroy ");
    }
}
