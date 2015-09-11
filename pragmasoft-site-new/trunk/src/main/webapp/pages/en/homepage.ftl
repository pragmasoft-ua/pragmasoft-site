<#assign headerContent>
	<!-- FlexSlider -->
    <link rel="stylesheet" href="${app}res/css/flexslider.css" type="text/css" media="screen" />
	<script defer src="${app}res/js/jquery.flexslider-min.js"></script>
	<script src="${app}res/js/highlight.nav.js" type="text/javascript"></script>
	<script src="${app}res/js/jquery.ui.totop.min.js" type="text/javascript"></script>
</#assign>
<#import "../base.ftl" as base />
<@base.apply header=headerContent>
	<!--block1  --> 
    <div class="block1">
      <div class="top-col-tr">
        <div class="container">
          <div class="row">
              <div class="htitl"><img src="${app}res/img/01f_txt.png"></div>
              <div class="htitl-med"><img src="${app}res/img/01f_txt.png"></div>
              <div class="htitl-sm"><img src="${app}res/img/01m_txt_2.png"></div>
              <div class="tslide flexslider">
                <ul class="slides">
                  <li><p>«This is a great vendor and I really hope to work with them again. They are professional, knowledgeable and reliable. Great job!»</p></li>
                  <li><p>«Very responsive and professional. Would not hesitate to contact them again.»</p></li>
                  <li><p>«Pragmasoft exceeded my expectations by far. They are exceptionally professional, fast, creative and really care about a satisfying result for their customers. They also really tried to understand our domain, gave us a lot of feedback and insights and enriched our project with a lot of their own ideas. So to sum up, I think we couldn't have found a better partner for our project. Thanks for doing an amazing job!»</p></li>
                  <li><p>«The team was quickly able to understand the problems needed to be solved and was very good at quality assurance. They also showed in depth knowledge of the technology and advised me on many issues.»</p></li>
                  <li><p>«The Site Map far exceeded all expectations. Very very hard worker and provided an awesome start to the project.»</p></li>
                  <li><p>«We're very happy with our designs from pragmasoft so far. They're easy to work with and have been able to provide a nice, clean, new redesign to our current site. They also know how to optimize graphics for faster loading which is essential for today's web. We can't wait to start implementing the designs they've sent over.»</p></li>
                  <li><p>«Very professional and creative team. Sharp communication, responsive and work in timely-fashion manner. Highly recommended»</p></li>
                  <li><p>«I was extremely impressed by the services that Pragmasoft offered. I'd definitely work with them again.»</p></li>
                  <li><p>«It was an absolute pleasure to work with the team at Pragmasoft. We were extremely satisfied with the website design work they did for us here at PMRobot.»</p></li>
                  <li><p>«Very happy with expertise and service Pragmasoft has provided on this first project with them. I'm sure I will be a repeat customer.»</p></li>
                  <li><p>«This team went above &amp; beyond in terms of responsiveness, quality, and communication! I would recommend this firm to anyone looking for a strong HTML / front-end development team.»</p></li>
                  <li><p>«Working with them for years, always good results!»</p></li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  
  <div id="about"></div>
    <!--block2  -->      
    <div class="block2"><div class="shad-t2"></div>
      <div class="container">
        <div class="row">
          <div class="main-container">
            <div class="hndr">
              <img src="${app}res/img/10+txt-2.png" alt="">
              <div class="txt1"><span>10</span><br /><br />years<br />of successful<br />software<br />development</div>
              <div class="txt2"><span>100+</span><br /><br />successfully<br />completed<br />projects</div>
              <div class="txt3"><span>100%</span><br /><br />result-<br />oriented<br />company</div>
              <div class="txt4"><span>1000+</span><br /><br />positive<br />feedbacks<br />from our<br />customers</div>
            </div>
              
            <div class="bl2-anim">
              <div class="gus-sm"><img src="${app}res/img/01_main_b.png"></div>
              <div><h2>What we offer</h2></div>
              <div class="bl2-sm">Cutting-edge<br />technologies<hr />Great experience<br />in developing<br />commercially<br />successful projects<hr />Exceptional quality<hr />Wide range<br />of services<hr />Individual approach<br />&amp; fresh ideas</div>             
              <div class="cl2 cl2-left"><div class="alr">Cutting-edge technologies<hr />Great experience in developing commercially successful projects</div>
              <div class="chrph"><img src="${app}res/img/01_main_che.png"></div>
              </div>
              <div class="cl2 cl2-right"><div class="all">Exceptional quality<hr />Wide range of services<hr />Individual approach<br />&amp; fresh ideas</div>
              <div class="gus"><img src="${app}res/img/01_main_b.png"></div>
              </div>
            </div>              
          </div>
        </div>
      </div>    
    </div>
 
 <div id="projects"></div>
    <!--block3  -->      
    <div class="block3">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Mobile App<br />Development</h2>
            <p>In today's world, phones have long ceased to be a communication means only. They enable us to be in touch with our near and dear ones, to stay tuned, to kill time in queues,to stay in social networks for hours  or to play applications. We keep so much information in our phones that can hardly imagine life without them. Precisely these needs created a great space for mobile developers.</p>
            <p>We really are professionals in mobile software development and can offer you not only a full cycle software development process for IOS, Android, Blackberry mobile platforms, but also the server-side.</p><br /><br />

            <p class="uper norm">What we offer</p>
            <ul class="tpage">
              <li>IOS,</li>
              <li>Android,</li>
              <li>Cross platform,</li>
              <li>Server-side,</li>
              <li>Client solutions.</li>
            </ul>
            <div class="prodj">
              <a class="view view-first" href="project/strange-parcel">
                <img src="${app}res/img/project/mobile/elfishki.jpg" />
                <div class="mask">
                  <h2>Elfishki</h2>
                  <p>Network Reachability, Core Graphics Framework</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/isign">
                <img src="${app}res/img/project/mobile/isign.jpg" />
                <div class="mask">
                  <h2>iSIgn</h2>
                  <p>Network Reachability, Core Graphics Framework</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first"  href="project/mobile-learning-solution" >
                <img src="${app}res/img/project/mobile/mls.jpg" />
                <div class="mask">
                  <h2>MLS</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first"  href="project/storelocator">
                <img src="${app}res/img/project/mobile/storelocator-logo.png" />
                <div class="mask">
                  <h2>Storelocator</h2>
                  <p>Apache Cordova/PhoneGap, jQuery mobile, Facebook and Google OAuth 2.0</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/magic-childrens-coloring-books">
                <img src="${app}res/img/project/mobile/story.jpg" />
                <div class="mask">
                  <h2>Magic Children’s Coloring Books</h2>
                  <p>Facebook API, Media Player Framework</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/vyke">
                <img src="${app}res/img/project/mobile/vike.jpg" />
                <div class="mask">
                  <h2>Vyke</h2>
                  <p>AndroidSDK</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first"  href="project/wlcome">
                <img src="${app}res/img/project/mobile/wlcome.jpg" />
                <div class="mask">
                  <h2>Wlcome</h2>
                  <p>J2EE (EJB 3.0, JPA, JAX-RS), Arquillian for testing</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/email-manager" >
                <img src="${app}res/img/project/mobile/email.jpg" />
                <div class="mask">
                  <h2>EMAIL MANAGER</h2>
                  <p>UIKit, Custom Table View Control, Async Web Requests</p>
                  <span class="info">Read More</span>
                </div>
            <a class="view view-first" href="project/FaceRecognizer" >
                <img src="${app}res/img/project/mobile/fr_logo.png" />
                <div class="mask">
                  <h2>FACE RECOGNIZER</h2>
                  <p>OpenCV</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/trakit" >
                <img src="${app}res/img/project/mobile/trak_logo.png" />
                <div class="mask">
                  <h2>TRAKIT</h2>
                  <p>OpenEars, Tesseract OCR, REST API, Network Reachability, Async Web Requests</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first"  href="project/careinnovations">
                <img src="${app}res/img/project/mobile/cilogo.png" />
                <div class="mask">
                  <h2>Care Innovations</h2>
                  <p>Google PlayStore SDK, Google API Client Library for Java, Android SDK</p>
                  <span class="info">Read More</span>
                </div>
              </a>
                  <a class="view view-first" href="project/voyage" >
                <img src="${app}res/img/project/mobile/v_logo.png" />
                <div class="mask">
                  <h2>VOYAGES</h2>
                  <p>GPS, maps, geocodes, json, restful api, core data, async networking</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              </a> 
            </div>
          </div>
        </div>
      </div>         
      <div class="bl3-bg2 parallax top" data-velocity="-.1"></div>
      <div class="bl3-bg3 parallax top" data-velocity="-.5"></div>
      <div class="bl3-bg4 parallax top" data-velocity="-.7"></div>
      <div class="bl3-bg5 parallax top" data-velocity="-.9"></div>
      <div class="bl3-bg6 parallax top" data-velocity="-.5"></div>
      <div class="bl3-bg7 parallax top" data-velocity="-.7"></div>
      <div class="bl3-bg8 parallax top" data-velocity="-.9"></div>
    </div>

    <!--block4  -->      
    <div class="block4">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Java Server applications</h2>
            <p class="uper norm">Advantages of Server application</p>
            <p>Server applications have a number of advantages:</p>
            <ul class="tpage">
              <li>The integrity of the data and code. With business logic on a single server, you can guarantee updating and improvement applications for all users. There is no risk that the old version of the application can access data or could to change them old inconsistent manner.</li>
              <li>Safety. The application server is the central point that allows you to remove the responsibility from potentially unsafe client level to the application server level, optionally hiding the database level.</li>
              <li>Centralized configuration and management. Any changes in the application settings can be performed centrally.</li>
              <li>Transaction support. Possibility to reduce cost and time for development.</li>
            </ul>
            <br /><br />

            <p class="uper norm">What we offer</p>
            <p>Server-side/client-side high quality Java applications.<br />
