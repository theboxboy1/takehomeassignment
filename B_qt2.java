
public class App {
    public static void main(String[] args) {
       
        double num1 = 3.0; double num2 = 5.0; double num3 = 4.0; // initializing variables

        if (num2<num1 && num2<num3){ // if num2<num1 and num2<num3, num2 is therefore the smallest number and is printed as such
            System.out.println(num2 + " is the smallest number");
        }
        else if (num1<num2 && num1<num3){ // if num1<num1 and num1<num2, num1 is therefore the smallest number and is printed as such
            System.out.println(num1 + " is the smallest number");
        }
        else{ // If none of the top  conditions apply, then logically num3 must be the smallest number 
            System.out.println(num3 + " is the smallest number");
        }
    }
}
