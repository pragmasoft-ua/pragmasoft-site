// Page effects initialization
$(document).ready(function() {
	// Title animation
	$('.htitl').animate({left: "+=1000"}, 1000);
	
	// To top button
	$().UItoTop({ easingType: 'easeOutQuart' });
	$('.backtotop').click(function(){
		$('html, body').animate({scrollTop:0}, 'slow');
	});
	
	var main = $('html, body');
	
	$('.nav li a').click(function(){
		main.stop(true);
		main.animate({
	        scrollTop: $( $.attr(this, 'href').substr(1) ).offset().top
	    }, 800);
	    return true;
	});
	

	// Flexislider
	$('.flexslider').flexslider({
		animation: "slide",
		controlNav: false,
		prevText: "",
		nextText: ""
	});

	// dirty hack to fire some events in Mozilla
	$(window).scrollTop($(window).scrollTop()+1);
	
	$('body').one('touchstart', function(event){
		$(this).removeClass("body-hover").addClass("mobile-body-hover");
	});
	
});
