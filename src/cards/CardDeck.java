package cards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CardDeck extends Cards {
    public CardDeck() {
        this(true);
    }
    
    public CardDeck(boolean jokerIncludes) {
        super(new ArrayList<Card>());
        
        Cards temp = new Cards(new LinkedList<>());
        
        for (int suit = Card.MIN_SUIT; suit < Card.MAX_SUIT + 1; suit++) {
            for (int rank = Card.MIN_RANK; rank < Card.MAX_RANK + 1; rank++) {
                temp.addCard(new Card(suit,rank));
            }
        }
        
        if (jokerIncludes) {
            temp.addCard(new Card());
        }
        
        // tempからランダムでCardインスタンスを取り出して格納する。
        Random random = new Random();
        
        while (temp.cardExists()) {
            int i = random.nextInt(temp.cardCount());
            Card card = temp.popCard(i);
            
            this.addCard(card);
        }
    }
}
