package war;

import java.util.List;

public class Card {
	private int value;
	private String name;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return value + " of " + name;
	}
	
	
}
