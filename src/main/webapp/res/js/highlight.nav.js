$(window).on("scroll resize", function (){
		var window_top = $(window).scrollTop();
		var projects_top = $('a[name="projects"]').offset().top - 10;
		var comand_top = $('a[name="comand"]').offset().top - 10;
		var quality_top = $('a[name="quality"]').offset().top - 300;
		if (window_top > quality_top) {
			$("ul.nav li").removeClass("active");
			$('a#qual').parent().addClass("active");
		}
		else if (window_top > comand_top) {
			$("ul.nav li").removeClass("active");
			$('a#com').parent().addClass("active");
		}
		else if (window_top > projects_top) {
			$("ul.nav li").removeClass("active");
			$('a#proj').parent().addClass("active");
		}
		else {
			$("ul.nav li").removeClass("active");
			$('a#we').parent().addClass("active");
		}
	});