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

	// Hide menu button on click in mobile mode
	$('.menuItem').click(function(event) {
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

});