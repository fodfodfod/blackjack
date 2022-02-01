package blackjack;

import java.util.Random;

public class Deck {
    private Card[] deck;


    public Deck(){
        this.deck = new Card[52];
        setUp();
    }

    public void shuffle(){
        Random r = new Random();
        
        final int SWITCHCOUNT = 200;
        for(int i = 0; i<SWITCHCOUNT; i++){
            int card1ID = r.nextInt(52);
            int card2ID = r.nextInt(52);
            Card temp = deck[card1ID];
            deck[card1ID] = deck[card2ID];
            deck[card2ID] = temp;
        }
    }

    public Card getTopCard(){
        Card[] new_deck = Card[deck.length-1];
        return new Card(deck[51]);
        for(int i = 0; i<deck.length - 1; i++){
            new_deck[i] = deck[i];
        }
        return deck[deck.length-1];
        deck = new_deck;
    }

    public void setUp(){
        
        String[] suits = {"d", "c", "h", "s"};
        int index = 0;
        for (int scnt = 0;scnt<suits.length; scnt++){
            for(int cnt = 1; cnt<14; cnt++){
                deck[index] = new Card(suits[scnt],cnt);
                index++;
            }
        }
    }

    public String toString(){
        String str = "";
        for(int cnt = 0; cnt<deck.length; cnt++){
            str += deck[cnt].getValue() + deck[cnt].getSuit() + ", ";
        }
        return str;
    }

    
    
}
