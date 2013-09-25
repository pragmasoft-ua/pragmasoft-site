<#macro apply title="Pragmasoft" language="en">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:fb="http://ogp.me/ns/fb#" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <#-- <meta name="keywords" content="${meta}" /> -->
        <title>${title}</title>
        
        <#-- COMMON -->
        <link href="${app}/res/style/common.css" type="text/css" rel="stylesheet" />
        <link rel="icon" type="image/x-icon" href="${app}/res/images/style/favicon.ico" />
        
        <#-- OTHER -->
        <script type="text/javascript" src="${app}/res/js/common.js"></script>
        <script type="text/javascript" src="${app}/res/js/swfobject.js"></script>
        <link href="https://plus.google.com/101843999873125528372" rel="publisher" />
        <script type="text/javascript">
            (function() 
            {var po = document.createElement("script");
            po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(po, s);
            })();
        </script>
        
        <#-- ZOOM -->
        <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js'></script>
        <script type="text/javascript" src="${app}/res/js/jquery.zoom.js"></script>
        <script type="text/javascript">
		    $(document).ready(function(){			
			    $('.zoom').closest('#ex3').zoom({ on:'click' });	
		    });
	    </script>
    </head>
    <body id="body">
       <div id="fb-root"></div>
       <script src="//connect.facebook.net/en_US/all.js"></script>
       <script>
          FB.init({
          appId  : '119171458143800',
          status: true, // check login status
          cookie: true, // enable cookies to allow server to access session,
          xfbml: true, // enable XFBML and social plugins
          oauth: true, // enable OAuth 2.0     
        });
       </script>
        <div class="main_container">
            <!-- Header -->
            <div class="header">
                <!-- Need to define season! -->
                <div class="bg fall">
                    <div class="langs_pt act_en">
                        <!-- You can add class "act_ru" or "act_en" to this div -->
                        <a href="${currentPath}?language=ru" onfocus="this.blur()" class="ln_ru">ru</a> <span class="bg_flag"><!-- --></span> <a href="${currentPath}?language=en" onfocus="this.blur()" class="ln_en">en</a>
                        <div class="cl_b">
                            <!-- -->
                        </div>
                    </div>
                    <div class="logo">
                        <img src="${app}/res/images/style/logo.gif" width="292" height="67" alt="" />
                        <div class="cl_b">
                            <!-- -->
                        </div>
                    </div>
                </div>
            </div>
            
            <!-- Navigation bar -->
            <#include "navBar_${language}.ftl" />
            
            <div class="cl_b">
                <!-- -->
            </div>
            
            <!-- Main content -->
            <div class="main_content">
<!-- START NESTED CONTENT -->				
<#nested/>
<!-- END NESTED CONTENT -->	
                <div class="nav_right">
                    <!-- Login -->
                    <div class="border_panel"></div>

                    <!-- Search -->
                    <div id="panelSearch" class="border_panel mode_expand">
                    <!-- additional class="mode_expand" or "mode_min" or none-->
                        <div class="bord_top_r">
                            <div class="bord_top_l"><!-- --></div>
                        </div>
                        <div class="middle_cont">
                            <form action="${app}/WebSearch">
                                <div class="search_part">
                                    <input id="globalsearchinput" type="text" name="text" value="search..." size="15" 
                                    onfocus="if (this.value == 'search...') {value=''; this.style.color='';} this.select();" 
                                    onblur="if (this.value == '') {value='search...'; this.style.color='#bbbbbb';} this.blur();"
                                    style="color: #bbbbbb;"
                                    />
                                    <button type="submit"></button>
                                    <div class="cl_b_free"><!-- --></div>
                            </div>
                            </form>
                        </div>
                        <div class="bord_bot_r">
                            <div class="bord_bot_l"><!-- --></div>
                        </div>
                    </div>

                    <!-- Navigation panel -->
                    <div class="separator"></div>

                    <!-- Recent news panel -->
                    <div class="news_part">
                        <h3>Here will be news</h3>
                        <!-- News -->
                    </div>
                    <div class="separator"></div><!-- Cloud -->
                    <div class="tag_cloud"></div>
                    <div class="separator"></div><!-- Subscribe rss -->
                    <div class="rss_part">
                        <!-- RSS -->
                    </div>
                </div>
            </div>
            <!-- Footer -->
            <div class="footer">
                <div class="desc">
                    <div class="text">
                        © 2011 Pragmasoft.
                        <div>
                            All rights reserved
                        </div>
                        <div>
                            <a href="mailto:info@pragmasoft.com.ua">E-mail us</a>
                        </div>
                    </div>
                </div>
                <g:plus href="https://plus.google.com/101843999873125528372" size="smallbadge"></g:plus>
                <fb:like-box href="http://www.facebook.com/pages/Pragmasoft/340275132655051" width="220" show_faces="false" stream="false" header="false"></fb:like-box>
                <div class="cl_b">
                    <!-- -->
                </div>
                <link type="text/css" rel="stylesheet" href="${app}/res/style/SyntaxHighlighter.css" />
                <script language="javascript" src="${app}/res/js/shCore.js"></script>
                <script language="javascript" src="${app}/res/js/shBrushJava.js"></script>
                <script language="javascript" src="${app}/res/js/shBrushJScript.js"></script>
                <script language="javascript" src="${app}/res/js/shBrushSql.js"></script>
                <script language="javascript" src="${app}/res/js/shBrushXml.js"></script>
                <script language="javascript">
                    dp.SyntaxHighlighter.ClipboardSwf = '/flash/clipboard.swf';
                    dp.SyntaxHighlighter.HighlightAll('code');
                </script>
            </div>
        </div>
    </body>
</html>
</#macro> 
