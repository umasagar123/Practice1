/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-20 13:32:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1 style=\"text-align:center\">Student Registration</h1>\r\n");
      out.write("<hr />\r\n");
      out.write("<form name=\"frmReg\"  method=\"POST\"  action=\"#\">\r\n");
      out.write("<table width=\"50%\" border=\"1\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Student Name : </td>\r\n");
      out.write("		<td><input type=\"text\" name=\"txtSname\"  /></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Father Name : </td>\r\n");
      out.write("		<td><input type=\"text\" name=\"txtFname\"  /></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Gender : </td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<input type=\"radio\"  name=\"gender\"  value=\"M\" />Male\r\n");
      out.write("			<input type=\"radio\"  name=\"gender\"  value=\"F\" />Female\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Hobbies : </td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<input type=\"checkbox\" name=\"chk1\"  value=\"garden\" />Gardening\r\n");
      out.write("			<br />\r\n");
      out.write("			<input type=\"checkbox\" name=\"chk2\"  value=\"read\" />Reading Books\r\n");
      out.write("			<br />\r\n");
      out.write("			<input type=\"checkbox\" name=\"chk3\"  value=\"chess\" />Playing Chess\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Birth Date : </td>\r\n");
      out.write("		<td><input type=\"date\" name=\"txtBdate\"  /></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Email  : </td>\r\n");
      out.write("		<td><input type=\"email\" name=\"txtEmail\"  /></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Phone Number : </td>\r\n");
      out.write("		<td><input type=\"tel\" name=\"txtPhone\"  /></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Address : </td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<textarea name=\"txtadrs\"  rows=\"5\"  cols=\"30\">			\r\n");
      out.write("			</textarea>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">Location : </td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<select name=\"ddlLoc\">\r\n");
      out.write("				<option value=\"-1\">Select City</option>\r\n");
      out.write("				<option value=\"Hyderabad\">Hyderabad</option>\r\n");
      out.write("				<option value=\"Bangalore\">Bangalore</option>\r\n");
      out.write("				<option value=\"Chennai\">Chennai</option>\r\n");
      out.write("				<option value=\"Pune\">Pune</option>\r\n");
      out.write("				<option value=\"Vizag\">Vizag</option>\r\n");
      out.write("			</select>\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td align=\"right\">\r\n");
      out.write("			<input type=\"submit\"  value=\"Register\" />\r\n");
      out.write("		</td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<input type=\"reset\"  value=\"Clear All\" />\r\n");
      out.write("		</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
