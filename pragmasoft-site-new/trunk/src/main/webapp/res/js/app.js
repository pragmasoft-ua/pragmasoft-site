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

	$('.parallax.top').scrolly();
	$('.parallax.bkg').scrolly({bgParallax: true});


	$('.menuItem').click(function(event) {
		event.stopPropagation();
		var width = (window.innerWidth > 0) ? window.innerWidth : screen.width;
		var $this = $(this);
		var target = $this.attr('data-parent');
		if (width < 769) {
			$(target).collapse('toggle');			
		}
	});

});