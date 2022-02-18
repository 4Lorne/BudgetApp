import java.util.Scanner;

public class Loops extends Restaurants {
    Scanner input = new Scanner(System.in);
    private String name = "";
    private String item = "";
    private double price = 0;

    public String optionLoop() {
        System.out.println("1.) Add a restaurant  2.) Remove a restaurant  3.) Add an item  4.) Remove an item");
        int result = input.nextInt();
        if (result == 1) {
            restaurantList.add(name);
            System.out.println(name + " added successfully.");
        } else if (result == 2) {
            restaurantList.remove(name);
            System.out.println(name + " removed successfully.");
        } else if (result == 3) {
            restaurantMenu.put(item, price);
            System.out.println(item + " added successfully.");
        } else if (result == 4) {
            restaurantMenu.remove(item);
            System.out.println(item + " removed successfully.");
        }
        return null;
    }
}
