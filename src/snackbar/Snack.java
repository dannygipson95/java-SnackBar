package snackbar;

public class Snack {
    // fields
    public static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId){
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

    public int getVendingMachineId(){
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId){
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

}