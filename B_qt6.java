import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input language preference: ");
        String language = input.nextLine();

        switch (language.toLowerCase()) {
            case "english":
                System.out.print(
                    "Hello! How's it going?"
                );
                break;

            case "german":
                System.out.print(
                    "Hi, wie geht's?"
                );
                break;

            case "french":
                System.out.print(
                    "Bonjour! comment ça va?"
                );
                break;

            default:
                System.out.println("I don't know any " + language + " greetings.");
        }

        input.close();
    }
}
