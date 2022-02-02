package blackjack;
import java.util.Scanner;
public class Rules {

    public Rules(){
        
    }
    public void startGame(){
        Scanner kb = new Scanner(System.in);
        Dealer dealer = new Dealer();

        System.out.println("What is your name: ");
        String name = kb.next();
        dealer.getPlayerName(name);
        while(true){
            System.out.println("hit or pass");
            String input = kb.nextLine();
            if(input == "hit"){
                System.out.println("player hit");
                dealer.hitPlayer();
            }
        }

    }
}
//does this change
