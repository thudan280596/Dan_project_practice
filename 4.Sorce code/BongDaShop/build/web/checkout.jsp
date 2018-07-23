<%-- 
    Document   : checkout
    Created on : Jul 20, 2018, 8:35:25 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>check out</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

            <div class="container">
                <div class="check-out">
                    <h4 class="title">Giỏ hàng đang rỗng</h4>
                    <p class="cart">Bạn không có sản phẩm nào trong giỏ hàng của bạn.<br>Nhấn<a href="index.html"> vào đây</a> để tiếp tục mua sắm.</p>
                </div>

            </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
