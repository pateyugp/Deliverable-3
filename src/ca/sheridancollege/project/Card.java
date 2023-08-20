package ca.sheridancollege.project;

public class Card {
    private final int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(int rank, String suit) {
        this(rank, Suit.valueOf(suit.toUpperCase()));
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        String rankStr;
        switch (rank) {
            case 11:
                rankStr = "Jack";
                break;
            case 12:
                rankStr = "Queen";
                break;
            case 13:
                rankStr = "King";
                break;
            case 14:
                rankStr = "Ace";
                break;
            default:
                rankStr = Integer.toString(rank);
                break;
        }
        return rankStr + " of " + suit.toString();
    }
}

enum Suit {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}
