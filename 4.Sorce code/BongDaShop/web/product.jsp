<%-- 
    Document   : product
    Created on : May 10, 2016, 7:41:53 PM
    Author     : TUNGDUONG
--%>

<%@page import="Model.Cart"%>
<%@page import="Model.Product"%>
<%@page import="DAO.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>product</title>
    </head>
    <body>
        
        <% 
            ProductDAO productDAO = new ProductDAO();
            String category_id ="";
            if(request.getParameter("category")!=null){
                category_id = request.getParameter("category");
            }
           
            
        %>
        
        <jsp:include page="header.jsp"></jsp:include>
       
        <br /><br />
        <!---->
        <div class="container">
            <div class="content">
                <div class="content-top">
                    <h3 class="future">FEATURED</h3>
                    <div class="content-top-in">
                        
                        <%
                            for(Product p: productDAO.getListProductBycategory(Long.parseLong(category_id))){
                        %>
                        
                        <div class="col-md-3 md-col">
                            <div class="col-md">
                                <a href="single.jsp?product_id=<%=p.getProductID()%>"><img  src="<%=p.getProductImage()%>" alt="<%=p.getProductName()%>" /></a>
                                	
                                <div class="top-content">
                                    <h5><a href="single.jsp?productID=<%=p.getProductID()%>"><%=p.getProductName()%></a></h5>
                                  
                                    <div class="white">
                                       <a href="CartServlet?command=plus&productID=<%=p.getProductID()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                                            <p class="dollar"><span class="in-dollar">$</span><span><%=p.getProductPrice()%></span></p>
                                        <div class="clearfix"></div>
                                    </div>

                                </div>							
                            </div>
                        </div>
                        
                        <%
                            }
                        %>
                       
                        <div class="clearfix"></div>
                    </div>
                </div>
                
                
                <ul class="start">
                    <li ><a href="#"><i></i></a></li>
                    <li><span>1</span></li>
                    <li class="arrow"><a href="#">2</a></li>
                    <li class="arrow"><a href="#">3</a></li>
                    <li class="arrow"><a href="#">4</a></li>
                    <li class="arrow"><a href="#">5</a></li>
                    <li ><a href="#"><i  class="next"> </i></a></li>
                </ul>
            </div>
        </div>
        
        <jsp:include page="footer.jsp"></jsp:include>
        
    </body>
</html>
