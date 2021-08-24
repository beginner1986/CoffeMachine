package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 550,9);
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;

        while(!finished) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
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
                case "remaining":
                    machine.remaining();
                    break;
                case "exit":
                    finished = true;
                    break;
                default:
                    break;
            }
        }
    }
}
