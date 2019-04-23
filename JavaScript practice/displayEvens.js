function executeForm(){
    var startNum = document.forms["evensForm"]["startNum"].value;
    var endNum = document.forms["evensForm"]["endNum"].value;
    var step = document.forms["evensForm"]["step"].value;
    var arrayOfValues = [];
    
    if (isNaN(Number(startNum))) {
        alert("Please enter a number");
        return false;
    }
    if (isNaN(Number(endNum))) {
        alert("Please enter a number");
        return false;
    }
    if (isNaN(Number(step))) {
        alert("Please enter a number");
        return false;
    }
    if (Number(step)<=0) {
        alert("Please enter a positive number");
        return false;
    }
    if (Number(endNum) <= Number(startNum)) {
        alert("The ending number must be greater than the starting number");
        return false;
    }
    
    document.getElementById("message").innerText = "Here are the even numbers between " + startNum + " and " + endNum + " by " + step + "'s:";
    for (var i = Number(startNum); i < Number(endNum); i = i + Number(step)) {
        if (i%2 == 0) {
            arrayOfValues.push(i);
        }
    }
    arrayOfValues.forEach(myFunction);
    return false;
}

function myFunction(item) {
    document.getElementById("values").innerHTML = document.getElementById("values").innerHTML + item + "<br>";
    }