Pragmasoft Team has a great experience in server application development. Our experience along with the latest technologies and individual approach to each Сlient will provide you with a reliable partner that can meet your requirements and realize the most challenging ideas.</p>
            <div class="prodj">
              <a class="view view-first"  href="project/affordrx">
                <img src="${app}res/img/project/java/affordx.jpg" />
                <div class="mask">
                  <h2>Affordx</h2>
                  <p>JavaEE, RestEASY, HTMLEasy, MySQL, Hibernate, Jboss7</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/handpoint">
                <img src="${app}res/img/project/java/handpoint.jpg" />
                <div class="mask">
                  <h2>Handpoint</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/mdc">
                <img src="${app}res/img/project/java/mdc.jpg" />
                <div class="mask">
                  <h2>Medication Discount Card</h2>
                  <p>JavaEE, RestEASY, HTMLEasy, MySQL, Hibernate, Jboss7</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/vyke-dashboard">
                <img src="${app}res/img/project/java/vyke-dash.jpg" />
                <div class="mask">
                  <h2>VYKE Dashboard</h2>
                  <p>JavaEE, JSF, RichFaces, AJAX4JSF, SIFR, Facelets</p>
                  <span class="info">Read More</span>
                </div>
              </a>              
              <a class="view view-first" href="project/fna">
                <img src="${app}res/img/project/java/fna-logo.jpg" />
                <div class="mask">
                  <h2>FNA</h2>
                  <p>JD3.JS, SVG, Require JS, Grunt, LESS, Bootstrap, MVVM architecture</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/vyke-communications">
                <img src="${app}res/img/project/java/vyke-j.jpg" />
                <div class="mask">
                  <h2>Vyke Communications</h2>
                  <p>JavaEE, Spring, Hibernate, JSF, AJAX (Richfaces)</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="${app}${language}/contactus">
                <img src="${app}res/img/project/free-project2.jpg" />
                <div class="mask">
                  <h2>Order a Project</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Order a project</span>
                </div>
              </a>
              <a class="view view-first" href="project/prinly">
                <img src="${app}res/img/project/java/prinly.jpg" />
                <div class="mask">
                  <h2>Prinly</h2>
                  <p>Adobe Flex, Java, JavaScript, REST, Spring, Hibernate, Apache Click</p>
                  <span class="info">Read More</span>
                </div>
              </a>       
           <a class="view view-first" href="project/highestcockpit">
                <img src="${app}res/img/project/java/HIGHESTcockpit_icon.jpg" />
                <div class="mask">
                  <h2>Highestcockpit</h2>
                  <p>ReactJS, Gupl, SASS, Spring, SpringData, SpringBoot, JHipster</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/openemm">
                <img src="${app}res/img/project/java/openemm_logo.png" />
                <div class="mask">
                  <h2>OpenEMM</h2>
                  <p>Java, JavaMail, Spring, Spring-WS, Struts, JDBC, MySQL, Oracle, Ehcache</p>
                  <span class="info">Read More</span>
                </div>
              </a> 
              <a class="view view-first" href="project/acai">
                <img src="${app}res/img/project/design/acai_ico.png" />
                <div class="mask">
                  <h2>ACAI AUTHOR</h2>
                  <p>Bootstrap, Spring, Tiles, JQuery, MarkItUp!, DZSlides</p>
                  <span class="info">Read More</span>
                </div>
              </a>              
            </div>
          </div>
        </div>
      </div>
      <div class="bl4-bg2 parallax top" data-velocity="-.1"></div>
      <div class="bl4-bg3 parallax top" data-velocity="-.5"></div>
      <div class="bl4-bg4 parallax top" data-velocity="-.7"></div>
      <div class="bl4-bg5 parallax top" data-velocity="-.9"></div>

      <div class="bl4-bg6 parallax top" data-velocity="-.5"></div>
      <div class="bl4-bg7 parallax top" data-velocity="-.7"></div>
      <div class="bl4-bg8 parallax top" data-velocity="-.9"></div>
    </div>

    <!--block5  -->
    <div class="block5">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Cloud<br />computing</h2>
            <p class="uper norm">Advantages of cloud computing</p>
            <ul  class="tpage">
              <li>Disk space saving</li>
              <li>High speed of data processing</li>
              <li>Reduction of costs for hardware, software, maintenance and  electricity</li>
              <li>Reduced requirements for the PC processing power (access to the Internet is a must)</li>
              <li>Security</li>
              <li>Fault-tolerance</li>
            </ul>
            <p>Cloud computing is a profitable opportunity for enterprises to move their servers and IT departments to outsource, thereby reduce overhead costs and focus more on core business.</p><br /><br />
            <p class="uper norm">What we offer</p>
            <p>IaaS (Infrastructure as a Service), PaaS (Platform as a Service), SaaS (Software as a Service), Public, Private, Hybrid Clouds.</p>
            <div class="prodj">
              <a class="view view-first" href="project/amarco">
                <img src="${app}res/img/project/cloud/desk-mark.jpg" />
                <div class="mask">
                  <h2>AMARCO</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/mtp">
                <img src="${app}res/img/project/cloud/Mobile-Ticketing.jpg" />
                <div class="mask">
                  <h2>Ticket Gretchen</h2>
                  <p>JavaEE6, AWS, DynamoDB, JPA, EJB3</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/resume">
                <img src="${app}res/img/project/cloud/resume-io.jpg" />
                <div class="mask">
                  <h2>Resume-io</h2>
                  <p>Google Appengine (GAE), JavaEE, JDO, CDI, iText</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first mobile-hide" href="${app}${language}/contactus">
                <img src="${app}res/img/project/free-project.jpg" />
                <div class="mask">
                  <h2>Order a project</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Order a project</span>
                </div>
              </a> 
              <a class="view view-first" href="project/jagermeister">
                <img src="${app}res/img/project/cloud/Jagermeister_logo.png" />
                <div class="mask">
                  <h2>Jagermeister</h2>
                  <p>Java, Spring Security, Google Guava, JClouds, React JS, React Router, Grunt</p>
                  <span class="info">Read More</span>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="bl5-bg2 parallax top" data-velocity="-.1"></div>
      <div class="bl5-bg3 parallax top" data-velocity="-.5"></div>
      <div class="bl5-bg4 parallax top" data-velocity="-.7"></div>
      <div class="bl5-bg5 parallax top" data-velocity="-.9"></div>

      <div class="bl5-bg6 parallax top" data-velocity="-.5"></div>
      <div class="bl5-bg7 parallax top" data-velocity="-.7"></div>
      <div class="bl5-bg8 parallax top" data-velocity="-.9"></div>
    </div>

    <!--block6  -->
    <div class="block6">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Graphic<br />&amp; Web design</h2>               
            <p>Pragmasoft specialists provide clients with website development, graphic design, illustrations, for almost 10 years. Some of our results you can find in our gallery. Our expertise enables us to perform design projects in various spheres and on different levels of complexity.<br />
