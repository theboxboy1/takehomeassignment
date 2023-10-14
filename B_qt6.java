import java.util.Scanner; // imports scanner

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates scanner class

        System.out.print("Input language preference: "); // prints out statement asking user to input language
        String language = input.nextLine(); // ties variable to user string input

        switch (language.toLowerCase()) { // creates switch class for language variable and lowercases user input in case they capitalize their input
            case "english": // if the user inputs english, will print out english greetings
                System.out.print(
                    "Hello! How's it going?"
                );
                break;

            case "german": // prints german greeting if user inputs german
                System.out.print(
                    "Hi, wie geht's?"
                );
                break;

            case "french": // prints french greeting if user inputs french
                System.out.print(
                    "Bonjour! comment ça va?"
                );
                break;

            default: // if the user does not input any of the above languages, will output that it does not know any of the user's inputted language greetings
                System.out.println("I don't know any " + language + " greetings.");
        }

        input.close(); // stops taking input from user
    }
}
