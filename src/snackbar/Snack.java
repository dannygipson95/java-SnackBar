package snackbar;

public class Snack {
    // fields
    public static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private String vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost, String vendingMachineId){
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public String getVendingMachineId(){
        return vendingMachineId;
    }

    public void setVendingMachineId(String vendingMachineId){
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int newQuantity){
        quantity = newQuantity + quantity;
    }

    public void buySnacks(int buyQuantity){
        quantity = quantity - buyQuantity;
    }

    public double totalCost(int quantity){
        return cost*quantity;
    }

    public String returnSnack(){
        return "\nSnack: " + this.name + "\nVending Machine: " + vendingMachineId +
                "\nQuantity: " + this.quantity + "\nTotal Cost: $" + quantity*cost;
    }

}