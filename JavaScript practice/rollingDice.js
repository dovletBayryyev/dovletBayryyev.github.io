function rollDice(numSides) {
  return Math.floor(Math.random() * numSides) + 1;
}

for (var i = 0; i < 100; i++) {
  console.log(rollDice(6));
}
