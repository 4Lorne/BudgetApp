import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    private String item = "";
    private double price = 0;

    Map<String, Double> restaurantMenu = new HashMap<String, Double>();

    public void getItem(String item) {
        if (restaurantMenu.get(item) == null) {
            System.out.println("This item does not exist.");
        } else {
            System.out.println(restaurantMenu.get(item));
        }
    }

    public void setItem(String item, double price) {
        this.item = item;
        this.price = price;
        restaurantMenu.put(item, price);
    }

    public void removeItem(String item) {
        restaurantMenu.remove(item);
    }

    // https://www.delftstack.com/howto/java/how-to-print-hashmap-in-java/
    public void listMenu() {
        restaurantMenu.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

}
