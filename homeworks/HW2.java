package homeworks;
public class HW32 {

    public static void main(String[] args) {
        // Variables
        int maxPriceVanya = 500;
        int andreyPriceLimit = 200;
        int katyaMinPrice = 301; // greater than 300
        int vikaHelp = 200; // Vika helps Andrey with 200

        double discount = 0.15; // 15% discount

        int step3D = 35;
        int step2D = 27;

        String chosenType = "";
        int chosenPrice = 0;

        // Search for suitable 3D price (Vanya wants 3D ≤ 500)
        // But Andrey can only go for 2D with price 200, so 3D likely not possible
        // Still, we check for completeness
        boolean canUse3D = false;
        for (int price = 350; price <= maxPriceVanya; price += step3D) {
            if (price > katyaMinPrice) {
                canUse3D = true; // just to know
            }
        }

        // Search for suitable 2D price meeting Katya and Andrey conditions
        int andreyBudget = andreyPriceLimit + vikaHelp; // Andrey's budget with Vika's help

        boolean canUse2D = false;
        for (int price = 200; price <= 500; price += step2D) {
            if (price >= katyaMinPrice && price <= andreyBudget) {
                chosenType = "2D";
                chosenPrice = price;
                canUse2D = true;
                break;
            }
        }

        if (canUse2D) {
            System.out.println("Selected movie type: " + chosenType);
            System.out.println("Ticket price without discount: " + chosenPrice + " rubles");

            double priceWithDiscount = chosenPrice * (1 - discount);

            System.out.printf("Vanya: %.2f rubles\n", priceWithDiscount);
            System.out.printf("Katya: %.2f rubles\n", priceWithDiscount);
            System.out.printf("Vika: %.2f rubles\n", priceWithDiscount);

            // Andrey has no student discount but gets Vika's help (extra 200 rubles)
            System.out.println("Andrey: " + chosenPrice + " rubles (no discount, with Vika's help)");

        } else {
            System.out.println("No suitable movie found for everyone.");
        }
    }
}
