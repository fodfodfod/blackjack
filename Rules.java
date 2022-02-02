package blackjack;
import java.util.Scanner;
public class Rules {

    public Rules(){
        
    }
    public void startGame(){
        Scanner kb = new Scanner(System.in);
        Dealer dealer = new Dealer();

        System.out.println("What is your name: ");
        String name = kb.nextLine();
        dealer.getPlayerName(name);
        String input = "hit";
        dealer.hitPlayer();
        dealer.hitPlayer();
        while(dealer.player[1].getHandTotal()<22 && input.equals("hit")){
            System.out.println("hit or pass");
            input = kb.nextLine();
            if(input.equals("hit") ){
                System.out.println("player hit");
                dealer.hitPlayer();
            }
            
        }
        while(dealer.player[0].getHandTotal()<17){
            dealer.hitDealer();
        }

        if(dealer.player[1].getHandTotal() > 21){
            System.out.println("you lose");
        }

        else if((dealer.player[1].getHandTotal() == 21) || (dealer.player[1].getHandTotal()>dealer.player[0].getHandTotal())){
            System.out.println("you win");
        }

        else{
            System.out.println("you lose");
        }


    }
}
//does this change
