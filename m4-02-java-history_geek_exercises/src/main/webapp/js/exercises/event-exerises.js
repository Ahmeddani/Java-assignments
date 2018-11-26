/// <reference path="../jquery-3.1.1.js" />


$(document).ready(function () {

	$('#SameShipping').change(function(){
		
		    if(this.checked == true) {
		    	var textValue = $('#BillingAddress1').val()
				$('#ShippingAddress1').val(textValue)
				$('#ShippingAddress2').val($('#BillingAddress2').val())
				$('#ShippingCity').val($('#BillingCity').val())
				$('#ShippingState').val($('#BillingState').val())
				$('#ShippingPostalCode').val($('#BillingPostalCode').val())
		    }
		});
	var grandTotalPrice = $('#grandtotal span').text();
	
	 $("input[type='radio']").on('change', function(){
		 var grandTotal = parseFloat(grandTotalPrice.substring(1));
		 if (this.checked == true){
		 var radioValue = $('input[name="ShippingType"]:checked').attr('data-cost');
	     var newTotal = parseFloat(radioValue) + grandTotal;
	     $('#grandtotal span').html('$' + newTotal);
		 }
		 
});
});
