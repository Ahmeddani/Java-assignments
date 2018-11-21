const sumDouble = function(x, y){

    const sum = x + y;
    if (x == y){
        return 2 * sum;
    }
    else
    return sum;
};

const hasTeen = function(a, b, c){
    count = 0;
    var ages = [a, b, c];
    for (var i = 0; i < 3; i++){
        if (13 <= ages[i] && ages[i]<= 19){
            count++;
        }
    }
    if (count >= 1){
    return true;
    }
    return false;
};

const lastDigit = function(a, b){

    lastA = a % 10;
    lastB = b % 10;
    if (lastA === lastB){
        return true;
    }
    return false;
};

const seeColor = function(x){

    str = "";
    if (x.substring(0, 3) === 'red'){
        str = 'red'
        return str;
    }
    if (x.substring(0, 4) === 'blue'){
        str = 'blue'
        return str;
    }
    return str;
}
const middleThree = function(a){
    start = a.length / 2 - 1
    return (a.substring(start, start + 3));
}

const frontAgain = function(b){

    front = b.substring(0,2)
    end = b.substring(b.length - 2)
    if (front === end){
        return true;
    }
    return false;
}

const alarmClock = function(day, vacation){

    if ((day != 0 && day != 6) && vacation === false){
        return numberToDay(day)+ ' 7:00';
    }
    else if((day != 0 & day != 6) && vacation === true){
        return numberToDay(day)+ ' 10:00';
    }
    
        return numberToDay(day)+ ' off';
    
}

const numberToDay = function(x){
    switch(x){
        case 0:
        return 'Sunday';
        case 1:
        return 'Monday';
        case 2:
        return 'Tuesday';
        case 3:
        return 'Wednesday';
        case 4:
        return 'Thursday';
        case 5:
        return 'Friday';
        case 6:
        return 'Saturday';
    }
}

const makeMiddle = function (num){
    num1 = []
    if (num.length == 2){
        return num;
    }
    else if (!(num.length % 2 == 0) || num.length < 2){
        return num1;
    }
    start = num.length / 2 - 1;
    num1 = [num[start], num[start + 1]]
    return num1;
}

const oddOnly = function(numArray){
    odds = []
    count = 0
    for (var i = 0; i < numArray.length; i++){
        if (numArray[i] % 2 === 1){
            odds[count] = numArray[i]
            count++
        }
    }
    return odds;
} 

const weave = function (x, y){
    max = 0
    wovenArray = []
    j = 0
    if (x.length >= y.length ){
        max = x.length
    }
    else if (y.length >= x.length){
        max = y.length
    }

    for (var i = 0; i < max; i++){
        if (i < x.length){
        wovenArray[j++] = x[i]
        }
    
         if (i < y.length){
        wovenArray[j++] = y[i]
    }
}
    return wovenArray;
}

const cigarParty = function(numCigar, weekend){
    if (weekend){
        return numCigar >= 40;
    }
    if (40 <= numCigar && numCigar <= 60){
        return true;
    }
    return false;
}

const stringSplosion = function(str){

    newString = ''
    for (var i = 0; i < str.length; i++){
        newString += str.substring(0, i+1)
    }
    return newString;
}

const fizzBuzz = function(number){

    if (number % 3 === 0 && number % 5 === 0){
        return 'FizzBuzz';
    }
    else if (number % 3 === 0 ){
        return 'Fizz';
    }
    else if (number % 5 === 0 ){
        return 'Buzz';
    }
    return number;

}

const countValues = function(numArray){
    myObject = {}

    // numArray.forEach(function(element) {
    //     if (myObject.hasOwnProperty(element)){
    //         myObject.element += 1;
    //     }
    //     else {
    //         myObject[element] = 1
    //     }
    //   });
    // return myObject;
  
for (var i = 0; i < numArray.length; i++) {
    if (typeof myObject[numArray[i]] == "undefined") {
        myObject[numArray[i]] = 1;
    } else {
        myObject[numArray[i]]++;
    }
}

return myObject;
}




const blackJack = function(a, b){
    if ( a > 21 && b > 21){
        return 0;
    }
    else if ((21 - a) < 0){
     return b; 
    }
    else if ((21 - b) < 0){
        return a;
    }
    diffA = 21 - a
    diffB = 21 - b
    if (diffA < diffB){
        return a;
    }
    else{
        return b;
    }
}

const reverseArray = function (oldArray){
    newArray = oldArray.reverse()
    return newArray;
}




























