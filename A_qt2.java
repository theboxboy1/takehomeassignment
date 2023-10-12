import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //creates scanner class for input
    
        System.out.print("Input two numbers: "); // prints out string in brackets
    
        Double num1= input.nextDouble(); 
        Double num2= input.nextDouble();
        //declares variables as double variable type

        if (num1>num2){
            System.out.println(num1 + " is greater than " + num2); // if num1>num2 will print out num1 is greather than num 2
        }
    else if(num2>num1){
        System.out.println(num2 + " is greater than " + num1); // if num2>num1 prints that num 2 greather than number
    }
    else{
        System.out.println(num1 + " is equal to " + num2); // if no number is bigger, will print out both numbers are equal
    }
    input.close(); // closes input from user
    }
}
