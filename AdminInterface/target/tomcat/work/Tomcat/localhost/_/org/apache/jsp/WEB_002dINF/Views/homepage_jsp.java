/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-06 04:55:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.Views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write('\r');
      out.write('\n');
 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");

      out.write("\r\n");
      out.write("<!-- ------------------------------------------------------->\r\n");
      out.write("\t<div class=\"row \">\r\n");
      out.write("\t<div class=\"col-md-2\">\r\n");
      out.write("\t<div class=\"m-3 text-center\">\r\n");
      out.write("\t<p class=\"border-bottom m-3\">Table Name</p>\r\n");
      out.write("\r\n");
      out.write("\t");

	if(request.getAttribute("index") !=null){
	ResultSet resultIndex=(ResultSet)request.getAttribute("index");
	while(resultIndex.next()){
		
	if(request.getAttribute("tableName").equals(resultIndex.getString("TABLE_NAME"))){

      out.write("\r\n");
      out.write("\t<a class=\"text-white\" href=\"/homepage.jsp?id=");
      out.print(resultIndex.getString("TABLE_NAME") );
      out.write("\"><p class=\"border-right border-bottom bg-success \">\r\n");
      out.write("\t");
      out.print( resultIndex.getString("TABLE_NAME").substring(0, 1).toUpperCase() + resultIndex.getString("TABLE_NAME").substring(1).toLowerCase() );
      out.write("\r\n");
      out.write("\t</p></a>\r\n");
 	}else{
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<a class=\"text-dark\" href=\"/homepage.jsp?id=");
      out.print(resultIndex.getString("TABLE_NAME") );
      out.write("\"><p class=\"border-right border-bottom  \">\r\n");
      out.write("\t");
      out.print( resultIndex.getString("TABLE_NAME").substring(0, 1).toUpperCase() + resultIndex.getString("TABLE_NAME").substring(1).toLowerCase() );
      out.write("\r\n");
      out.write("\t </p></a>\r\n");
 
}}}

      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<span class=\"border-right\"></span>\r\n");
      out.write("\t<span class=\"border-right\"></span>\r\n");
      out.write("\t<div class=\"col-md-8\">\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("  \t<tbody>\r\n");
      out.write("\t");

	if(request.getAttribute("data")!=null && request.getAttribute("column")!=null ){
	ResultSet resultData=(ResultSet)request.getAttribute("data");
	ResultSet resultcolumn=(ResultSet)request.getAttribute("column");
	String columnName=null;
	String dta;
	String id=null;
	if(resultcolumn.next()){
		 id=resultcolumn.getString("COLUMN_NAME");
		resultcolumn.next();
		 columnName=resultcolumn.getString("COLUMN_NAME");
		 
      out.write("\r\n");
      out.write("\t\t ");
      out.print( columnName );
      out.write("\t\t\r\n");
 	}else{	}
	while(resultData.next()){
      out.write("\r\n");
      out.write("   \t<tr>\r\n");
      out.write("      <td>\r\n");
      out.write("      ");
      out.print(resultData.getString(columnName) );
      out.write("\r\n");
      out.write("      </td>\r\n");
      out.write("      <td><a href=\"/update.jsp?id=");
      out.print(resultData.getString(id).trim());
      out.write("&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tableName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-success\">Update</a></td>\r\n");
      out.write("      <td><a href=\"/delete.jsp?id=");
      out.print(resultData.getString(id).trim());
      out.write("&name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tableName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-danger\">Delete</a></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    ");
}
      out.write('\r');
      out.write('\n');
      out.write('	');
 }
      out.write(" \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-1\">\r\n");
      out.write("\t<div class=\"m-3 text-center\">\r\n");
      out.write("\t<p class=\"border-bottom m-3\">\r\n");
      out.write("\t<a href=\"/add.jsp?name=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tableName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"btn btn-success\">Add</a>\r\n");
      out.write("\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ------------------------------------------------------->\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
