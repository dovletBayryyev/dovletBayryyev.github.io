console.log("start of page");

function hideAllLinks() {
    var allLinks = document.links;
    for (var loopCounter = 0;
        loopCounter < allLinks.length; loopCounter++) {
        allLinks[loopCounter].style.display = "none";
    }
}
hideAllLinks();

console.log("reached the of the page");
