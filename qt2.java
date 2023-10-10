import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Input two numbers: ");
    
        Double num1= input.nextDouble();
        Double num2= input.nextDouble();

        if (num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
    else if(num2>num1){
        System.out.println(num2 + " is greater than " + num1);
    }
    else{
        System.out.println(num1 + " is equal to " + num2);
    }
    input.close();
    }
}
