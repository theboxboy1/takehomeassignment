
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter your age: ");

        int num1 = input.nextInt();

         if(num1<0){
            System.out.println("Enter a valid age >0");
        }
       else if(num1<13){
            System.out.println("You are a child");
        }


        else if(num1>=13 && num1<=19){
            System.out.println("You are a teen");
        }

        else if(num1>=20 && num1<=65){
            System.out.println("You are an adult");
        }

        

        else{
            System.out.println("You are a senior citizen");
        }
        input.close();
    }
}
