package snackbar;

public class VendingMachine {
    // fields
    public static int maxId = 0;

    private int id;
    private String name;

    // constructor
    public VendingMachine(String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
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

}