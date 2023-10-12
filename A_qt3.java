import java.util.Scanner; //imports scanner

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // creates scanner class
    
        System.out.println("5/3 * 3 is: "); // prints out string in brackets

        int num1 = input.nextInt(); // declares variable num1 as the user integer inout

        if (num1 == 5) {
            System.out.println("Correct!");
            System.out.println("5-2 is: ");
            int num2 = input.nextInt(); // if num1 equals 5, outputs correct and the next question
            if (num2 == 3) {
                System.out.println("Correct!"); // if num2 equals 3, outputs correct
            } else {
                System.out.println("Wrong! The correct answer is 3"); 
                // if num2 != 3, prints out that the input is wrong and exits the program
                System.exit(1);
            }
             
            System.out.println("What is 7-4+1-2"); // prints out string inside bracket
            int num3 = input.nextInt(); // declares num3 as a vaiable that takes in user input
        if(num3 == 2) { // if num3 = 2, prints out correct
            System.out.println("Correct!");
            } else {
    System.out.println("Wrong! The correct answer is 2");
    System.exit(1); // if num3 != 2, prints out correct answer and exits program
}

        } else {
            System.out.println("Wrong! The correct answer is 5"); // prints string in bracket
            System.exit(1); // exits program
        }
        
        input.close(); // closes user input stream
    }
}
