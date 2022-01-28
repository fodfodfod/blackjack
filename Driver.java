package blackjack;

public class Driver {
    public static void main(String[] args){
        Rules r = new Rules();

        r.startGame();

        Deck d = new Deck();
        
        System.out.println(d.toString());
        d.shuffle();
        System.out.println(d.toString());
    }
}
