package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

    private final ArrayList<Card> deck;
    private final int DECK_SIZE = 52;

    public GroupOfCards() {
        deck = new ArrayList<>();
        populate();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void populate() {
        deck.clear();
        for (int i = 2; i <= 14; i++) {
            for (String suit : new String[] { "Hearts", "Diamonds", "Clubs", "Spades" }) {
                deck.add(new Card(i, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        return deck.remove(0);
    }

    public int getDeckSize() {
        return DECK_SIZE;
    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(deck);
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public int size() {
        return deck.size();
    }

    public Card removeCard() {
        return deck.remove(deck.size() - 1);
    }

    public Card getCard(int i) {
        return deck.get(i);
    }

    public GroupOfCards copy() {
        GroupOfCards copiedGroup = new GroupOfCards();
        copiedGroup.deck.addAll(deck);
        return copiedGroup;
    }
}
