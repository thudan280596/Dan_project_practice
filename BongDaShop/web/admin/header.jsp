<%-- 
    Document   : header
    Created on : Jul 9, 2018, 4:11:50 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div id="header">
            <div class="wp-inner clearfix">
                <a href="" id="logo" class="fl-left">
                        <img src="images/logo.png" width="150px" height="80px" alt="Logo" title="Logo">
                </a>
                <ul id="main-menu" >
                        <li><a href="#">Trang chủ</a></li>
                        <li class="active">Về chúng tôi<a href="#"></a></li>
                        <li><a href="#">Câu lạc bộ</a>
                                <ul id="sub-menu">
                                        <li><a href="#">Pr.League</a>
                                            <ul class="min-menu">
                                                <li><a href="#">Arsenal</a></li>
                                                <li><a href="#">Chelsea</a></li>
                                                <li><a href="#">Liverpool</a></li>
                                                <li><a href="#">Leicester City</a></li>
                                                <li><a href="#">Manchester United</a></li>
                                                <li><a href="#">Manchester City</a></li>
                                                <li><a href="#">Tottenham</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Laliga</a>
                                            <ul>
                                                <li><a href="#">Atletico Madrid</a></li>
                                                <li><a href="#">Barcelona</a></li>
                                                <li><a href="#">Read Madrid</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">Budesliga</a>
                                            <ul>
                                                <li><a href="#">Bayern Munich</a></li>
                                                <li><a href="#">Borussia Dortmund</a></li>
                                                <li><a href="#">Wolfsburg</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">V-league</a>
                                            <ul>
                                                <li><a href="#">Hoàng Anh Gia Lai</a></li>
                                                <li><a href="#">Hải Phòng FC</a></li>
                                                <li><a href="#">Sông Lam Nghệ An</a></li>
                                            </ul>
                                        </li>
                                </ul>
                        </li>
                        <li><a href="#">Tuyển quốc gia</a>
                                <ul class="sub-menu">
                                    <li><a href="#">Bỉ</a></li>
                                    <li><a href="#">Đức</a></li>
                                    <li><a href="#">Bồ Đào Nha</a></li>
                                    <li><a href="#">Pháp</a></li>
                                    <li><a href="#">Anh</a></li>
                                    <li><a href="#">Việt Nam</a></li>
                                    <li><a href="#">Nhật Bản</a></li>
                                    <li><a href="#">Brazil</a></li>
                                    <li><a href="#">Tây Ban Nha</a></li>
                                    <li><a href="#">Ý</a></li>
                                </ul>
                        </li>
                        <li><a href="#">Phụ kiện</a>
                            <ul class="sub-menu">
                                <li><a href="#">Banh</a></li>
                                <li><a href="#">Cờ</a></li>
                                <li><a href="#">Cúp</a></li>
                                <li><a href="#">Găng tay</a></li>
                                <li><a href="#">Thủ môn</a></li>
                                <li><a href="#">Túi CLB</a></li>
                                <li><a href="#">Móc khóa</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Giày</a></li>
                </ul>
                <div id="search" class="fl-right">
                        <input type="text" name="search" placeholder="Tìm kiếm...">
                </div>
            </div>
        </div>
    </body>
</html>
