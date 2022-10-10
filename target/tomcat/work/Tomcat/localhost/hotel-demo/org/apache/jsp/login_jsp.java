/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-06-10 03:46:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <title>酒店管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/loginImg.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/hotelLogin.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"login-box\">\r\n");
      out.write("    <h2>酒店管理系统登录界面</h2>\r\n");
      out.write("    <form action=\"/hotel-demo//loginServlet\" id=\"form\" method=\"post\">\r\n");
      out.write("        <div class=\"login-field\">\r\n");
      out.write("            <input type=\"text\" name=\"admName\" required=\"\" />\r\n");
      out.write("            <label>用户名</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login-field\">\r\n");
      out.write("            <input type=\"password\" name=\"password\" required=\"\" />\r\n");
      out.write("            <label>密码</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"login-field\">\r\n");
      out.write("            <input type=\"text\" name=\"checkCode\" id=\"checkCode\" class=\"login-field\" required=\"\"/>\r\n");
      out.write("            <label>验证码</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <img id=\"checkCodeImg\" src=\"/hotel-demo/checkCodeServlet\">\r\n");
      out.write("        <br/>\r\n");
      out.write("        <a href=\"#\" id=\"changeImg\" color=\"yellow\">看不清？</a>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <span id=\"checkCode_err\" class=\"err_msg\"></span>\r\n");
      out.write("        <br/>\r\n");
      out.write("        <button type=\"submit\">登&emsp;&emsp;录</button>\r\n");
      out.write("        &emsp;&emsp;&emsp;&emsp;;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("        <button type=\"reset\">重&nbsp;置</button>\r\n");
      out.write("        &emsp;&emsp;\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    var errori ='");
      out.print(request.getAttribute("login_msg"));
      out.write("';\r\n");
      out.write("    if(errori!=='null'){\r\n");
      out.write("        alert(errori);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    var errori ='");
      out.print(request.getAttribute("register1_msg"));
      out.write("';\r\n");
      out.write("    if(errori!=='null'){\r\n");
      out.write("        alert(errori);\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById(\"changeImg\").onclick = function () {\r\n");
      out.write("        document.getElementById(\"checkCodeImg\").src = \"/hotel-demo/checkCodeServlet?t=\" + new Date().getTime();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    document.getElementById(\"checkCodeImg\").onclick = function () {\r\n");
      out.write("        document.getElementById(\"checkCodeImg\").src = \"/hotel-demo/checkCodeServlet?t=\" + new Date().getTime();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
