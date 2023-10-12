import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //makes input a Scanner class
    
        System.out.print("Input a name: "); // prints out "Input a name: " 
    
        String name = input.nextLine(); //stores the input

        if (name.toLowerCase().equals("zakariya")) {
            System.out.println("Same name as programmer!"); // if the input equals to "zakariya ", it will print that it is the same name as programmer
        } 
        else {
            System.out.print("Not the same name as programmer!"); // if input is not my name, the program will print the statement in quotes
        }
        input.close();
    }
}
