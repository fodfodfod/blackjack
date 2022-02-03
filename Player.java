package blackjack; 

public class Player {
    private String name;
    private Card[] hand;
    private int cardCount;
    public Player(String name){
        this.name = name;
        resetHand();
    }
    public void hit(Card card){
        hand[cardCount++] = card;

    }
    public int getHandTotal(){
        //count hand value
        int total = 0;
        for (int cnt = 0; cnt<cardCount; cnt++){
            total += hand[cnt].getValue();
        }
        return total;
    }

    public void resetHand(){
        cardCount = 0;
        hand = new Card[5];
    }
    public String getName(){
        return name;
    }
    
}
