function executeForm(){
	var startingBet = document.forms["sevensForm"]["startingBet"].value;
	var rollCounter = 0;
	var maxGameMoney = 0;
	var highestRollCount = 0;

	if(startingBet<=0) {
		alert("Please enter a positive number");
		return false;
	}

	for(var gameMoney = Number(startingBet); gameMoney > 0; gameMoney--) {
		dice1 = Math.floor(Math.random() * 6) + 1;
		dice2 = Math.floor(Math.random() * 6) + 1;
		rollCounter+=1;
		if(dice1+dice2 == 7) {
			gameMoney+=5;
		}
		if(gameMoney > maxGameMoney) {
			maxGameMoney = gameMoney;
			highestRollCount = rollCounter;
		}
	}
	document.getElementById("results").style.display = "block";
	document.getElementById("resultsStartingBet").innerText = startingBet;
	document.getElementById("totalRolls").innerText = rollCounter;
	document.getElementById("highestAmount").innerText = maxGameMoney;
	document.getElementById("highestRollCount").innerText = highestRollCount;
	return false;
}