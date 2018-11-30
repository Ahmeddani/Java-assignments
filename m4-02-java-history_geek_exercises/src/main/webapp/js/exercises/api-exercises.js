/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {
	
    $('#BillingPostalCode').on('change', function(event){
    	var billingPostalCodeInt = $('#BillingPostalCode').val();
    	var inputTotal = $('#subtotal span.price').text().substring(1);
    	var billingPostCode = billingPostalCodeInt.toString();
    	$.ajax({
            url: 'http://localhost:8080/m4-java-historygeek-exercises/api/getTax',
            data: {
                subtotal: inputTotal,
                billingZipCode: billingPostCode
            },
            type: "GET",
            dataType: "json"
        }).done(function(data) {
        	
        	$('#tax span.price').text('$'+ data);
        	var grandTotalPrice = $('#grandtotal span').text();
        	var grandTotal = parseFloat(grandTotalPrice.substring(1));
        	var shipping = parseFloat($('#shipping span.price').text().substring(1));
        	var newTotal = parseFloat(data) + shipping + grandTotal;
        	$('#grandtotal span').html('$' + newTotal.toFixed(2));
        }).fail(function (xhr, status, error) {
            console.log(error);
        });
    });

});
