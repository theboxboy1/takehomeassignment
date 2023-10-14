
public class App {
    public static void main(String[] args) {
       
        double num1 = 3.0; double num2 = 5.0; double num3 = 4.0; // initializing variables

        if (num2>num1 && num2>num3){ // if num2>num1 and num2> num3, then num2 is the largest number
            System.out.println(num2 + " is the largest number");
        }
        else if (num1>num2 && num1>num3){ // if num1>num2 and num1>num3, then num1 is the largest number
            System.out.println(num1 + " is the largest number");
        }
        else{ // if none of the top conditions apply, then logically, num3 is the largest number
            System.out.println(num3 + " is the largest number");
        }
    }
}
