package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }
}
