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
				 var tax =  parseFloat($('#tax span.price').text().substring(1));
				 var radioValue = $('input[name="ShippingType"]:checked').attr('data-cost');
				 $('#shipping span.price').text('$' + radioValue);
			     var newTotal = parseFloat(radioValue) + tax + grandTotal;
			     $('#grandtotal span').html('$' + newTotal.toFixed(2));
		 }	 
});
	 
	 $(document).keydown(function(e) {
		    switch(e.which) {
		        case 37: // left
		        	$('.ship').prev().addClass('ship')
		        	$('.ship').next().removeClass('ship')
		        	
		        	if ($('.ship').hasClass('treasure')){
		        		 winGame();
		        	 }
		        	if ($('.ship').hasClass('iceberg')){
		        		$('.iceberg').removeClass('ship')
		        		$('#row_0_column_0').addClass('ship')
		        	}
		        	if ($('.ship').hasClass('pirate')) {
		        		gameOver();
		        	}
		        	 
		        break;

		        case 38: // up
		        	var downCell = $('.ship').closest('tr').prev().children().eq($('.ship').index())
		        	if (downCell.length > 0){
		        	$('.ship').removeClass('ship')
		        	  downCell.addClass('ship')
		        	}
		        	
		        	if ($('.ship').hasClass('treasure')){
		        		 winGame();
		        	 }
		        	  if ($('.ship').hasClass('iceberg')){
			        		$('.iceberg').removeClass('ship')
			        		$('#row_0_column_0').addClass('ship')
			        	}    
		        	  if ($('.ship').hasClass('pirate')) {
			        		gameOver();
			        	}
		        	  
		        break;

		        case 39: // right
		        	$('.ship').next().addClass('ship')
		        	$('.ship').prev().removeClass('ship')
		        	
		        	if ($('.ship').hasClass('treasure')){
		        		 winGame();
		        	 }
		        	if ($('.ship').hasClass('iceberg')){
		        		$('.iceberg').removeClass('ship')
		        		$('#row_0_column_0').addClass('ship')
		        	}
		        	if ($('.ship').hasClass('pirate')) {
		        		gameOver();
		        	}
		        	
		        break;

		        case 40: // down
		        	
		        	var downCell = $('.ship').closest('tr').next().children().eq($('.ship').index())
		        	if (downCell.length > 0){
		        	$('.ship').removeClass('ship')
		        	  downCell.addClass('ship')
		        	}
		        	 if ($('.ship').hasClass('treasure')){
			        		 winGame();
			        	 }
		        	  if ($('.ship').hasClass('iceberg')){
			        		$('.iceberg').removeClass('ship')
			        		$('#row_0_column_0').addClass('ship')
			        	}    	
		        	  if ($('.ship').hasClass('pirate')) {
			        		gameOver();
			        	}
		        	 
		        	  
		        break;

		        default: return; // exit this handler for other keys
		    }
		    e.preventDefault(); // prevent the default action (scroll / move caret)
		});
	 $('#btnRestart').click(function(){
		 $('h1').remove();
	 });
	 
	 const winGame = function(){
     		$('h2').after("<h1>YOU WON THE TREASURE!!!</h1>")
     		$('.ship').removeClass('ship')
     		$('#row_0_column_0').addClass('ship')
	 }
	 
	 const gameOver = function(){
		 $('h2').after("<h1>GAME OVER!!!</h1>")
 		$('.ship').removeClass('ship')
 		$('#row_0_column_0').addClass('ship')
	 }
});


