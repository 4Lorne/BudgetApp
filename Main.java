import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
TO DO: 
Create a hashmap to hold menu items, and their cost DONE
Create a class to hold user options and loops
Create a loop for users to add or remove restaurants from list until button is pressed
Create ability to save the file
Add catches if value is null or does not exist
Pick a restaurant to add total to
Method to store item and retrieve cost
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurants restaurants = new Restaurants();
        // Options for user

        // Adds the new restaurant to an arraylist
        System.out.println("Add a restaurant: ");
        String newRestaurant = input.nextLine();
        restaurants.setName(newRestaurant);

        // Removes the restaurant from the arraylist
        System.out.println("Remove a restaurant: ");
        String removeRestaurant = input.nextLine();
        restaurants.removeRestaurant(removeRestaurant);
        // Add an item to the hashmap
        System.out.println("Put an item and its cost: ");
        String order = input.nextLine();
        double orderCost = input.nextDouble();
        restaurants.setItem(order, orderCost);
        // Adds items to HashMap
        restaurants.setItem("Breakfast Sandwich", 1.99);
        restaurants.getItem("Breakfast Sandwich");
        restaurants.removeItem("Breakfast Sandwich");
        restaurants.getItem("Breakfast Sandwich");
        restaurants.listMenu();

        restaurants.
    }
}