import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Where are you from (country)? ");
        String location = input.nextLine();

        switch (location.toLowerCase()) {
            case "canada":
                System.out.print(
                    "Second-largest country globally by land area.\n" +
                    "Officially bilingual, with English and French as its official languages.\n" +
                    "Home to stunning national parks like Banff and Jasper.\n" +
                    "Boasts a publicly funded healthcare system for its citizens.\n" +
                    "Celebrates multiculturalism with a diverse population and rich traditions."
                );
                break;

            case "brazil":
                System.out.print(
                    "Largest country in South America by both land area and population.\n" +
                    "Official language is Portuguese.\n" +
                    "Known for the Amazon Rainforest, one of the world's most biodiverse ecosystems.\n" +
                    "Famous for its vibrant culture, including samba music and Carnaval.\n" +
                    "Home to iconic landmarks like Christ the Redeemer in Rio de Janeiro."
                );
                break;

            case "libya":
                System.out.print(
                    "Located in North Africa, Libya is the fourth largest country on the continent, with Arabic as the official language.\n" +
                    "Known for its diverse landscape, from the Sahara Desert in the south to the Mediterranean coastline in the north.\n" +
                    "Libya has a rich history, with ancient ruins like Leptis Magna and Sabratha.\n" +
                    "Libya's strategic location and history have made it a focal point in North African and Middle Eastern geopolitics."
                );
                break;

            default:
                System.out.println("I don't know anything about " + location);
        }

        input.close();
    }
}
