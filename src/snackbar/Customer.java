package snackbar;

public class Customer {

    // fields
    private static int maxId = 0;

    private int id;
    private String name;
    private double cash;

    // constructor
    public Customer(String name, double cash) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void addCash(double newCash) {
        this.cash = this.cash + newCash;
    }

    public void buySnack(int amount, Snack name) {
        this.cash = this.cash - (name.getCost() * amount);
        name.buySnacks(amount);
    }
}