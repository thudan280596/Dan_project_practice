package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thumon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Đồ thủ môn</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"products\">\n");
      out.write("\t\t\t\t\t<h2 class=\" products-in\">PRODUCTS</h2>\n");
      out.write("\t\t\t\t\t<div class=\" top-products\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/thumon1.jpg\" alt=\"\" />\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Đồ thủ môn</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/thumon2.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\" >Đồ thủ môn</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>6</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/thumon3.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5> <a href=\"single.html\">Đồ thủ môn</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>1</span><span>5</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/thumon4.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Đồ thủ môn</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>4</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\" top-products\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/tui2ngan1.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Túi 2 ngăn CLB</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>5</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/tui2ngan2.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Túi 2 ngăn CLB</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>5</span><span>5</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md \">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/tui2ngan3.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5> <a href=\"single.html\">Túi 2 ngăn CLB</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>3</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 md-col\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md \">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"compare-in\"><img  src=\"images/tui2ngan4.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"compare\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Chi tiết</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Thêm vào yêu thích</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5><a href=\"single.html\">Túi 2 ngăn CLB</a></h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">Thêm vào giỏ hàng</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>6</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
