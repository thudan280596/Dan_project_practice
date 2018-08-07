package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>footer</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("<!--slider-script-->\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t$(function () {\n");
      out.write("\t\t\t\t  $(\"#slider1\").responsiveSlides({\n");
      out.write("\t\t\t\t\tauto: true,\n");
      out.write("\t\t\t\t\tspeed: 500,\n");
      out.write("\t\t\t\t\tnamespace: \"callbacks\",\n");
      out.write("\t\t\t\t\tpager: true,\n");
      out.write("\t\t\t\t  });\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("<!--//slider-script-->\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close').on('click', function(c){\n");
      out.write("\t\t$('.message').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close1').on('click', function(c){\n");
      out.write("\t\t$('.message1').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message1').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!---->\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i> </i>Giới thiệu về bóng đá</h4>\n");
      out.write("                                                <p>Bóng đá là môn thể thao phổ biến và được yêu thích nhất trên thế giới từ xưa tới nay. Bóng đá là bình đẳng, không phân biệt màu da hay giới tính</p>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                <!--<p>Trong bóng đá, đôi khi bạn phải giơ tay, thừa nhận rằng đối thủ hay hơn mình.</p>-->\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i class=\"cross\"> </i>Châm ngôn bóng đá</h4>\n");
      out.write("                                                <!--<a href=\"#\"></a>-->\n");
      out.write("                                                <p>\"Tài năng không đi đôi với sự nỗ lực cũng vô dụng\" - Cristiano Ronaldo </p>\n");
      out.write("                                                <!--<p>Nếu bạn hỏi tại sao tôi chơi bóng đá, tôi sẽ hỏi tại sao bạn thở</p>-->\n");
      out.write("                                                <!--<p>“Tôi luôn tâm niệm, những gì mình có được hôm nay không tự dưng đến mà do khổ luyện mà thành. Nếu có suy nghĩ dừng lại thì đồng nghĩa tôi có thể mất” Công Vinh</p>-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-in\">\n");
      out.write("\t\t\t\t\t\t<h4><i class=\"down\"> </i>Thông tin</h4>\n");
      out.write("<!--\t\t\t\t\t\t<p>Cách chọn trang phục bóng đá</p>\n");
      out.write("                                                <p>Ý nghĩa số áo cầu thủ</p>-->\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\">Cách chọn trang phục bóng đá</a></li>\n");
      out.write("                                                    <li><a href=\"#\">Ý nghĩa số áo cầu thủ</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t<div class=\"footer-middle\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Bóng Đá Shop</h6>\n");
      out.write("\t\t\t\t\t\t<p>Cửa hàng bán quần áo bóng đá, quần áo thi đấu bóng đá, áo đá bóng, áo đá banh, áo bóng đá tuyển quốc gia, áo bóng đá câu lạc bộ, may áo bóng đá theo yêu cầu, áo bóng đá không logo, giày đá bóng và các phụ kiện bóng đá.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Thông tin</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Chúng tôi</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Thông tin giao hàng</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Chính sách bảo mật</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Điều khoản & điều kiện</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Hỗ trợ khách hàng</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("                                                    <p>Hotline: 01683349864</p>\n");
      out.write("                                                    <p>Email: lethithudan@gmail.com</p>\n");
      out.write("                                                    <p>Địa chỉ: 44 Man Thiện, p. Tăng Nhơn Phú, q.9, tp Hồ Chí Minh</p>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Tài khoản của bạn</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"account.html\">Tài khoản</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Lịch sử</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"wishlist.html\">Danh sách yêu thích</a></li>\n");
      out.write("<!--\t\t\t\t\t\t\t<li><a href=\"#\">Newsletter</a></li>-->\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-middle-in\">\n");
      out.write("\t\t\t\t\t\t<h6>Tiện ích</h6>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Thương hiệu</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Phiếu quà tặng</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Chi nhánh</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Ưu đãi đặc biệt</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<p class=\"footer-class\">Copyright © 2015 Modern Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t\t\t/*\n");
      out.write("\t\t\t\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\t\t  \t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\t\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\t\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\t\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t\t \t\t};\n");
      out.write("\t\t\t\t\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("        <!-- Subiz -->\n");
      out.write("        <script>\n");
      out.write("          (function(s, u, b, i, z){\n");
      out.write("            u[i]=u[i]||function(){\n");
      out.write("              u[i].t=+new Date();\n");
      out.write("              (u[i].q=u[i].q||[]).push(arguments);\n");
      out.write("            };\n");
      out.write("            z=s.createElement('script');\n");
      out.write("            var zz=s.getElementsByTagName('script')[0];\n");
      out.write("            z.async=1; z.src=b; z.id='subiz-script';\n");
      out.write("            zz.parentNode.insertBefore(z,zz);\n");
      out.write("          })(document, window, 'https://widgetv4.subiz.com/static/js/app.js', 'subiz');\n");
      out.write("          subiz('setAccount', 'achixcopwftesxqh');\n");
      out.write("        </script>\n");
      out.write("        <!-- End Subiz -->\n");
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
