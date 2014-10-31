<!DOCTYPE html>
<html lang="en">
  <head>
  	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
    <#include "meta_${language}.ftl" />
    <meta name="author" content="">
    <link rel="shortcut icon" href="${app}res/img/favicon.ico">

    <title>Pragmasoft</title>

    <!-- Bootstrap core CSS -->
    <link href="${app}res/css/main.css" rel="stylesheet">
    <!-- FlexSlider -->
    <link rel="stylesheet" href="${app}res/css/flexslider.css" type="text/css" media="screen" />

    <!-- Custom styles for this template -->
    
    <link href='https://fonts.googleapis.com/css?family=Ubuntu+Condensed&subset=latin,cyrillic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto:100italic,300,300italic,400,400italic,100&subset=latin,cyrillic' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="${app}res/css/pragmasoft.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script defer src="${app}res/js/jquery.flexslider-min.js"></script>
    <script src="${app}res/js/jquery.easing.1.3.min.js" type="text/javascript"></script>
    <script src="${app}res/js/jquery.ui.totop.min.js" type="text/javascript"></script>
    <script src="${app}res/js/pragmasoft.js" type="text/javascript"></script>
     
     
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  
  <body class="body-hover">
  
    <!--Top Navigation  --> 
    <#include "navBar_${language}.ftl" />

    <!--block1  -->
    <div class="pagebox">
      <div class="botimg">
        <div class="container">
          <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <!--Content-->
                <div class="content">
                  <#include "orderProject_${language}.ftl" />
                </div>
                
                <!--end content-->
            </div>
            <div class="ftifl">When ideas<br/>
                  &nbsp;&nbsp;&nbsp;&nbsp;turn into real<span>it</span>y
                </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Footer --> 
    <#include "footer_${language}.ftl" />

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->    
    <script src="${app}res/js/bootstrap.min.js"></script>
    <script src="${app}res/js/jquery.scrolly.min.js"></script>
    
  </body>