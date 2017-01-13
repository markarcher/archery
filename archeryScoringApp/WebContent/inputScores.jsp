<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<!-- <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script> -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/theme.css" rel="stylesheet" type="text/css">
<link href="css/inputScoresStyles.css" rel="stylesheet" type="text/css">
</head>
<body>
 <nav class="navbar navbar-default navbar-inverse img-navbar navbar-fixed-top" role="navigation">
        <div class="container-fluid">
           
                <div class="navbar-header">
                </div>
          
                <div class="collapse navbar-collapse navbar-ex1-collapse">

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Recurve<span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Senior Recurve</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Junior Recurve</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Reports <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">blahhhh</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">blallblahhh</a></li>
                            </ul>
                        </li>
                        <li><a href="Login">Logout</a></li>

                    </ul>
                </div><!-- /.navbar-collapse -->
            </div>
       
    </nav>



        <div class="container" id="containerInputScores">
            <div class="row">
            	<div class="col-lg-2">
                	<h4>Input Scores</h4>
                </div>
            </div>
            <div class="row"> 
                <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="1st" />
                </div>
                <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="2nd" />
                </div>
                 <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="3rd" />
                </div>
                <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="4th" />
                </div>
                 <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="5th" />
                </div>
                <div class="col-lg-2">
                	 <input type="text" class="form-control input-lg" placeholder="6th" />
                </div>
            </div>
            <div class="row top-buffer">
            	<div class="col-lg-12">
				        <table BORDER="1" CELLSPACING="1" CELLPADDING="1" width="20%">
							<tr>
								<th></th><th>1</th><th>2</th><th>3</th>
							</tr>
							<tr>
								<td>1</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>2</td><td></td><td></td><td></td>
							</tr>
							<tr>
								<td>3</td><td></td><td></td><td></td>
							</tr>
						</table>
            	</div>
            </div>
		</div>
		
</body>
</html>