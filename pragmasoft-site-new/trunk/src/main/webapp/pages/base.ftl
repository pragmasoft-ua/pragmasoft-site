<#macro content>
<!-- START NESTED CONTENT -->             
<#nested/>
<!-- END NESTED CONTENT --> 
</#macro>
<#macro apply title="Pragmasoft" header="">
<!DOCTYPE html>
<html lang="${language!"en"}">
  <head>
  	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0">
	<meta name="keywords" content="${keywords!"Pragmasoft, mobile development, Java development, iOS development"}" />
	<#if language="en">
    	<meta name="description" content="${description!"Pragmasoft Ukraine. Software development. Mobile development. Java server development."}">
	<#elseif language="ru">
    	<meta name="description" content="${description!"Pragmasoft Украина. Разработка ПО. Мобильная разработка. Серверная Java разработка."}">
	</#if>

    <meta name="author" content="">
    <link rel="shortcut icon" href="${app}res/img/favicon.ico">

    <title>${title}</title>

   	<title>Pragmasoft</title>

    <!-- Bootstrap core CSS -->
    <link href="${app}res/css/main.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    
    <link href='https://fonts.googleapis.com/css?family=Ubuntu+Condensed&subset=latin,cyrillic' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto:100italic,300,300italic,400,400italic,100&subset=latin,cyrillic' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="${app}res/css/pragmasoft.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="${app}res/js/jquery.easing.1.3.min.js" type="text/javascript"></script>
    <script src="${app}res/js/jquery.ui.totop.min.js" type="text/javascript"></script>
    <script src="${app}res/js/pragmasoft.js" type="text/javascript"></script>
     
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    ${header!}
  </head>
  <body class="body-hover">
    <!--Top Navigation  --> 
    <#include "${language}/navBar.ftl" />
    <@content>
    	<#nested/>    
    </@content>
    <!-- Footer --> 
    <#include "${language}/footer.ftl" />


    <!-- Placed at the end of the document so the pages load faster -->    
    <script src="${app}res/js/bootstrap.min.js"></script>
    <script src="${app}res/js/jquery.scrolly.min.js"></script>
  </body>
  </#macro>