<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		<!-- Site Title -->
		<title>for_login_index_fake</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <!-- linearicons CSS -->
        <link rel="stylesheet" href="https://cdn.linearicons.com/free/1.0.0/icon-font.min.css">
        <!-- h&f CSS -->
        <link rel="stylesheet" href="/chiapao/front_end/css/branchheader.css">
        <link rel="stylesheet" href="/chiapao/front_end/css/branchfooter.css">
        <!--your  CSS ============================================= -->
        <link rel="stylesheet" href="/chiapao/front_end/css/login.css">

       <!--Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

</head>
<body>

<section>
<header id="header-whole">
    <div class="header-top" id="header">
        <nav class="navbar-self navbar navbar-expand-lg navbar-dark bg-black">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav nav-fill mx-auto">
                    <li class="nav-item active"><a class="nav-link" href="#">分店資訊
							<span class="sr-only">(current)</span>
					</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">餐點介紹</a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#"></a>
                    </li>
                    <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> 客製化拉麵 </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <a class="dropdown-item" href="#">Action</a> <a class="dropdown-item" href="#">Another action</a> <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#">線上預約訂位</a>

                    </li>
                    <li class="nav-item"><a class="nav-link" href="#">餐點評分分享</a>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="#">線上客服</a>
                    </li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li>&nbsp;</li>
                    <li class="imgicon"><a href="..."><span class="lnr lnr-cart"></span></a></li>
                    <li class="imgicon"><a href="gallery.html"></a><span class="lnr lnr-alarm"></span></li>
                    <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="navbarDropdownMember" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="#" ><span class="lnr lnr-user"></span></a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMember">
                            <a class="dropdown-item" href="#">登入</a> 
                            <a class="dropdown-item" href="#">Another action</a> 
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>        
                    </li>

                </ul>
            </div>
        </nav>

    </div>
</header>
        <!--header js-->                     
        <script> $(window).scroll(function() {
                if ($(this).scrollTop() > 0) {
                    $('#header').addClass('header-scrolled');
                } else {
                    $('#header').removeClass('header-scrolled');
                }
            });
        </script>
        <!--background image-->
    <img src="/chiapao/front_end/img/top-banner1.jpg" width="100%" height="" alt="">  
</section>


</body>
</html>