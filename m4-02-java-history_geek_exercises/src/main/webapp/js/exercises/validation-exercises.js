//<reference path="../jquery-3.1.1.js" />
//<reference path="../jquery.validate.js" />

$(document).ready(function () {

    // Email address - required
    // Email address - .gov only (BONUS)
    // Password - required, length 8 or more
    // ConfirmPassword
	

	$("#form0").validate({
		debug:false,
		rules:{
			email:{
				required:true,
				email:true,
				govEmail: true
			},
		
		password:{
			required:true,
			minlength:8,
		},
		
	    confirmPassword: {
	    	required: true,
            equalTo: "#password"    
            },
		},
		
		messages: {
            email: {
                required: "You must provide an email",
                email: "Enter valid email"
            },
            password: {
                required: "You must provide a password",
                minlength: "password can't be less than 8 characters"
            },
            confirmPassword:{
            	required: "Please confirm your password"
            }
        },

    	errorClass: "error",
        validClass: "valid"
        	
	
	});
	
	$('#checkout').validate({
		debug:false,
		rules:{
			
			BillingAddress1:{
				required: true
			},
			BillingAddress2:{
				required: true
			},
			BillingCity:{
				required: true
			},
			BillingState:{
				required: true
			},
			BillingPostalCode:{
				required: true
			},
			
			ShippingAddress1:{
				required: true
			},
			ShippingAddress2:{
				required: true
			},
			ShippingCity:{
				required: true
			},
			ShippingState:{
				required: true
			},
			ShippingPostalCode:{
				required: true
			},
			ShippingType:{
				required: true
			},
			
			NameOnCard:{
				required: true
			},
			CreditCardNumber:{
				required: true,
				cardFormat: true
			},
			ExpirationDate:{
				required: true,
				cardNotExpired: true,
				dateFormat: true
				
			}
		},
			messages:{
				
				BillingAddress1:{
					required: "Billing address is required",
				},
				BillingAddress2:{
					required: "Billing address is required",
				},
				BillingCity:{
					required: "Billing city is required",
				},
				BillingState:{
					required: "Billing state is required",
				},
				BillingPostalCode:{
					required: "Billing postal code is required"
				},
				ShippingAddress1:{
					required: "Shipping address is required"
				},
				ShippingAddress2:{
					required: "Shipping address is required"
				},
				ShippingCity:{
					required: "Shipping city is required"
				},
				ShippingState:{
					required: "Shipping state is required"
				},
				ShippingPostalCode:{
					required: "Shipping postal code is required"
				},
				ShippingType:{
					required: "Please select shipping method"
				},
				
				NameOnCard:{
					required: "Name on credit card is required"
				},
				CreditCardNumber:{
					required: "credit card number is required"
				},
				ExpirationDate:{
					required: "Expiration date is required"
				}
			}
			
	});
		$.validator.addMethod('cardFormat', function(value, index){
				return (value.substring(0,4).length == 4) && (value.substring(4,8).length == 4) && (value.substring(8,12).length == 4) && (value.substring(12).length == 4)
				
			}, "Please enter a valid credit card");
		
		$.validator.addMethod("govEmail", function(value, index) {
			    return value === "" || 
			        value.toLowerCase().endsWith("@gov.com");  // it would be safer to consider a regex here. 
			}, "Please enter a gov.com email");
		
		$.validator.addMethod("cardNotExpired", function(value, index) {
			
			var today = new Date();
			var dd = today.getDate();
			var mm = today.getMonth()+1; //January is 0!
			var yyyy = today.getFullYear().toString().slice(2);
			
			var cardYear = parseInt(value.substring(3));
			var cardMonth = parseInt(value.substring(0,2));
		    return (yyyy < cardYear || (yyyy == cardYear && mm <= cardMonth && cardMonth <= 12));
		        
		}, "Card Expired! Please try another credit card");
	
		$.validator.addMethod('dateFormat', function(value, index){
		
			return value.match(/^\d{1,2}\/\d{2}$/);
		}, "Please enter a valid date format (mm/yy)");
	
		
		
});