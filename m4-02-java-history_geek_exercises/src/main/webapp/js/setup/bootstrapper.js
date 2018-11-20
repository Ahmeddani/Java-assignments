/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {

    const CSS_CLASS_CORRECT = "correct";    
    const NUMBER_OF_PRESIDENTS = 45;
    const NUMBER_OF_REPUBLICANS = 19;
    const NUMBER_OF_DEMOCRATS = 15;
    const NUMBER_OF_OTHERS = 11;
    const NUMBER_OF_JAMES = 5;
    const NUMBER_OF_CENTURY_BEGINNERS = 4;
    const NUMBER_OF_CENTURY_ENDERS = 4;
    const NUMBER_OF_20THCENTURY_CURRENCY = 4;
    
    const testPassed = function(btnClicked) {
    	$(btnClicked).closest('li').addClass(CSS_CLASS_CORRECT);
    };
    
    const checkResult = function(fnToExecute, btnClicked, className, expectedMatchCount) {
    	fnToExecute();
    	
    	if($(className).length === expectedMatchCount) {
    		testPassed(btnClicked);
    	}
    };

    $("#btnPresident").on("click", function() {
        checkResult(presidentialDivs, this, '.president', NUMBER_OF_PRESIDENTS);
    });

    $("#btnFoundingFather").on("click", function() {
    	checkResult(georgeWashington, this, '.founding-father', 1);
    });

    $("#btnRepublicans").on("click", function() {
    	checkResult(republicanPresidents, this, '.red', NUMBER_OF_REPUBLICANS);
    });

    $("#btnDemocrats").on("click", function() {
    	checkResult(democratPresidents, this, '.blue', NUMBER_OF_DEMOCRATS);
    });

    $("#btnOther").on("click", function() {
        checkResult(otherPresidents, this, '.gold', NUMBER_OF_OTHERS);        
    });

    $("#btnJames").on("click", function() {
    	checkResult(presidentsNamedJames, this, '.james', NUMBER_OF_JAMES);
    });

    $("#btnBeginningOfCentury").on("click", function() {
    	checkResult(turnOfTheCenturyPresidents, this, '.beginningOfCentury', NUMBER_OF_CENTURY_BEGINNERS);
    });

    $("#btnEndOfCentury").on("click", function() { 
    	checkResult(endOfTheCenturyPresidents, this, '.endOfCentury', NUMBER_OF_CENTURY_ENDERS);
    });

    $("#btnAppearOnCurrency").on("click", function() {
    	checkResult(currencyPresidents, this, '.appearOnCurrency', NUMBER_OF_20THCENTURY_CURRENCY);
    });
});