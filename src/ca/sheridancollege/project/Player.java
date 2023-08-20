package ca.sheridancollege.project;

import java.util.ArrayList;

public class Player {

    private String name;
    private int score;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        score = 0;
        cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void incrementScore(int amount) {
        score += amount;
    }

    public void resetScore() {
        score = 0;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void removeAllCards() {
        cards.clear();
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public Card removeTopCard() {
        return cards.remove(0);
    }
}
