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
	
	$('a.menuItem').click(function(){
		main.stop(true);
		var href = $.attr(this, 'href');
		main.animate({
	        scrollTop: $( href.substr(href.indexOf('#')) ).offset().top
	    }, 800);
	    return true;
	});
	
	// dirty hack to fire some events in Mozilla
	$(window).scrollTop($(window).scrollTop()+1);
	
	var navBar = $('.navbar');
	
	$('body').one('touchstart', function(event){
		$(this).removeClass("body-hover").addClass("mobile-body-hover");
	});
	
	$('.mobile-nav-collapse').on('hide.bs.collapse', function (e) {
		if (navBar.offset().top > 10) {
			$('html, body').animate({scrollTop:0}, 800);
			e.preventDefault();
		}
    }).on('show.bs.collapse', function(e) {
    	if (navBar.offset().top > 10) {
			$('html, body').animate({scrollTop:0}, 800);
		}
    });
	
});
