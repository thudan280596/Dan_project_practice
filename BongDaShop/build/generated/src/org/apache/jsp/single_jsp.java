package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>single</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"single\">\n");
      out.write("\t\t\t\t<div class=\"col-md-9 top-in-single\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5 single-top\">\t\n");
      out.write("\t\t\t\t\t\t<ul id=\"etalage\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"optionallink.html\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"etalage_thumb_image img-responsive\" src=\"images/si1.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"etalage_source_image img-responsive\" src=\"images/si1.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_thumb_image img-responsive\" src=\"images/si2.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_source_image img-responsive\" src=\"images/si2.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_thumb_image img-responsive\" src=\"images/si.jpg\" alt=\"\"  >\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_source_image img-responsive\" src=\"images/si.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_thumb_image img-responsive\" src=\"images/si1.jpg\"  alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"etalage_source_image img-responsive\" src=\"images/si1.jpg\" alt=\"\" >\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t<div class=\"col-md-7 single-top-in\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-para\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Lorem ipsum dolor sit amet, consectetur adipisicing elit</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"para-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t<span  class=\"add-to\">$32.8</span>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"hvr-shutter-in-vertical cart-to\">Add to Cart</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t\t<h5>100 items in stock</h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"available\">\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Available Options :</h6>\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Color:\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Silver</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Black</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Dark Black</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>Red</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t</select></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>Size:<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Large</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Medium</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>small</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>Large</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>small</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>Quality:<select>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>4</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>5</option>\n");
      out.write("\t\t\t\t\t\t\t\t</select></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"hvr-shutter-in-vertical \">More details</a>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t<div class=\"content-top-in\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 top-single\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<img  src=\"images/pic8.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Mascot Kitty - White</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 top-single\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<img  src=\"images/pic9.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Mascot Kitty - White</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 top-single-in\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t\t\t\t<img  src=\"images/pic10.jpg\" alt=\"\" />\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"top-content\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5>Mascot Kitty - White</h5>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"white\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"dollar\"><span class=\"in-dollar\">$</span><span>2</span><span>0</span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t<h4>Categories</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t<h4>Product Categories</h4>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>feugiat(5)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i> feugiat (4)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i> feugiat(2)</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"single-bottom\">\n");
      out.write("\t\t\t\t\t\t<h4>Product Categories</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive fashion\" src=\"images/st1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"grid-product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive fashion\" src=\"images/st2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"grid-product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive fashion\" src=\"images/st3.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"grid-product\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("           ");
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
