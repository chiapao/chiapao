<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <!-- linearicons CSS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
		<!-- myself CSS -->
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/front_end/css/login.css">
		   <style>
        /* 請複製這一段到你自己的CSS*/
        html {
            height: 100%;           
        }
        /*font */ 
        @import url(//fonts.googleapis.com/earlyaccess/notosanstc.css);
        body {
            background-image: url(<%= request.getContextPath() %>/front_end/img/woodbackground3.png);
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;
            background-size: cover;
            font-family: 'Noto Sans TC', sans-serif;;
            font-weight: 400;
        }  
    </style>
</head>
<body>


<div class="container col-3 loginarea">	
		<form action="loginhandler" method="post">	
            <div class="tablebg" >
				<table >
					
					<tr class="tr1">
						<td class="td1">帳號</td> 
						<td class="td2">
							<input class="form-control-sm custom-input" type=text name="account" size=15>
						</td>
					</tr>
					<tr>
						<td class="td1">密碼</td> 
						<td class="td2">
							<input class="form-control-sm custom-input" type=password name="password"  size=15></td></tr>
					<tr >
						<td align="left">
                            <a href="<%= request.getContextPath() %>/front_end/member/register.jsp" class="custom-btn btn btn-warning btn-sm"  style="margin-left: 10px;" >註冊</a>
                        </td>
                        <td align="right">
							<input class="custom-btn btn btn-warning btn-sm" type="button" value="取消">
                            <input class="custom-btn btn btn-warning btn-sm" type="submit" value="確認"> 
						</td>
					</tr>
					
				</table>
            </div>
		</form>
</div>

</body>
</html>