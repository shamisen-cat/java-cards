package cards;

import java.util.List;

public class Cards {
    private List<Card> cardList;
    
    public Cards(List<Card> cardList) {
        this.setCardList(cardList);
    }
    
    public List<Card> getCardList() {
        return this.cardList;
    }
    
    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
    
    public int cardCount() {
        return this.getCardList().size();
    }
    
    public boolean cardExists() {
        return !this.getCardList().isEmpty();
    }
    
    public void addCard(Card card) {
        this.getCardList().add(card);
    }
    
    public void removeCard(int i) {
        this.getCardList().remove(i);
    }
    
    public Card getCard(int i) {
        if (!this.cardExists()) {
            return null;
        }
        
        return this.getCardList().get(i);
    }
    
    public Card popCard(int i) {
        Card c = this.getCard(i);
        
        if (c != null) {
            this.removeCard(i);
        }
        
        return c;
    }
    
    public Card popCard() {
        int i = this.cardCount() - 1;
        
        return this.popCard(i);
    }
    
    public String toString() {
        String s = "";
        
        for (int i = 0; i < this.cardCount(); i++) {
            s += this.getCard(i) + ",";
        }
        
        return s;
    }
}
