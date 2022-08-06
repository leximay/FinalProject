package war;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck extends LinkedList<Card> {
	private final List<String> cards = List.of("One", "Two", "Three", "Four", "Five", "Six", 
			"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");
	private final List<String> suits = List.of("Diamonds", "Hearts", "Spades", "Clubs");
			
	private Random random = new Random();
	public Deck() {
		for(int namePos = 0; namePos < cards.size(); namePos++) {
			int value = namePos + 2;
			String name = cards.get(namePos);
			
			for(String suit : suits) {
				add(new Card(name, suit, value));
			}
		}
	}
		@Override
		public String toString() {
			StringBuilder b = new StringBuilder();
			
			b.append("List of cards:").append(System.lineSeparator());
			
			for(Card card : this) {
				b.append("   ").append(card).append(System.lineSeparator());	
			}
			
			return b.toString();
	}
	public void shuffle() {
		Collections.shuffle(this);
		
	}
	
}
