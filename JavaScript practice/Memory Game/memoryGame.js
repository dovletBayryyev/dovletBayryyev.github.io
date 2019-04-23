var card = document.getElementsByClassName("card");
var cards= [...card];
var one = "";
var two = "";
var card1;
var card2;

for (var i = 0; i < cards.length; i++) {
  cards[i].addEventListener("click", flip)
}

function flip(){
  this.classList.add("show");

  if (one == "") {
    one =  this.innerText
    card1 = this.id
  } else if (one != "" && two =="") {
    two = this.innerText
    card2 = this.id
  }
 if (one != "" && two != "" && one == two) {
    one = ""; two = "";}

  setTimeout(wrong, 1000)



  function wrong() {
  if (one != "" && two != "" && one != two) {
   one = ""; two = "";
    alert("tryagain");
   document.getElementById(card1).classList.remove("show");
     document.getElementById(card2).classList.remove("show");
  }
}
}
