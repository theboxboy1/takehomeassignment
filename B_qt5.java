
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    
        System.out.println("Rock(1), Paper(2), Scissors(3): ");
        int input1 = input.nextInt();
        
        if(input1<1 || input1>3){
            System.out.println("Please input a valid option!");
            System.exit(1);
        }

        System.out.println("Rock(1), Paper(2), Scissors(3): ");
        int input2 = input.nextInt();

        if(input2<1 || input2>3){
            System.out.println("Please input a valid option!");
            System.exit(1);
        }

        else if(input1<1 || input2<1 || input1>3 || input2>3){
            System.out.println("Please input a valid option!");
        }
       
        else if ((input1 == 1 && input2 == 3) || (input1 == 2 && input2 == 1) || (input1 == 3 && input2 == 2)){
        System.out.println("Player 1 wins!");
       }
    else{
        System.out.println("Player 2 wins!");
    }
    
    input.close();
    
    }
}
