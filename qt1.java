import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Input a name: ");
    
        String name = input.nextLine();

        if (name.toLowerCase().equals("zakariya")) {
            System.out.println("Same name as programmer!");
        } 
        else {
            System.out.print("Not the same name as programmer!");
        }
        input.close();
    }
}
