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
    
	
	<!--
	<div class="col-sm-8 text-left"> 
      <h1>Welcome</h1>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
      <hr>
      <h3>Test</h3>
      <p>Lorem ipsum...</p>
    </div>
	-->
	
    <div class="col-sm-8 text-center">
        <table class="table"><!--<div>...panel panel-primaryfilterable // tab-content // panel fluid // panel-title-->
            
			<div class="table-title">
                <h3 class="table-title">Your Personal Libary</h3>
                <div class="pull-right">
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
                <hr size="pixels">
            </div>
			
            <table class="table">
            
                <thead >
                    <tr class="filters" >
                    	<form action="adicionarLivro">
									<th><input type="submit" value="Add this Book"
										name="submit" class="txt2"></th>
									<th><input type="text" class="form-control" name="nome"
										placeholder="Name" abled></th>
									<th><input type="text" class="form-control" name="autor"
										placeholder="Autor" abled></th>
									<th><div class="form-group">
											<label >Already Read:</label> 
											<select	name="lido" class="form-control" >
												<option value=1 >Yes</option>
												<option value=0 >No</option>
											</select>
										</div></th>
									</th>
									
									<!-- LIVROS EMPRESTADOR NOME DA VARIAVEL PRA GUARDAR VALOR -->
									
									<input name="" type="text" class="form-control" placeholder="Lent To" abled>
									<th><div class="form-group">
											<label for="sel1">Grade:</label> 
											<select name="nota" class="form-control">
												<option value=1 >1</option>
												<option value=2 >2</option>
												<option value=3 >3</option>
												<option value=4 >4</option>
												<option value=5 >5</option>
											</select>
									</div></th>
							</form>
                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Vidas Secas - Graciliano Ramos</td>
						<td>Yes</td>
						<td>-</td>
						<td>4</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Budapeste - Chico Buarque</td>
						<td>No</td>
						<td>-</td>
						<td>3</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>O Menino do Pijama Listrado - John Boyne</td>
						<td>Yes</td>
						<td>Joao</td>
						<td>5</td>
                    </tr>
                </tbody>
            </table>
        </table>
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