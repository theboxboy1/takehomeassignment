
import java.util.Scanner; //imports scanner

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in); // creates scanner class
    
        System.out.println("Enter your age: ");

        int num1 = input.nextInt(); // assigns variable to user integer input

         if(num1<0){ // if the number the user inputs is less than 0, it will print an error message
            System.out.println("Enter a valid age >0");
        }
       else if(num1<13){ // if the inputted number is less than 13, it will print out that the user is a child
            System.out.println("You are a child");
        }


        else if(num1>=13 && num1<=19){ // if the inputted number is from 13 to 19, the output will be "You are a teen"
            System.out.println("You are a teen");
        }

        else if(num1>=20 && num1<=65){ // if the number is from 20 to 65, will print "You are an adult"
            System.out.println("You are an adult");
        }

        

        else{ // if none of the above conditions apply, logically the user's age is >65 and therefore is a senior citizen
            System.out.println("You are a senior citizen");
        }
        input.close(); // stops taking input from user
    }
}
