package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!-- Session validation for bus operator  -->\n");

	if(session.getAttribute("type")==null ){
		response.sendRedirect("index.jsp");
	}

      out.write("\n");
      out.write("<!-- session validation ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- ***********   START   *********** -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/AdminSidebar.jsp", out, false);
      out.write("\n");
      out.write("<div class=\"dashboard container col-lg-9 col-md-9 col-sm-9 col-xs-7\">\n");
      out.write("\t<div class=\"dashboardBody col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t<div class=\"formTitle col-lg-12 col-md-12 col-sm-12 col-xs-12\">Admin Dashboard</div>\n");
      out.write("\t\t<div class=\"dashboarddiv col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t<div class=\"odd col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tView Bus Operator\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\n");
      out.write("\t\t\t\t\t<a href=\"ViewBusOperators.jsp\">View</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"even col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tAdd Bus Operator\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"addnewbusoperator.jsp\">Add</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"even col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tDelete Bus Operator\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"DeleteBusOperatorByAdmin.jsp\">Delete</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"even col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tView Users\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"ViewRegisteredUsers.jsp\">View</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"even col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tView Bookings\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"ViewAllBookings.jsp\">View</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"even col-lg-3 col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t<div class=\"dashimg\">\n");
      out.write("\t\t\t\t\tLogout\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"dashcontent\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"Logout.jsp\">Signout</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- ***********   basha html ends   *********** -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "layout/Footer.jsp", out, false);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
