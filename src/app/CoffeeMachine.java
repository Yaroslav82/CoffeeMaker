package app;

public class CoffeeMachine {

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
