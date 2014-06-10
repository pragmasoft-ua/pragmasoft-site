<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="logo backtotop"><a href="${app}" ><img src="${app}/res/img/pragmasoft.png" alt="Pragmasoft"></a></div>
    <div class="logo-sm"><img src="${app}/res/img/pragmasoft-sm.png" alt="Pragmasoft"></div>
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
      <span class="sr-only">navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <div class="tnavbar navbar-collapse collapse" id="menu" style="height: 1px;">
      <ul class="nav navbar-nav">
        <li><a href="${app}#nas" id="nas" class="menuItem" data-parent=".tnavbar" onclick="return anchorScroller(this)" >About Us</a></li>
        <li><a href="${app}#projects" id="projects" class="menuItem" data-parent=".tnavbar" onclick="return anchorScroller(this)">Projects</a></li>
        <li class="comd"><a href="${app}#comand" id="comand" class="menuItem" data-parent=".tnavbar" onclick="return anchorScroller(this)">Our team</a></li>
        <li><a href="${app}#quality" id="quality" class="menuItem" data-parent=".tnavbar" onclick="return anchorScroller(this)">Quality</a></li>
        <li><a href="${app}/vacancies">Vacancies</a></li>
        <li class="npnm"><a href="#" data-toggle="modal" data-target="#myModal">Contact us</a></li>
        <ul class="sm-navlang">
          <li><a href="${currentPath}?language=ru">RU</a></li>
          <li class="act"><a href="#">EN</a></li>
        </ul>
        <ul class="sm-soc">
          <li><a href="#" data-toggle="modal" data-target="#myModal"><img src="${app}/res/img/2_mail.png"></a></li>
          <li><a href="http://vk.com/club32131862" target="_blank"><img src="${app}/res/img/2_vk.png"></a></li>
          <li><a href="https://www.facebook.com/pages/Pragmasoft/681936695176034" target="_blank"><img src="${app}/res/img/2_fb.png"></a></li>
          <li><a href="https://plus.google.com/u/0/b/118413409251721843650/118413409251721843650/about?hl=ru" target="_blank"><img src="${app}/res/img/2_g+.png"></a></li>
        </ul>
      </ul>
    </div>
    <div class="tmail" data-toggle="modal" data-target="#myModal"></div>
    <div class="lang">
      <ul class="navlang">
        <li><a href="${currentPath}?language=ru">RU</a></li>
        <li class="active"><a href="#">EN</a></li>
      </ul>
    </div>
  </div>
</div>