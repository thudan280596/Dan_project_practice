<%-- 
    Document   : resgister
    Created on : Jul 15, 2018, 9:01:47 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>resgister</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        
        <div class="container">
		<div class="account">
			<h2 class="account-in">Register</h2>
				<form> 	
				<div>			
					<span class="name-in">Username*</span>
					<input type="text"> 
				</div>			
				<div> 
					<span class="word">Password*</span>
					<input type="password">
				</div>
                                <div>			
					<span class="name-in">Email*</span>
					<input type="text"> 
				</div>
                                <div>			
					<span class="name-in">Số điện thoại*</span>
					<input type="text"> 
				</div>
					<input type="submit" value="Register"> 
				</form>
		</div>
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
