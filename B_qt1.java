import java.util.Scanner; // imports scanner

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates scanner class

        System.out.print("Where are you from (country)? "); 
        String location = input.nextLine(); // creates variable location and ties it to user input

        switch (location.toLowerCase()) { // creates switch class and input is converted to lowercase to also accept uppercase country inputs
            case "canada": // if the input is canada, prints out canada facts
                System.out.print(
                    "Second-largest country globally by land area.\n" +
                    "Officially bilingual, with English and French as its official languages.\n" +
                    "Home to stunning national parks like Banff and Jasper.\n" +
                    "Boasts a publicly funded healthcare system for its citizens.\n" +
                    "Celebrates multiculturalism with a diverse population and rich traditions."
                );
                break;

            case "brazil": // in the case of the input being brazil, prints out brazil facts
                System.out.print(
                    "Largest country in South America by both land area and population.\n" +
                    "Official language is Portuguese.\n" +
                    "Known for the Amazon Rainforest, one of the world's most biodiverse ecosystems.\n" +
                    "Famous for its vibrant culture, including samba music and Carnaval.\n" +
                    "Home to iconic landmarks like Christ the Redeemer in Rio de Janeiro."
                );
                break;

            case "libya": // in the case of input being libya, prints out libya facts
                System.out.print(
                    "Located in North Africa, Libya is the fourth largest country on the continent, with Arabic as the official language.\n" +
                    "Known for its diverse landscape, from the Sahara Desert in the south to the Mediterranean coastline in the north.\n" +
                    "Libya has a rich history, with ancient ruins like Leptis Magna and Sabratha.\n" +
                    "Libya's strategic location and history have made it a focal point in North African and Middle Eastern geopolitics."
                );
                break;

            default: // if none of the above countries are inputted, will output that it doesnt know anything about the country the user inputted
                System.out.println("I don't know anything about " + location);
        }

        input.close(); // stops taking input from user
    }
}
