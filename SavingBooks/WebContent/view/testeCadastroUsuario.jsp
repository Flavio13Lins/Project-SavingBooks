<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	  <title>Personal Libery</title>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <style>
	    /* Remove the navbar's default margin-bottom and rounded borders */ 
	    .navbar {
	      margin-bottom: 0;
	      border-radius: 0;
	    }
	    
	    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
	    .row.content {height: 450px}
	    
	    /* Set gray background color and 100% height */
	    .sidenav {
	      padding-top: 20px;
	      background-color: #f1f1f1;
	      height: 100%;
	    }
	    
	    /* Set black background color, white text and some padding */
	    footer {
	      background-color: #555;
	      color: white;
	      padding: 15px;
	    }
	    
	    /* On small screens, set height to 'auto' for sidenav and grid */
	    @media screen and (max-width: 767px) {
	      .sidenav {
	        height: auto;
	        padding: 15px;
	      }
	      .row.content {height:auto;} 
	    }
	  </style>
	</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
    </div>
    
	<div class="col-sm-4 text-center">
        <div class="main-login main-center">
		<h3>LOGIN</h3>
			<form action="abrirLogUsuario" method="get" id="form1">	
			<div class="form-group">						
				<label for="nickname" class="cols-sm-2 control-label">Nickname</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
							<input type="text" class="form-control" name="nickname" id="nickname"  placeholder="Enter a Nickname"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Password</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
								<input type="password" class="form-control" name="senha" id="password"  placeholder="Enter your Password"/>
							</div>
						</div>
					</div>
				<div class="login-help">
					<a href="chamarTest2">Forgot Password...</a>
				</div>
				
				<div class="form-group ">
					<button name="submit" type="submit" form="form1" class="btn btn-default btn-lg btn-block login-button">Login</button>
				</div>
				
			</form>
		
			
		
		</div>
    </div>
	
    <div class="col-sm-4 text-center">
        <div class="main-login main-center">
		<h3>NEW REGISTER</h3>
			<form id="form2" method="post" action="criandoOb">	
			<div class="form-group">						
				<label for="nickname" class="cols-sm-2 control-label">Nickname</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
							<input type="text" class="form-control" name="nickname" id="nickname"  placeholder="Enter a Nickname"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label for="email" class="cols-sm-2 control-label">Your Email</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
							<input type="text" class="form-control" name="email" id="email"  placeholder="Enter your Email"/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Password</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
							<input type="password" class="form-control" name="senha" id="password"  placeholder="Enter your Password"/>
						</div>
					</div>
				</div>
				
<!--NOME DA VARIAVEL PARA COMFIRMAÇAO DA SENHA?-->
				<div class="form-group">
					<label for="confirm" class="cols-sm-2 control-label">Confirm Password</label>
						<div class="cols-sm-10">							<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
							<input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirm your Password"/>
						</div>
					</div>
				</div>
				<div class="login-help">
					<a href="listarUsers">Help...</a>
				 </div>
				<div class="form-group ">
					<button  name="submit" type="submit" form="form2" class="btn btn-info btn-lg btn-block login-button">Create Account</button>
				</div>
			</form>
		</div>
    </div>
	
	<div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div>
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>