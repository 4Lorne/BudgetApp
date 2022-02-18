import java.util.ArrayList;

public class Restaurants extends Menu {
    private String name;

    ArrayList restaurantList = new ArrayList();

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        restaurantList.add(name);
        System.out.println(name + " added successfully.");
    }

    // Loop to list all the restaurants
    public void listRestaurants() {
        restaurantList.forEach(i -> System.out.println(i));
    }

    public void removeRestaurant(String name) {
        restaurantList.remove(name);
        System.out.println(name + " removed succesfully");
    }

}