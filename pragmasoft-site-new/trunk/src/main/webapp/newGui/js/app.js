// Page effects initialization
$(document).ready(function() {
	// Title animation
	$('.htitl').animate({left: "+=1000"}, 1000);
	
	// To top button
	$().UItoTop({ easingType: 'easeOutQuart' });
	$('.backtotop').click(function(){
		$('html, body').animate({scrollTop:0}, 'slow');
	});

	// Flexislider
	$('.flexslider').flexslider({
		animation: "slide",
		controlNav: false,
		prevText: "",
		nextText: ""
	});
	
	// Scrolling
	$(window).scroll(function (){
		var window_top = $(window).scrollTop();
		var projects_top = $('a[name="projects"]').offset().top - 10;
		var comand_top = $('a[name="comand"]').offset().top - 10;
		var quality_top = $('a[name="quality"]').offset().top - 300;
		if (window_top > quality_top) {
			$("ul.nav li").removeClass("active");
			$('a[href="#quality"]').parent().addClass("active");
		}
		else if (window_top > comand_top) {
			$("ul.nav li").removeClass("active");
			$('a[href="#comand"]').parent().addClass("active");
		}
		else if (window_top > projects_top) {
			$("ul.nav li").removeClass("active");
			$('a[href="#projects"]').parent().addClass("active");
		}
		else {
			$("ul.nav li").removeClass("active");
			$('a[href="#nas"]').parent().addClass("active");
		}
	});

	$('.parallax.top').scrolly();
	$('.parallax.bkg').scrolly({bgParallax: true});

});