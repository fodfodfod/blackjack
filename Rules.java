package blackjack;
import java.util.Scanner;
public class Rules {

    public Rules(){
        
    }
    public void startGame(){
        Scanner kb = new Scanner(System.in);
        name = kb.next();
        Dealer d = new Dealer();
        d.getPlayerName(name);
        
    }
}
//does this change
