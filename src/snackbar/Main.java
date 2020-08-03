package snackbar;

public class Main {
    private static void workVending() {
        // public Customer(String name, double cash)
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine office = new VendingMachine("office");

        // public Snack(String name, int quantity, double cost, int vendingMachineId)
        Snack snack1 = new Snack("Chips", 36, 1.75, food.getName());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, food.getName());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, food.getName());
        Snack snack4 = new Snack("Soda", 24, 2.50, drink.getName());
        Snack snack5 = new Snack("Water", 20, 2.75, drink.getName());

        customer1.buySnack(3, snack4);
        System.out.println("\n" + customer1.getName() + " cash on hand: $" + customer1.getCash());
        System.out.println("Quantity of " + snack4.getName() + " " + snack4.getQuantity());

        customer1.buySnack(1, snack3);
        System.out.println("\n" + customer1.getName() + " cash on hand: $" + customer1.getCash());
        System.out.println("Quantity of " + snack3.getName() + " " + snack3.getQuantity());

        customer2.buySnack(2, snack4);
        System.out.println("\n" + customer2.getName() + " cash on hand: $" + customer2.getCash());
        System.out.println("Quantity of " + snack4.getName() + " " + snack4.getQuantity());

        customer1.addCash(10);
        System.out.println("\n" + customer1.getName() + " cash on hand: $" + customer1.getCash());

        customer1.buySnack(1, snack2);
        System.out.println("\n" + customer1.getName() + " cash on hand: $" + customer1.getCash());
        System.out.println("Quantity of " + snack2.getName() + " " + snack2.getQuantity());

        snack3.addQuantity(12);
        System.out.println("\n" + "Quantity of " + snack3.getName() + " " + snack3.getQuantity());

        customer2.buySnack(3, snack3);
        System.out.println("\n" + customer2.getName() + " cash on hand: $" + customer2.getCash());
        System.out.println("Quantity of " + snack3.getName() + " " + snack3.getQuantity());

        System.out.println(snack1.returnSnack());
        System.out.println(snack2.returnSnack());
        System.out.println(snack3.returnSnack());
        System.out.println(snack4.returnSnack());
        System.out.println(snack5.returnSnack());
    }

    public static void main(String[] args) {
        workVending();
    }
}