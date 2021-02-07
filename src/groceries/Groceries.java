package groceries;


import java.util.ArrayList;

public class Groceries {


    public ArrayList getGroceries() {
        return this.groceries;
    }
    
    // variables
    private String vegetables;
    private String dairy;
    private String meat;
    private String fruits;
    private ArrayList<String> groceries;

    // groceries constructor
    public Groceries(String vegetables, String dairy, String meat, String fruits) {
        this.vegetables = vegetables;
        this.dairy = dairy;
        this.meat = meat;
        this.fruits = fruits;
    }

    public String getVegetables() {
        return this.vegetables;
    }

    public String getDairy() {
        return dairy;
    }

    public String getMeat() {
        return meat;
    }

    public String getFruits() {
        return fruits;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public void setGroceries(ArrayList<String> groceries) {
        this.groceries = groceries;
    }

    public void addVegetables(String vegetables) {
        vegetables.equalsIgnoreCase(vegetables);
    }
    
    public static void main(String[] args) {

        Groceries newVegetable = new Groceries("Tomatoes");
        newVegetable.addVegetables("Cherry Tomatoes");
        newVegetable.addVegetables("Roma Tomatoes");
        newVegetable.addVegetables("Beef Steak Tomatoes");
        newVegetable.addVegetables("Heirloom Tomatoes");
        System.out.println(newVegetable.getVegetables());
    }
}
