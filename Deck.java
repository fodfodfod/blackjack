package blackjack;

import java.util.Random;

public class Deck {
    private Card deck[];


    public Deck(){
        this.deck = new Card[52];
        setUp();
    }

    public void shuffle(){
        //making us do
        Random r = new Random();
        //need 236 one card movements according to https://fredhohman.com/card-shuffling/ 
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

    
    
}
