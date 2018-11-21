/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presidentialDivs() {

	$('#presidents div').addClass('president');
}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {

	$('#george-washington').addClass('founding-father');
}

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {

	$('.Republican').addClass('red');
}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {

	$('.Democratic').addClass('blue');
}

//Locate all presidents that are not Democratic or Republican and add the 'gold' class.
function otherPresidents() {

	$('#presidents div').not('.Democratic, .Republican').addClass('gold');
	//$('#presidents').not('.Repuclican').addClass('gold');
}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {

	$("#presidents div [h3*='James']").addClass('james');
}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {

	$('#presidents h2').next().addClass('beginningOfCentury')
}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
    
}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {

}