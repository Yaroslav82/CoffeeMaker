package app;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {

    public void makeCoffee() {
        try (Scanner sc = new Scanner(System.in)) {
            printMenu();
            Coffee coffee = getCoffeeById(sc.nextInt());
            if (Objects.nonNull(coffee)) {
                System.out.printf("Your %s. Enjoy :)", coffee.getName());
            } else {
                System.out.println("Unknown coffee id :(");
            }
        } catch (InputMismatchException e) {
            System.out.println("The coffee ID must be an integer between 1 and 3.");
        }
    }

    private Coffee getCoffeeById(Integer id) {
        Coffee coffee = null;
        if (id.equals(1)) {
            coffee = new Espresso();
        } else if (id.equals(2)) {
            coffee = new Cappuccino();
        } else if (id.equals(3)) {
            coffee = new Latte();
        }
        return coffee;
    }

    private void printMenu() {
        System.out.println("""
                Choose a drink:
                      1 - Espresso
                      2 - Cappuccino
                      3 - Latte""");
    }
}
