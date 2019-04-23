function validateForm() {
  if(document.forms["contactForm"]["name"].value == "") {
    alert("Please enter your name");
    return false;
  }
  if(document.forms["contactForm"]["email"].value == "") {
    alert("Please enter your email");
    return false;
  }
  if(document.forms["contactForm"]["phone"].value == "") {
    alert("Please enter your phone number");
    return false;
  }
  if(document.forms["contactForm"]["additionalInformation"].value == "") {
    alert("Please enter additional information");
    return false;
  }
  if(document.forms["contactForm"]["choice1"].checked == false && document.forms["contactForm"]["choice2"].checked == false){
    alert("Please choose if you've been to the restaurant: No or Yes");
    return false;
  }
  if(document.forms["contactForm"]["m"].checked == false && document.forms["contactForm"]["t"].checked == false && document.forms["contactForm"]["w"].checked == false && document.forms["contactForm"]["th"].checked == false && document.forms["contactForm"]["f"].checked == false){
    alert("Please choose the best day(s) to contact you");
    return false;
  }
  alert("The information that you provided is valid");
  return false;
}
