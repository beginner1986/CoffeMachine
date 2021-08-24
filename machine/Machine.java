package machine;

import java.util.Scanner;

public class Machine {
    private int water;
    private int milk;
    private int beans;
    private int money;
    private int cups;

    private Scanner scanner;

    public Machine(int water, int milk, int beans, int money, int cups) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.money = money;
        this.cups = cups;

        scanner = new Scanner(System.in);
    }

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", this.water);
        System.out.printf("%d ml of milk\n", this.milk);
        System.out.printf("%d g of coffee beans\n", this.beans);
        System.out.printf("%d disposable cups\n", this.cups);
        System.out.printf("$%d of money\n\n", this.money);
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();

        switch(choice) {
            case "1":
                makeEspresso();
                break;
            case "2":
                makeLatte();
                break;
            case "3":
                makeCappucino();
                break;
            default:
                break;
        }
    }
    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int cups = scanner.nextInt();

        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }
    public void take() {
        System.out.printf("I gave you $%d", this.money);
        this.money = 0;
    }

    private void makeEspresso() {
        if(this.water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if(this.beans < 16) {
            System.out.println("Sorry, not enough beans!");
        } else if(this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 250;
            this.beans -= 16;
            this.money += 4;
            this.cups--;
        }
    }
    private void makeLatte() {
        if(this.water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if(this.milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if(this.beans < 20) {
            System.out.println("Sorry, not enough beans!");
        } else if(this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 350;
            this.milk -= 75;
            this.beans -= 20;
            this.money += 7;
            this.cups--;
        }
    }
    private void makeCappucino() {
        if(this.water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if(this.milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if(this.beans < 12) {
            System.out.println("Sorry, not enough beans!");
        } else if(this.cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= 200;
            this.milk -= 100;
            this.beans -= 12;
            this.money += 6;
            this.cups--;
        }
    }
}
