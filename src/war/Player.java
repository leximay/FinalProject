package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	List<Card> hand = new ArrayList<>();
	private int score = 0;
	
	public Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public void draw(Deck deck) {
		hand.add(deck.remove(0));
		
	}
		
	public List<Card> getHand() {
		return hand;
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void incrementScore() {
		score += 1;
		
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
			return score;
	}

	}

