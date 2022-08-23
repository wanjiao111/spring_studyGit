package wan.servlet;

import javax.servlet.*;
import java.io.IOException;

public class myFirstServlet implements Servlet {
    public static void main(String[] args) throws ServletException {
        myFirstServlet myFirstServlet = new myFirstServlet();
        myFirstServlet.init(myFirstServlet.getServletConfig());
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet在初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet在提供服务");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet正在销毁");
    }
}
