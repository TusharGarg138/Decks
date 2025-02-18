// Deck.java

import java.util.*;

class Deck{

	ArrayList<Card> deck;

	public Deck(){
		deck = new ArrayList<>();
	}

	public void createDeck(){
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Spades", "Hearts", "Diamond", "Clubs"};

		for(String rank : ranks){
			for(String suit : suits){
				deck.add(new Card(rank, suit));
			}
		}
	}

	public void displayDeck(){
		for(Card card : deck){
			System.out.println(card);
		}
	}


	public void shuffleDeck(){
		Collections.shuffle(deck);
	}

	public void randomCards(){
		Random random =new Random();
		// String c1 = getRandomCard(random);
		String c2;

		// do {
            	// 	c2 = getRandomCard(random);
        	// } while (c1.equals(c2));
		

		// System.out.println("First card is"+ c1);
		// System.out.println("Second card is"+ c2);

	}

// 3 players
// 5 cards each
// display all the cards

	public void cardPlayers(){
		ArrayList<Card> A = new ArrayList<>();
		ArrayList<Card> B = new ArrayList<>();
		ArrayList<Card> C = new ArrayList<>();

		for(int i= 0; i<15; i++){
			
			A.add(deck.get(i));
			i++;
			B.add(deck.get(i));
			i++;
			C.add(deck.get(i));
		}
	

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	
}











}