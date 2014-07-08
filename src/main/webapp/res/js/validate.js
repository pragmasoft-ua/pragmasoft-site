$(document).ready(function() {
	var modalForm = $('#orderForm');
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
});