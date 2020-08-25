package restaurant;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Menu {
    private String name;
    private Date dateUpdated;
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
        this.dateUpdated = Calendar.getInstance().getTime();
//        this.menuItems = new ArrayList<>();
    }

    public static void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }


    public static void main(String[] args) {
        MenuItem fries = new MenuItem("fries", 2.99, "fried potatoes", "appetizer");
        MenuItem mozzSticks = new MenuItem("mozzarella sticks", 6.99, "fried cheese", "appetizer");
        MenuItem chocMeringues = new MenuItem("choclate meringues", 4.39, "light, sweet, delish", "dessert");
        addMenuItem(fries);
        addMenuItem(mozzSticks);
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).getName().toUpperCase() + " - " + menuItems.get(i).getDescription() + " - $" + menuItems.get(i).getPrice());
        }
    }

}

