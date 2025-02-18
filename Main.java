// Main.java

class Main{
	public static void main(String args[]){
		Deck dc = new Deck();
		
		dc.createDeck();
		
		dc.shuffleDeck();
		dc.displayDeck();

		// dc.randomCards(Deck);

		dc.cardPlayers();

		
	}
}