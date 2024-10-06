package cards;

public class Card {
    public static final int MIN_SUIT = 1;
    public static final int MAX_SUIT = 4;
    
    public static final int MIN_RANK = 2;
    public static final int MAX_RANK = 14;
    
    public static final int JOKER_SUIT = 5;
    public static final int JOKER_RANK = 15;
    
    private int suit;
    private int rank;
    
    public Card(int suit, int rank) {
        this.setSuit(suit);
        this.setRank(rank);
    }
    
    public Card() {
        this(Card.JOKER_SUIT, Card.JOKER_RANK);
    }
    
    public int getSuit() {
        return this.suit;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public void setSuit(int suit) {
        if (suit < Card.MIN_SUIT || suit > Card.JOKER_SUIT) {
            throw new IllegalArgumentException("Suit value is out of range.");
        }
        
        this.suit = suit;
    }
    
    public void setRank(int rank) {
        if (rank < Card.MIN_RANK || rank > Card.JOKER_RANK) {
            throw new IllegalArgumentException("Rank value is out of range.");
        }
        
        this.rank = rank;
    }
    
    public String getSuitName() {
        String suitName;
        
        switch (this.getSuit()) {
            case 1:
                suitName = "club";
                break;
            case 2:
                suitName = "diamond";
                break;
            case 3:
                suitName = "heart";
                break;
            case 4:
                suitName = "spade";
                break;
            case 5:
                suitName = "joker";
                break;
            default:
                suitName = null;
                break;
        }
        
        return suitName;
    }
    
    public char getRankChar() {
        char rankChar;
        
        switch (this.getRank()) {
            case 10:
                rankChar = 'T';
                break;
            case 11:
                rankChar = 'J';
                break;
            case 12:
                rankChar = 'Q';
                break;
            case 13:
                rankChar = 'K';
                break;
            case 14:
                rankChar = 'A';
                break;
            case 15:
                rankChar = 0;
                break;
            default:
                // int -> char
                rankChar = Character.forDigit(this.getRank(), 10);
                break;
        }
        
        return rankChar;
    }
    
    public String toString() {
        if (this.getRankChar() == 0) {
            return "JK";
        }
        
        // スートの名称の頭文字とランクの表記を結合する。
        return this.getSuitName().substring(0, 1) + this.getRankChar();
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument 'obj' is null.");
        }
        
        if (this == obj) {
            return true;
        }
        
        if (obj instanceof Card c) {
            return this.getRank() == c.getRank();
        } else {
            throw new ClassCastException("Cannot cast argument 'obj'.");
        }
    }
    
    public boolean smallerThan(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument 'obj' is null.");
        }
        
        if (obj instanceof Card c) {
            if (this.getRank() == c.getRank()) {
                return this.getSuit() < c.getSuit();
            } else {
                return this.getRank() < c.getRank();
            }
        } else {
            throw new ClassCastException("Cannot cast argument 'obj'.");
        }
    }
    
    public boolean greaterThan(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument 'obj' is null.");
        }
        
        if (obj instanceof Card c) {
            if (this.getRank() == c.getRank()) {
                return this.getSuit() > c.getSuit();
            } else {
                return this.getRank() > c.getRank();
            }
        } else {
            throw new ClassCastException("Cannot cast argument 'obj'.");
        }
    }
}
