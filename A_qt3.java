import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("5/3 * 3 is: ");

        int num1 = input.nextInt();

        if (num1 == 5) {
            System.out.println("Correct!");
            System.out.println("5-2 is: ");
            int num2 = input.nextInt();
            if (num2 == 3) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is 3");
                System.exit(1);
            }
             
            System.out.println("What is 7-4+1-2");
            int num3 = input.nextInt();
        if(num3 == 2) {
            System.out.println("Correct!");
            } else {
    System.out.println("Wrong! The correct answer is 2");
    System.exit(1);
}

        } else {
            System.out.println("Wrong! The correct answer is 5");
            System.exit(1);
        }
        
        input.close();
    }
}
