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
        //need 236 one card movements according to https://fredhohman.com/card-shuffling/ 
        final int SWITCHCOUNT = 100;
        for(int i = 0; i<SWITCHCOUNT; i++){
            int card1ID = r.nextInt(51);
            int card2ID = r.nextInt(51);
            Card temp = deck[card1ID];
            deck[card1ID] = deck[card2ID];
            deck[card2ID] = temp;
        }
    }

    public Card getTopCard(){
        return new Card("c", 1);
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
