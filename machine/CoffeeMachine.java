package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine(400, 540, 120, 550,9);
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        String action;

        while(running) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            action = scanner.nextLine();

            if(action.equals("exit")) {
                running = false;
            } else
            {
                machine.input(action);
            }
        }
    }
}
