function findMax(arrayOfNumbers) {
  var max;
  for(var arrayPosition = 0; arrayPosition < arrayOfNumbers.length; arrayPosition++) {
    var currentElement = arrayOfNumbers[arrayPosition];
    var nextElement = arrayOfNumbers[arrayPosition + 1];
    if(nextElement>=currentElement) {
      max = nextElement;
    }
  }
  return max;
}
var arrayOfNumbers = [2, 5, 9, 13, 2, 18];
console.log(findMax(arrayOfNumbers));
