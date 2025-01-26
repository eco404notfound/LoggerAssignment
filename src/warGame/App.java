package warGame;

public class App {

    public static void main(String[] args) {
       
        Deck deck = new Deck();
        deck.shuffle();

     
        System.out.println("Testing Player functionality...\n");

      
        Player player1 = new Player("Player 1");
        player1.draw(deck);
        player1.draw(deck);

        
        System.out.println("Initial hand of Player 1:");
        player1.describe();

        System.out.println("\nPlayer 1 flips a card:");
        Card flippedCard = player1.flip();
        flippedCard.describe();

       
        System.out.println("\nRemaining hand of Player 1:");
        player1.describe();

       
        deck = new Deck();
        deck.shuffle();

        
        System.out.println("\nStarting the full game...\n");

        
        Player player2 = new Player("Player 2");

        
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Player 1 plays: ");
            card1.describe();
            System.out.println("Player 2 plays: ");
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                System.out.println("Player 1 wins this round!\n");
                player1.incrementScore();
            } else if (card1.getValue() < card2.getValue()) {
                System.out.println("Player 2 wins this round!\n");
                player2.incrementScore();
            } else {
                System.out.println("It's a tie! No points awarded.\n");
            }

            System.out.println("Current Scores: Player 1 - " + player1.getScore() + ", Player 2 - " + player2.getScore());
        }

       
        System.out.println("\nFinal Scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins the game!");
        } else {
            System.out.println("The game is a draw!");
        }
    }
}