Range of services provided by our company includes branding with corporate style concept, logo design from the very start of your business or slightly refreshing of existed one. We also can provide you with  hand-drawn and vectorized development or offer you a bright and stylish animation.<br />
We propose a wide range of solutions in website development from simple informational sites to complex multifunctional social networks. We have wide experience in development of complicated, cross functional web sites with development of complex schedules, using front-end technology rather than ready-made components.<br />
Nevertheless, at the heart of our projects are always the business goals of the Client and our specialists are always full of fresh ideas and original solutions.</p><br /><br />
<p class="uper norm">What we offer</p>
<p>Server side, client side, front end, back-end realization, web, Javascript, HTML5, CSS3.<br />
We are constantly evolving to always keep up with fashion trends and make you contacted us again and again.</p>
            <div class="prodj">
              <a class="view view-first" href="project/abc">
                <img src="${app}res/img/project/design/abc.jpg" />
                <div class="mask">
                  <h2>All Business Cards</h2>
                  <p>Web design, logo design, Flash banner animation, XHTML/CSS</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/acs">
                <img src="${app}res/img/project/design/acs.jpg" />
                <div class="mask">
                  <h2>Acs</h2>
                  <p>Header redesign, HTML/CSS</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/arcas">
                <img src="${app}res/img/project/design/arcas.jpg" />
                <div class="mask">
                  <h2>Arcas</h2>
                  <p>JavaScript, Jquery, HTML/CSS</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/branchenbuch">
                <img src="${app}res/img/project/design/branch.jpg" />
                <div class="mask">
                  <h2>BRANCHENBUCH</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Read More</span>
                </div>
              </a>              
              <a class="view view-first" href="project/close-friends">
                <img src="${app}res/img/project/design/friends.jpg" />
                <div class="mask">
                  <h2>Friends</h2>
                  <p>Web design, UI optimization, logo design</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/horse-racing">
                <img src="${app}res/img/project/design/horse.jpg" />
                <div class="mask">
                  <h2>HORSE RACING</h2>
                  <p>Web design, UI optimization, logo design, XHTML/CSS</p>
                  <span class="info">Read More</span>
                </div>
              </a>
              <a class="view view-first" href="project/jacksonco">
                <img src="${app}res/img/project/design/jackson.jpg" />
                <div class="mask">
                  <h2>JACKSONCO SUPPLY</h2>
                  <p>Web design, logo design, icon design, UI optimization</p>
                  <span class="info">Read More</span>
                </div>
              </a>
           		<a class="view view-first" href="project/thundermist">
                <img src="${app}res/img/project/design/thunder.jpg" />
                <div class="mask">
                  <h2>THUNDERMIST</h2>
                  <p>JavaEE, Spring, Hibernate, JavaME, C++, ATL, WTL, MFC</p>
                  <span class="info">Read More</span>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>              
      <div class="bl6-bg2 parallax top" data-velocity="-.1"></div>
      <div class="bl6-bg3 parallax top" data-velocity="-.5"></div>
      <div class="bl6-bg4 parallax top" data-velocity="-.7"></div>
      <div class="bl6-bg5 parallax top" data-velocity="-.9"></div>

      <div class="bl6-bg6 parallax top" data-velocity="-.5"></div>
      <div class="bl6-bg7 parallax top" data-velocity="-.7"></div>
      <div class="bl6-bg8 parallax top" data-velocity="-.9"></div>
    </div>

    <!--block7 ukraine  -->
    <div class="block7">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Why Ukraine</h2>
            <ul class="ukr">
              <li>Ukraine is among the five world leaders in export of software products</li>
              <li>Ukraine is among the 30 leading countries in the field of IT-outsourcing</li>
              <li>Ukraine is the only country in Eastern Europe that has got to the top 25 countries with the best system
              of higher education (rating was made by The global network
              of research universities "Universitas 21")</li>
              <li>Ukraine is ranked fourth place in the world by number <br />
              of certified IT-specialists</li>
              <li>Each year, Ukrainian universities graduate<br />
              about 16,000 specialists in IT sphere.</li>
            </ul>
            
            <p>Availability of qualified, certified specialists<br />in combination with a wealth of experience <br />proportionate to the demand of the world market,<br /> has provided Ukraine with a powerful potential.</p>          
            <div class="bl7-bg1"></div>
            <div class="bl7-bg1-sm"><img src="${app}res/img/03m_ua.png"></div>
          </div>
        </div>
      </div>
    </div>

