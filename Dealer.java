package blackjack;

public class Dealer {
    private int whosTurn;
    private Player[] player;


    public Dealer(){
        whosTurn = 1;
        player = new Player[2];
        player[0] = new Player("house");
    }

    public void getPlayerName(String name){
        player[1] = new Player(name);
    }
    
    public int turnCounter(){
        int temp = whosTurn;
        whosTurn++;
        return temp;
    }
}
