// Page effects initialization
$(document).ready(function() {
	$('#photo-container').masonry({
		  columnWidth: 220,
		  itemSelector: '.item',
		  isFitWidth: true,
		  gutter: 1
	});
	
	var modalForm = $('#modalForm');
	// Initialize form check
	var validator = modalForm.validate({
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

	var UserScrollDisabler = function() {	    
	    // spacebar: 32, pageup: 33, pagedown: 34, end: 35, home: 36
	    // left: 37, up: 38, right: 39, down: 40
	    this.scrollEventKeys = [32, 33, 34, 35, 36, 37, 38, 39, 40];
	    this.$window = $(window);
	    this.$document = $(document);	    
	};
	UserScrollDisabler.prototype = {	    
	    disable_scrolling : function() {
	        var t = this;
	        t.$window.on("mousewheel.UserScrollDisabler DOMMouseScroll.UserScrollDisabler", this._handleWheel);
	        t.$document.on("mousewheel.UserScrollDisabler touchmove.UserScrollDisabler", this._handleWheel);
	        t.$document.on("keydown.UserScrollDisabler", function(event) {
	            t._handleKeydown.call(t, event);
	        });
	    },	    
	    enable_scrolling : function() {
	        var t = this;
	        t.$window.off(".UserScrollDisabler");
	        t.$document.off(".UserScrollDisabler");
	    },	    
	    _handleKeydown : function(event) {
	        for (var i = 0; i < this.scrollEventKeys.length; i++) {
	            if (event.keyCode === this.scrollEventKeys[i]) {
	                event.preventDefault();
	                return;
	            }
	        }
	    },	    
	    _handleWheel : function(event) {
	        event.preventDefault();
	    }	    
	};

	var disabler = new UserScrollDisabler();

	// Disable scrolling while menu is opened in mobile version
	$('button.navbar-toggle').click(function (event) {
		if ($('div.tnavbar').hasClass('in')) {
			disabler.enable_scrolling();
		} else {
			disabler.disable_scrolling();
		}
	});

	// Hide menu button on click in mobile mode
	$('.menuItem').click(function (event) {
		if ($('div.tnavbar').hasClass('in')) {
			disabler.enable_scrolling();
		}
		event.stopPropagation();
		var width = (window.innerWidth > 0) ? window.innerWidth : screen.width;
		var $this = $(this);
		var target = $this.attr('data-parent');
		if (width < 769) {
			$(target).collapse('toggle');
		}
	});

	// Open email form
	$('#myModal').on('show.bs.modal', function (e) {
		disabler.disable_scrolling();
	});

	$('#myModal').on('hide.bs.modal', function (e) {
		validator.resetForm();
		modalForm[0].reset();
		// if navbar is still opened
		if (!$('div.tnavbar').hasClass('in')) {
			disabler.enable_scrolling();			
		}
	});

	$('.m-btn').click(function() {
		if ($('#modalForm').valid()) {
			$.post('/email', $('#modalForm').serialize())
				.done(function() {
					$('#myModal').trigger("reset");
					$('#myModal').modal('hide');
				});
		}
	});

	// dirty hack to fire some events in Mozilla
	$(window).scrollTop($(window).scrollTop()+1);
	
	$('body').one('touchstart', function(event){
		$(this).removeClass("body-hover").addClass("mobile-body-hover");
	});
	

});