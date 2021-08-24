package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 550,9);
        Scanner scanner = new Scanner(System.in);

        machine.status();
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();

        switch(action) {
            case "buy":
                machine.buy();
                break;
            case "fill":
                machine.fill();
                break;
            case "take":
                machine.take();
                break;
            default:
                break;
        }

        machine.status();
    }
}
