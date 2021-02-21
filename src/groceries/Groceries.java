package groceries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


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
        return vegetables;
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

    }

    public static void main(String[] args) {

        Scanner groceryScanner = new Scanner(System.in);
        System.out.println("What food group are you shopping from: ");
        System.out.println("1. Meat\n" + "2. Dairy\n" + "3. Vegetables\n" + "4. Fruits ");
        HashMap<String, String> groceryList = new HashMap<>();

        for (int i = 0; i < 3; i++) {

        String a = groceryScanner.nextLine();
        String b = groceryScanner.nextLine();

        groceryList.put(a, b);

        System.out.println(groceryList.put(a, b));

            groceryList.put("Milk ", " dairy");
            groceryList.put("Carrots ", " vegetables");
            groceryList.put("Ground beef ", " meat");
            groceryList.put("Cheese ", " dairy");
            groceryList.put("Tomatoes ", " vegetables");
            groceryList.put("Pork chops ", " meat");
        }
    }
}

