package homeworks;
public class HW2 {
    public static void main(String[] args) {
        int maxVanyaPrice = 500;
        int andreyPriceLimit = 200;
        int katyaMinPrice = 301;
        int vikaHelp = 200;

        int step3D = 35;
        int step2D = 27;

        String chosenType = "";
        int chosenPrice = 0;

        int andreyBudget = andreyPriceLimit + vikaHelp;

        for (int price = 200; price <= 500; price += step2D) {
            if (price >= katyaMinPrice && price <= andreyBudget) {
                chosenType = "2D";
                chosenPrice = price;
                break;
            }
        }

        if (chosenPrice == 0) {
            System.out.println("No suitable movie found.");
            return;
        }

        double discount = 0.15;
        double discountedPrice = chosenPrice * (1 - discount);

        System.out.println("Movie type: " + chosenType);
        System.out.println("Ticket price (no discount): " + chosenPrice + " rubles");
        System.out.println("Vanya price: " + discountedPrice + " rubles");
        System.out.println("Katya price: " + discountedPrice + " rubles");
        System.out.println("Vika price: " + discountedPrice + " rubles");
        System.out.println("Andrey price: " + chosenPrice + " rubles (no discount, with Vika's help)");
    }
}
