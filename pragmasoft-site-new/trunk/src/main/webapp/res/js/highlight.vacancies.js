$(document).ready(function() {
	if ($(location).attr('href').indexOf('vacancies') > 0) {
		$('a#vac').parent().addClass("active");
	}
});