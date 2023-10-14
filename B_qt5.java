
import java.util.Scanner; // imports scanner

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in); // creates scanner class
    
        System.out.println("Rock(1), Paper(2), Scissors(3): ");
        int input1 = input.nextInt(); // makes variable 'input1' and ties it to user integer input
        
        if(input1<1 || input1>3){ // if the user does not pick a value that is from 1-3, will give error message and stop program
            System.out.println("Please input a valid option!");
            System.exit(1);
        }

        System.out.println("Rock(1), Paper(2), Scissors(3): ");
        int input2 = input.nextInt(); // makes variable 'input2' and ties it to user integer input

        if(input2<1 || input2>3){ //if the user does not pick a value that is from 1-3, will give error message and stop program
            System.out.println("Please input a valid option!");
            System.exit(1);
        }
       
        else if ((input1 == 1 && input2 == 3) || (input1 == 2 && input2 == 1) || (input1 == 3 && input2 == 2)){ // this line shows all winning possibilites for the first player, if the combination falls under any of these, player1 wins
        System.out.println("Player 1 wins!");
       }

        else if (input1 == input2){ // if both inputs are the same, it is a tie
            System.out.println("Tie!");
            }
        
        else{ // if none of the winning combinations for player1 (input1) have been played, and it is not a tie, then logically, player 2 must win
        System.out.println("Player 2 wins!");
        }
    
    input.close(); // stops taking input
    
    }
}
