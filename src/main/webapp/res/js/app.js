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

	var disableScrolling = function() {
		$('html, body').css({
    		'overflow': 'hidden',
    		'height': '100%'
		});
	};

	var enableScrolling = function() {
		$('html, body').css({
		    'overflow': 'auto',
		    'height': 'auto'
		});
	};

	// Disable scrolling while menu is opened in mobile version
	$('button.navbar-toggle').click(function (event) {
		if ($('div.tnavbar').hasClass('in')) {
			enableScrolling();
		} else {
			disableScrolling();
		}
	});

	// Hide menu button on click in mobile mode
	$('.menuItem').click(function(event) {
		if ($('div.tnavbar').hasClass('in')) {
			enableScrolling();
		}
		event.stopPropagation();
		var width = (window.innerWidth > 0) ? window.innerWidth : screen.width;
		var $this = $(this);
		var target = $this.attr('data-parent');
		if (width < 769) {
			$(target).collapse('toggle');
		}
	});

	// Initialize form check
	$('#modalForm').validate({
		rules: {
			requesterName: {
				minlength: 2,
				required: true
			},
			requesterEmail: {
				email: true,
				required: true
			},
			message: {
				minlength: 5,
				required: true
			}
		}
	});		

	$('.m-btn').click(function() {
		if ($('#modalForm').valid()) {
			$.post('/email', $('#modalForm').serialize())
				.done(function() {
					$('#myModal').trigger("reset");
					$('#myModal').modal('hide')
				});
		}
	});

	// dirty hack to fire some events in Mozilla
	$(window).scrollTop($(window).scrollTop()+1);

});