<%-- 
    Document   : contact
    Created on : Jul 15, 2018, 9:23:55 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>contact</title>
    </head>
    <body>
         <jsp:include page="header.jsp"></jsp:include>
        
        <div class="container">
			<div class="contact">
			<h2 class=" contact-in">LIÊN HỆ</h2>
				
				<div class="col-md-6 contact-top">
					<h3>Info</h3>
					<div class="map">
                                                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3918.4892612808717!2d106.78742031440007!3d10.850342992271436!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1svi!2s!4v1531626164463" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
					</div>
					
					<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas </p>
					<p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id </p>				
					<ul class="social ">
						<li><span><i > </i>44 Man Thiện, phường Tăng Nhơn Phú A, quận 9, tp Hồ Chí Minh, Việt Nam </span></li>
						<li><span><i class="down"> </i>+ 01683349864</span></li>
                                                <li><span><i class="down"> </i>+ 0902770912</span></li>
						<li><a href="mailto:lethithudan@gmail.com"><i class="mes"> </i>lethithudan@gmail.com</a></li>
					</ul>
				</div>
				<div class="col-md-6 contact-top">
					<h3>Rất vui khi được làm việc với bạn!</h3>
						<div>
							<span>Họ & tên</span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>Email </span>		
							<input type="text" value="" >						
						</div>
						<div>
							<span>Sở thích</span>		
							<input type="text" value="" >	
						</div>
						<div>
							<span>Chia sẽ cảm nghĩ của bạn với chúng tôi nhé!</span>		
							<textarea> </textarea>	
						</div>
						<input type="submit" value="SEND" >	
				</div>
			<div class="clearfix"> </div>
		</div>
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
