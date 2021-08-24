package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water;
        int milk;
        int beans;
        int cups;

        System.out.println("Write how many ml of water the coffee machine has: ");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cups = scanner.nextInt();

        checkServingsNumber(water, milk, beans, cups);
/*
        System.out.println("Write how many cups of coffee you will need: ");
        int amount = scanner.nextInt();
        calculateIngredients(amount);
 */
    }

    private static void checkServingsNumber(int water, int milk, int beans, int cups) {
        int waterNeeded = 200 * cups;
        int milkNeeded = 50 * cups;
        int beansNeeded = 15 * cups;

        int amount = Math.min(Math.min(water / 200, milk / 50), beans / 15);

        if(amount == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(amount < cups){
                System.out.printf("No, I can make only %d cup(s) of coffee", amount);
        } else {
            amount -= cups;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", amount);
        }
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
