<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns:fb="http://ogp.me/ns/fb#" xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <#-- <meta name="keywords" content="${meta}" /> -->
        <title>${title}</title>
        
        <#-- COMMON -->
        <link href="style/common.css" type="text/css" rel="stylesheet" />
        <link rel="icon" type="image/x-icon" href="images/favicon.ico" />
        
        <#-- OTHER -->
        <script type="text/javascript" src="prototype.js"></script>
        <script type="text/javascript" src="js/common.js"></script>
        <script type="text/javascript" src="js/swfobject.js"></script>
        <link type="text/css" rel="stylesheet" href="floatbox/floatbox.css" />
        <script type="text/javascript" src="floatbox/floatbox.js"></script>
        <link href="https://plus.google.com/101843999873125528372" rel="publisher" />
        <script type="text/javascript">
            (function() 
            {var po = document.createElement("script");
            po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(po, s);
            })();
        </script>
    </head>
    <body id="body">
        <div id="fb-root"></div>
        <script>
            (function(d, s, id) {
            var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/ru_RU/all.js#xfbml=1&appId=119171458143800";
            fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
        </script>
        <div class="main_container">
            <!-- Header -->
            <div class="header">
                <!-- Need to define season! -->
                <div class="bg fall">
                    <div class="langs_pt act_en">
                        <!-- You can add class "act_ru" or "act_en" to this div -->
                        <a href="#/bin/view/Main/?language=ru" onfocus="this.blur()" class="ln_ru">ru</a> <span class="bg_flag"><!-- --></span> <a href="#/bin/view/Main/?language=en" onfocus="this.blur()" class="ln_en">en</a>
                        <div class="cl_b">
                            <!-- -->
                        </div>
                    </div>
                    <div class="logo">
                        <img src="images/logo.gif" width="292" height="67" alt="" />
                        <div class="cl_b">
                            <!-- -->
                        </div>
                    </div>
                </div>
            </div><!-- Navigation bar -->
            <div class="main_menu" style="width:786px;">
                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                    <tr>
                        <td class='left_tab'>
                            <a title="Blog" href="#/bin/view/Main/Blog" onfocus="this.blur();"><img src="images/icon_menu_bul_small.gif" width="9" height="9" alt="" /> <span>Blog</span></a>
                        </td>
                        <td class=''>
                            <a title="Our projects" href="#/bin/view/Main/Projects" onfocus="this.blur();"><img src="images/icon_menu_bul_small.gif" width="9" height="9" alt="" /> <span>Our projects</span></a>
                        </td>
                        <td class='active'>
                            <a title="About us" href="#/bin/view/Main/" onfocus="this.blur();"><img src="images/icon_menu_bul_big.gif" width="9" height="9" alt="" /> <span>About us</span></a>
                        </td>
                        <td class=''>
                            <a title="Vacancies" href="#/bin/view/Main/Vacancies" onfocus="this.blur();"><img src="images/icon_menu_bul_small.gif" width="9" height="9" alt="" /> <span>Vacancies</span></a>
                        </td>
                        <td class=''>
                            <a title="Contacts" href="#/bin/view/Main/Contacts" onfocus="this.blur();"><img src="images/icon_menu_bul_small.gif" width="9" height="9" alt="" /> <span>Contacts</span></a>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="cl_b">
                <!-- -->
            </div>
            <div class="main_content">
                <!-- Main content -->
                <div class="content">
                    <div class="desc">
                        ${text}
                    </div>
                    <!-- Content -->
                </div>
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
                            <form action="#/bin/view/Main/WebSearch">
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
                <link type="text/css" rel="stylesheet" href="style/SyntaxHighlighter.css" />
                <script language="javascript" src="js/shCore.js"></script>
                <script language="javascript" src="js/shBrushJava.js"></script>
                <script language="javascript" src="js/shBrushJScript.js"></script>
                <script language="javascript" src="js/shBrushSql.js"></script>
                <script language="javascript" src="js/shBrushXml.js"></script>
                <script language="javascript">
                    dp.SyntaxHighlighter.ClipboardSwf = '/flash/clipboard.swf';
                    dp.SyntaxHighlighter.HighlightAll('code');
                </script>
            </div>
        </div>
    </body>
</html>
