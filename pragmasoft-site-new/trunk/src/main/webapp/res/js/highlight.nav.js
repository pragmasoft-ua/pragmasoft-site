$(document).ready(function() {

	var projects_top = $('a[name="projects"]').offset().top - 10;
	var comand_top = $('a[name="comand"]').offset().top - 10;
	var quality_top = $('a[name="quality"]').offset().top - 300;
	
	
	$(window).on("scroll resize", function (){
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
	
	$('body').one('touchstart', function(event){
		$(this).removeClass("body-hover").addClass("mobile-body-hover");
	});
	
	
	/*.mouseenter() and .mouseleave() */
});