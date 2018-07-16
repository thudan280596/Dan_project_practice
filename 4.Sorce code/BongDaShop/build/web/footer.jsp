<%-- 
    Document   : footer
    Created on : Jul 12, 2018, 3:08:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>footer</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
<!--slider-script-->
		<script src="js/responsiveslides.min.js"></script>
			<script>
				$(function () {
				  $("#slider1").responsiveSlides({
					auto: true,
					speed: 500,
					namespace: "callbacks",
					pager: true,
				  });
				});
			</script>
<!--//slider-script-->
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
    </head>
    </head>
    <body>
        <!---->
		<div class="footer">
			<div class="footer-top">
				<div class="container">
					<div class="col-md-4 footer-in">
						<h4><i> </i>Châm ngôn bóng đá</h4>
						<p>"Tài năng không đi đôi với sự nỗ lực cũng vô dụng" - Cristiano Ronaldo </p>
                                                <p>Trong bóng đá, đôi khi bạn phải giơ tay, thừa nhận rằng đối thủ hay hơn mình.</p>
                                                
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="cross"> </i>Tin tức bóng đá</h4>
                                                <!--<a href="#"></a>-->
                                                <p>“Tôi luôn tâm niệm, những gì mình có được hôm nay không tự dưng đến mà do khổ luyện mà thành. Nếu có suy nghĩ dừng lại thì đồng nghĩa tôi có thể mất” Công Vinh</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="down"> </i>Suspendisse sed</h4>
						<p>Aliquam dignissim porttitor tortor non fermentum. Curabitur in magna lectus. Duis sed eros diam. Lorem ipsum dolor sit amet, consectetur.</p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!---->
			<div class="footer-middle">
				<div class="container">
					<div class="footer-middle-in">
						<h6>Về chúng tôi</h6>
						<p>Cửa hàng bán quần áo bóng đá, quần áo thi đấu bóng đá, áo đá bóng, áo đá banh, áo bóng đá tuyển quốc gia, áo bóng đá câu lạc bộ, may áo bóng đá theo yêu cầu, áo bóng đá không logo, giày đá bóng và các phụ kiện bóng đá.</p>
					</div>
					<div class="footer-middle-in">
						<h6>Thông tin</h6>
						<ul>
							<li><a href="#">Chúng tôi</a></li>
							<li><a href="#">Thông tin giao hàng</a></li>
							<li><a href="#">Chính sách bảo mật</a></li>
							<li><a href="#">Điều khoản & điều kiện</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>Dịch vụ khách hàng</h6>
						<ul>
							<li><a href="contact.html">Liên hệ với chúng tôi</a></li>
<!--							<li><a href="#">Returns</a></li>
							<li><a href="#">Site Map</a></li>-->
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>Tài khoản của bạn</h6>
						<ul>
							<li><a href="account.html">Tài khoản</a></li>
							<li><a href="#">Lịch sử</a></li>
							<li><a href="wishlist.html">Danh sách</a></li>
<!--							<li><a href="#">Newsletter</a></li>-->
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>Tiện ích</h6>
						<ul>
							<li><a href="#">Nhãn hiệu</a></li>
							<li><a href="#">Phiếu quà tặng</a></li>
							<li><a href="#">Đại lý</a></li>
							<li><a href="#">Ưu đãi đặc biệt</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<p class="footer-class">Copyright © 2015 Modern Template by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
			<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

		</div>
    </body>
</html>
