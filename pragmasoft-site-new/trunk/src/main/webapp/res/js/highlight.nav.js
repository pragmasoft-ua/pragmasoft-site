$(document).ready(function() {
	var projects = $('#projects');
	var command = $('#team');
	var quality = $('#quality');
	
	$(window).on("scroll resize", function (){
		var projects_top = projects.offset().top - 10;
		var comand_top = command.offset().top - 10;
		var quality_top = quality.offset().top - 300;
			var window_top = $(window).scrollTop();
			$("ul.nav li").removeClass("active");
			if (window_top > quality_top) {
				$('a#qual').parent().addClass("active");
			}
			else if (window_top > comand_top) {
				$('a#com').parent().addClass("active");
			}
			else if (window_top > projects_top) {
				$('a#proj').parent().addClass("active");
			}
			else {
				$('a#we').parent().addClass("active");
			}
		});
	
	$('.parallax.top').scrolly();
	$('.parallax.bkg').scrolly({bgParallax: true});
	$('.flexslider').flexslider({animation:"slide",controlNav:false,prevText:"",nextText:""});
});