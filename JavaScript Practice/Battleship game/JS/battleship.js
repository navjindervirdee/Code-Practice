var view = {
	displayMessage : function(msg){
		var messageArea = document.getElementById("messageArea");
		messageArea.innerHTML = msg;
	},
	
	displayHit : function(location) {
		var cell = document.getElementById(location);
		cell.setAttribute("class", "hit");
	},

	displayMiss : function(location) {
		var cell = document.getElementById(location);
		cell.setAttribute("class", "miss");
	}
};

var model = {
	boardSize : 7,
	numShips : 3,
	shipsSunk : 0,
	shipLength : 3,

	ships : [ { locations: ["", "", "",] , hits: ["", "", ""] },
		  { locations: ["", "", "",] , hits: ["", "", ""] },
		  { locations: ["", "", "",] , hits: ["", "", ""] },
		],

	fire : function(guess) {
		for(var i=0; i<this.numShips; i++){
			var ship = this.ships[i];
			var locations = ship.locations;
			var index = locations.indexOf(guess);
			if(index>=0){
				ship.hits[index] = "hit";
				view.displayHit(guess);
				view.displayMessage("Hit");
				if(model.isSunk(ship)){
					view.displayMessage("Sank the ship!");
					model.shipsSunk++;
				}
				return true;
			}
		}
		view.displayMiss(guess);
		view.displayMessage("You Missed!");
		return false;
	},

 	isSunk : function(ship){
			for(var i=0; i<this.shipLength; i++){
				if(ship.hits[i] !== "hit"){
					return false;
				}
			}
		return true;
	},

	generateShipLocations : function() {
		var locations;

		for(var i=0; i<this.numShips; i++){
			do{
				locations = this.generateShip();
			}while(this.collision(locations));

			this.ships[i].locations=locations;
		}
	},

	generateShip : function() {
		var direction = Math.floor(Math.random()*2);
		var row, col;

		if(direction === 1){
			row = Math.floor(Math.random()*this.boardSize);
			col = Math.floor(Math.random()*(this.boardSize - this.shipLength));
		}
		else{
			row = Math.floor(Math.random()*(this.boardSize - this.shipLength));
			col = Math.floor(Math.random()*this.boardSize);
		}

		var newLocations = [];
		for(var i=0; i<this.shipLength; i++){
			if(direction === 1){
				newLocations.push(row + "" + (col+i));
			}
			else{
				newLocations.push((row+i) + "" + col);
			}
		}
		return newLocations;
	},

	collision : function(locations){
		for(var i=0; i<this.numShips; i++){
			var ship = this.ships[i];
			for(var j =0; j< this.shipLength; j++){
				if(ship.locations.indexOf(locations[j])>=0){
					return true;
				}
			}
		}
		return false;
	}	
		

};

var controller = {
		guesses : 0,
		
		parseGuess : function(guess){
			var alphabet = ["A", "B", "C", "D", "E", "F", "G"];
			//console.log(guess);

			//if(guess === null || guess !== 2){
				//console.log(guess);
			//	alert("Oops! please enter a letter and a number");
			//}
			//else{
				firstChar = guess.charAt(0);
				var row = alphabet.indexOf(firstChar);
				var column = guess.charAt(1);
				
				if(isNaN(row) || isNaN(column)){
					alert("Oops! that's isn't on board");
				}
				else if(row < 0 || row>=model.boardSize || column < 0 || column >=model.boardSize){
					alert("Oops! That's off the board");
				     }
				     else {
				           return row + column;
				}
				
			//}
			return null;
		}, 
		
		processGuess : function(guess){
				var location = controller.parseGuess(guess);
				if(location){
					this.guesses++;
					var hit = model.fire(location);
					
					if(hit && model.shipsSunk === model.numShips){
						alert("Congrats! You sunk all ships in" + " " + this.guesses + " guesses");
					} 
				}
		}
};
//console.log(controller.parseGuess("A6"));

function init(){
	var firebutton = document.getElementById("fire");
	firebutton.onclick = handleFireButton;

	model.generateShipLocations();
}

function handleFireButton() {
	var input = document.getElementById("guess");
	var guess = input.value;
	controller.processGuess(guess);
	guess.value = "";
}

window.onload = init;
		
		


