package blackjack; 
import java.util.Scanner;
public class Rules {

    public Rules(){
        
    }
    public void startGame(){
        Scanner kb = new Scanner(System.in);
        Dealer dealer = new Dealer();

        // System.out.println("What is your name: ");
        // String name = kb.nextLine();
        dealer.getPlayerName("name");
        String input = "hit";
        dealer.hitPlayer(false);
        dealer.hitPlayer(true);
        while(dealer.player[1].getHandTotal()<22 && input.equals("hit")){
            System.out.println("hit or pass");
            input = kb.nextLine();
            if(input.equals("hit") ){
                System.out.println("player hit");
                dealer.hitPlayer(true);
            }
            
        }
        while(dealer.player[0].getHandTotal()<17){
            dealer.hitDealer();
        }





        System.out.println("\n\n\n\n");
        // 0 is dealer
        // 1 is player
        boolean gameWon = false;
        if(dealer.player[1].getHandTotal()>dealer.player[0].getHandTotal()){
            gameWon = true;
        }
        if(dealer.player[1].getHandTotal() > 21){
            gameWon = false;
        }
        if(dealer.player[1].getHandTotal() == 21){
            gameWon = true;
        }
        if(dealer.player[0].getHandTotal() > 21){
            gameWon = true;
        }



        if(gameWon){
            System.out.println("you won");
        }
        else{
            System.out.println("you lost");
        }
        System.out.println("the dealer has " + dealer.player[0].getHandTotal() + " points");
        System.out.println("you have " + dealer.player[1].getHandTotal() + " points");
        // if(dealer.player[1].getHandTotal() > 21){
        //     System.out.println("bust");
        //     System.out.println("you lose");
        // }

        // else if((dealer.player[1].getHandTotal() == 21) || (dealer.player[1].getHandTotal()>dealer.player[0].getHandTotal())){
        //     System.out.println("you win");
        //     System.out.println("the dealer has " + dealer.player[0].getHandTotal() + " points");
        // }

        // else{
        //     System.out.println("you lose");
        //     System.out.println("the dealer has " + dealer.player[0].getHandTotal() + " points");
        // }


    }
}
//does this change
