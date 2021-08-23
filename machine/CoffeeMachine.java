package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        /*
            System.out.println("Starting to make a coffee");
            System.out.println("Grinding coffee beans");
            System.out.println("Boiling water");
            System.out.println("Mixing boiled water with crushed coffee beans");
            System.out.println("Pouring coffee into the cup");
            System.out.println("Pouring some milk into the cup");
            System.out.println("Coffee is ready!");
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int amount = scanner.nextInt();
        calculateIngredients(amount);
    }

    private static void calculateIngredients(int amount) {
        int water = 200 * amount;
        int milk = 50 * amount;
        int beans = 15 * amount;

        System.out.printf("For %d cups of coffee you will need:\n", amount);
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", beans);
    }
}
