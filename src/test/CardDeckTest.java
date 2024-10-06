package test;

import cards.Card;
import cards.CardDeck;

public class CardDeckTest {

    public static void main(String[] args) {
        System.out.println("Generating a new card deck.");
        CardDeck cardDeck = new CardDeck();
        System.out.println(cardDeck);
        System.out.println(cardDeck.cardCount() + " cards in card deck.");
        
        System.out.println("Take out the 1st card.");
        Card card1 = cardDeck.popCard();
        System.out.println(cardDeck);
        System.out.println(cardDeck.cardCount() + " cards in card deck.");
        
        System.out.println("Take out the 2nd card and compare two cards.");
        Card card2 = cardDeck.popCard();
        System.out.println(card1 + " (1st card)");
        System.out.println(card2 + " (2nd card)");
        System.out.println(card1 + " = " + card2 + " -> " + card1.equals(card2));
        System.out.println(card1 + " < " + card2 + " -> " + card1.smallerThan(card2));
        System.out.println(card1 + " > " + card2 + " -> " + card1.greaterThan(card2));
        
        System.out.println("Take out the last card.");
        while (cardDeck.cardExists()) {
            cardDeck.popCard();
        }
        System.out.println(cardDeck);
        System.out.println(cardDeck.cardCount() + " cards in card deck.");
        
        System.out.println("Generating a new card deck without Joker.");
        cardDeck = new CardDeck(false);
        System.out.println(cardDeck);
        System.out.println(cardDeck.cardCount() + " cards in card deck.");
        System.out.println("in Joker -> " + cardDeck.toString().contains("JK"));
    }
}
