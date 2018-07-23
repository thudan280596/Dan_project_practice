package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Cart;
import Model.Product;
import DAO.ProductDAO;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>product</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 
            ProductDAO productDAO = new ProductDAO();
            String category_id ="";
            if(request.getParameter("category")!=null){
                category_id = request.getParameter("category");
            }
           
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("        <br /><br />\n");
      out.write("        <!---->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"content-top\">\n");
      out.write("                    <h3 class=\"future\">FEATURED</h3>\n");
      out.write("                    <div class=\"content-top-in\">\n");
      out.write("                        \n");
      out.write("                        ");

                            for(Product p: productDAO.getListProductBycategory(Long.parseLong(category_id))){
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-md-3 md-col\">\n");
      out.write("                            <div class=\"col-md\">\n");
      out.write("                                <a href=\"single.jsp?product_id=");
      out.print(p.getProductID());
      out.write("\"><img  src=\"");
      out.print(p.getProductImage());
      out.write("\" alt=\"");
      out.print(p.getProductName());
      out.write("\" /></a>\n");
      out.write("                                \t\n");
      out.write("                                <div class=\"top-content\">\n");
      out.write("                                    <h5><a href=\"single.jsp?productID=");
      out.print(p.getProductID());
      out.write('"');
      out.write('>');
      out.print(p.getProductName());
      out.write("</a></h5>\n");
      out.write("                                  \n");
      out.write("                                    <div class=\"white\">\n");
      out.write("                                       <a href=\"CartServlet?command=plus&productID=");
      out.print(p.getProductID());
      out.write("\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2 \">ADD TO CART</a>\n");
      out.write("                                            <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print(p.getProductPrice());
      out.write("</span></p>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                       \n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <ul class=\"start\">\n");
      out.write("                    <li ><a href=\"#\"><i></i></a></li>\n");
      out.write("                    <li><span>1</span></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">2</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">3</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">4</a></li>\n");
      out.write("                    <li class=\"arrow\"><a href=\"#\">5</a></li>\n");
      out.write("                    <li ><a href=\"#\"><i  class=\"next\"> </i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
