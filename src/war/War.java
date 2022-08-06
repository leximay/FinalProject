package war;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class War {
	private List<String> names = List.of("Lexi", "Tyler", "Addie", "Justin", "Briana", "Mckenna", "Amy", "Eric", "Maya", "Kylie", "Caleb");
	
	private Random random = new Random();
	
	public static void main(String[] args) {
		new War().run();		
		}
	
			private void run() {
				List<String> theNames = new LinkedList<>(names);
				Player player1 = createPlayer(theNames);
				Player player2 = createPlayer(theNames);
				
				System.out.println(player1.getName() + " is playing " + player2.getName());
				
				Deck deck = new Deck();
				deck.shuffle();
				
				deal(deck, player1, player2);
				play(player1, player2);
				
				declarewinner(player1, player2);
		}
			
			private void declarewinner(Player player1, Player player2) {
				if(player1.getScore() > player2.getScore()) {
					printWinner(player1);
					printLoser(player2);
				}
				else if(player2.getScore() > player1.getScore()) {
					printWinner(player2);
					printLoser(player1);
				}
				else {
					printDraw(player1, player2);
				}
				}

			private void printDraw(Player player1, Player player2) {
				System.out.println(player1.getName() + " and " + player2.getName() + " tied with a score of " + player1.getScore() + ".");
				
			}

			private void printLoser(Player loser) {
				System.out.println(loser.getName() + " is the loser with a score of " + loser.getScore() + ".");
				
			}

			private void printWinner(Player winner) {
				System.out.println(winner.getName() + " is the winner with a score of " + winner.getScore() + ".");
				
			}

			private void play(Player player1, Player player2) {
				int numTurns = player1.getHand().size();
				
				for(int turn = 0; turn < numTurns; turn++) {
					Card card1 = player1.flip();
					Card card2 = player2.flip();
					
					if(card1.getValue() > card2.getValue()) {
						player1.incrementScore();
					}
					else if(card2.getValue() > card1.getValue()) {
						player2.incrementScore();
					}
				}
				
			}

			private void deal(Deck deck, Player player1, Player player2) {
				int size = deck.size();
				
				for(int index = 0; index < size; index++) {
					if(index % 2 == 0) {
						player1.draw(deck);
					}
					else {
						player2.draw(deck);
					}
				}
				
			}

			private Player createPlayer(List<String> names) {
			int pos = random.nextInt(names.size());
			String name = names.remove(pos);
				return new Player(name);
			}
			
			}

