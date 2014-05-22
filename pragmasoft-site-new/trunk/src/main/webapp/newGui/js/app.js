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


	$('.hello').click(function(event) {
		event.stopPropagation();
		var $this = $(this);

		var parent = $this.data('parent');
		var actives = parent && $(parent).find('.collapse.in');

		// From bootstrap itself
		if (actives /*&& actives.length*/) {
			// hasData = actives.data('collapse');
			//if (hasData && hasData.transitioning) return;
			actives.collapse('hide');
		}

		var target = $this.attr('data-target') || (href = $this.attr('href')) && href.replace(/.*(?=#[^\s]+$)/, ''); //strip for ie7

		$(target).collapse('toggle');
	});

});

// $(document).load(function() {
// 	$(document).on('click', '.hello', function(event) {
// 		event.stopPropagation();
// 		var $this = $(this);

// 		var parent = $this.data('parent');
// 		var actives = parent && $(parent).find('.collapse.in');

// 		// From bootstrap itself
// 		if (actives && actives.length) {
// 			hasData = actives.data('collapse');
// 			//if (hasData && hasData.transitioning) return;
// 			actives.collapse('hide');
// 		}

// 		var target = $this.attr('data-target') || (href = $this.attr('href')) && href.replace(/.*(?=#[^\s]+$)/, ''); //strip for ie7

// 		$(target).collapse('toggle');
// 	});
// });