<div id="team"></div>
    <!--block8 vakansii  -->
<div id="photo-block" class="block8">    
	<div class="container">
   <div class="row">
   <div class="main-container">
   <h2>Our team</h2>
   
   	<div id="photo-container" class="clearfix">
   		    <div class="item p1"><img src="${app}res/img/foto-greyscale/1.jpg"></div>
   		    <div class="item p1-mobile"><img src="${app}res/img/foto-greyscale/1.1.jpg"></div>
   	    	<div class="item p2"><img src="${app}res/img/foto-greyscale/2.jpg"></div>
   	    	<div class="item p3"><img src="${app}res/img/foto-greyscale/3.jpg"></div>
   	    	<div class="item p4"><img src="${app}res/img/foto-greyscale/4.jpg"></div>
   	    	<div class="item p5"><img src="${app}res/img/foto-greyscale/5.jpg"></div>
   	    	<div class="item p6"><img src="${app}res/img/foto-greyscale/6.jpg"></div>
   	    	<div class="item p7"><img src="${app}res/img/foto-greyscale/7.jpg"></div>
   	    	<div class="item p8"><img src="${app}res/img/foto-greyscale/8.jpg"></div>
	   	    <div class="item p9"><img src="${app}res/img/foto-greyscale/9.jpg"></div>
   		    <div class="item p10"><img src="${app}res/img/foto-greyscale/10.jpg"></div>
   		    <div class="item p10-mobile"><img src="${app}res/img/foto-greyscale/10.1.jpg"></div>
  	 </div>
  	 <div class="vacancy"><a href="${app}${language}/vacancies">Join the team →</a></div>
  	 </div>
  	 </div>
  	 </div>
 </div>
    
    
   
      
       
 <div id="quality"></div>
  <!--block9 -->
  <div class="block9">
    <div class="botimg">
      <div class="container">
        <div class="row">
          <div class="main-container">
            <h2>Software Quality<br />Assurance</h2>
            <p>We put serious attention to quality of our product. We have dedicated QA department, and fair number of devices available for testing, including smart-phones and tablets (IOS, Android, Blackberry and Win Phone powered).</p><br />
            <p>Our team has wide software testing experience from  simple applications to complicated cross-functional ones to offer our Clients the best software quality assurance services.</p>
            <div class="ftifl">When ideas<br />
              &nbsp;&nbsp;&nbsp;&nbsp;turn into real<span>it</span>y
            </div>
          </div>
        </div>  
      </div>          
    </div>
  </div>
</@base.apply>
