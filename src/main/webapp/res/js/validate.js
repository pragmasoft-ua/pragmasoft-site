// Initialize form check
$(function() {
	$('#orderForm').validate({
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
	