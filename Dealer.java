package blackjack;

public class Dealer {
    private int whosTurn;
    public Player[] player;
    private Deck deck;


    public Dealer(){
        whosTurn = 1;
        player = new Player[2];
        player[0] = new Player("house");
        deck = new Deck();
        deck.shuffle();
    }

    public void getPlayerName(String name){
        player[1] = new Player(name);
    }
    
    public int turnCounter(){
        int temp = whosTurn;
        whosTurn++;
        return temp;
    }
    public void hitPlayer(){

        player[1].hit(deck.getTopCard());
        System.out.println("you have that many points" + player[1].getHandTotal());
    }
    public void hitDealer(){

        player[0].hit(deck.getTopCard());
        //System.out.println(player[0].getHandTotal());
    }
    
}
