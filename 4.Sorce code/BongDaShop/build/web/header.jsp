<%-- 
    Document   : header
    Created on : Jul 12, 2018, 3:08:14 PM
    Author     : Admin
--%>

<%@page import="java.util.Map"%>
<%@page import="Model.Item"%>
<%@page import="Model.Cart"%>
<%@page import="Model.Users"%>
<%@page import="Model.Category"%>
<%@page import="DAO.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>
        <div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = 'https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v3.1&appId=1166134143526600&autoLogAppEvents=1';
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
    </head>
    <body>
       
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            Users users = null;
            if (session.getAttribute("user") != null) {
                users = (Users) session.getAttribute("user");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }

        %>

        <!--header-->
        <div class="header">
            <div class="header-top">
                <div class="container">	
                    <div class="header-top-in">			
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo.png" alt=" " ></a>
                        </div>
                        <div class="header-in">
                            <ul class="icon1 sub-icon1">
                                <%if (users != null) {%>
                                <li><a href="wishlist.html"><%=users.getUserEmail()%></a> </li>
                                    <%}%>
                                <li><a href="#">SẢN PHẨM YÊU THÍCH</a> </li>
                                <li><a href="#">TÀI KHOẢN</a></li>
                                <li><a href="register.jsp">ĐĂNG KÍ</a></li>
                                <li><a href="checkout.jsp" >KIỂM TRA</a> </li>	
                                <li><div class="cart">
                                        <a href="#" class="cart-in"> </a>
                                        <span> <%=cart.countItem()%></span>
                                    </div>
                                    <ul class="sub-icon1 list">
                                        <h3>Recently added items</h3>
                                        <div class="shopping_cart">

                                            <%for (Map.Entry<Long, Item> list : cart.getCartItem().entrySet()) {%>
                                            <div class="cart_box">
                                                <div class="message">
                                                    <div class="alert-close"> </div> 
                                                    <div class="list_img"><img src="<%=list.getValue().getProduct().getProductImage()%>" class="img-responsive" alt=""></div>
                                                    <div class="list_desc"><h4><a href="CartServlet?command=remove&productID=<%=list.getValue().getProduct().getProductID()%>"><%=list.getValue().getProduct().getProductName()%></a></h4>
                                                        <%=list.getValue().getQuantity()%> x<span class="actual"> $<%=list.getValue().getProduct().getProductPrice()%></span>
                                                    </div>
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            <%}%>

                                        </div>
                                        <div class="total">
                                            <div class="total_left">Cart Subtotal: </div>
                                            <div class="total_right">$<%=cart.totalToCart()%></div>
                                            <div class="clearfix"> </div>
                                        </div>
                                        <div class="login_buttons">
                                            <div class="check_button"><a href="checkout.jsp">Kiểm tra</a></div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="clearfix"></div>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>

            <div class="header-bottom">
                <div class="container">
                    <div class="h_menu4">
                        <a class="toggleMenu" href="#">Menu</a>
                        <ul class="nav">
                            <li class="active"><a href="index.jsp"><i> </i>Trang chủ</a></li>
                            <li><a href="#" >Danh mục</a>
                                <ul class="drop">
                                    <%
                                        for (Category c : categoryDAO.getListCategorys()) {
                                    %>
                                    <li><a href="product.jsp?categoryID=<%=c.getCategoryID()%>&pages=1"><%=c.getCategoryName()%></a></li>
                                        <%
                                            }
                                        %>
                                </ul>
                            </li> 						
                            <li><a href="products.html" > Mẫu mới nhất</a></li>            
                            <li><a href="products.html" >Mẫu bán chạy nhất</a></li>						  				 
                            <li><a href="products.html" >Thông tin bóng đá</a></li>
                            <li><a href="contact.jsp" >Liên hệ</a></li>

                        </ul>
                        <script type="text/javascript" src="js/nav.js"></script>
                    </div>
                </div>
            </div>
            <div class="header-bottom-in">
                <div class="container">
                    <div class="header-bottom-on">
                        <p class="wel"><a href="#">Welcome visitor you can login or create an account.</a></p>
                        <div class="header-can">
                            <ul class="social-in">
                                <li><a href="#"><i> </i></a></li>
                                <li><a href="#"><i class="facebook"> </i></a></li>
                                <li><a href="#"><i class="twitter"> </i></a></li>					
                                <li><a href="#"><i class="skype"> </i></a></li>
                            </ul>	
                            <div class="down-top">		
                                <select class="in-drop">
                                    <option value="Dollars" class="in-of">Dollars</option>
                                    <option value="Euro" class="in-of">Euro</option>
                                    <option value="Yen" class="in-of">Yen</option>
                                </select>
                            </div>
                            <div class="search">
                                <form>
                                    <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                this.value = '';
                                            }" >
                                    <input type="submit" value="">
                                </form>
                            </div>

                            <div class="clearfix"> </div>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </div>

    </body>
</html>
