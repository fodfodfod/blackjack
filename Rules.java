package blackjack;
import java.util.Scanner;
public class Rules {

    public Rules(){
        
    }
    public void startGame(){
        Scanner kb = new Scanner(System.in);
        Dealer dealer = new Dealer();

        System.out.println("What is your name: ");
        name = kb.next();
        dealer.getPlayerName(name);
        while(true){
            System.out.println("hit or pass");
            input = kb.next();
            if(input == "hit"){
                dealer.hitPlayer();
            }
        }

    }
}
//does this change
