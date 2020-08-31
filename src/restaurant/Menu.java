package restaurant;

import java.time.LocalDate;
import java.util.*;

public class Menu {
    private final String name;
    private final Date dateUpdated;
    static ArrayList<MenuItem> menuItems = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return Objects.equals(name, menu.name) &&
                Objects.equals(dateUpdated, menu.dateUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateUpdated);
    }

    //constructor:
    public Menu(String name) {
        this.name = name;
        this.dateUpdated = Calendar.getInstance().getTime();
    }

    @Override
    public String toString() {
        System.out.println(this.name + " Menu");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).getName().toUpperCase() + " - " + menuItems.get(i).getDescription() + " - $" + menuItems.get(i).getPrice());
            menuItems.get(i).toString();
        }
        return null;
    }

    public static void addItem() {

        Scanner input = new Scanner(System.in);
        System.out.println("Add new menu item? Y/N");
        String newItem = input.nextLine();

//        if (newItem == "y") {
//            System.out.println("New item name:");
//            String name = input.nextLine();
//            System.out.println("New item description:");
//            String description = input.nextLine();
//            System.out.println("New item price:");
//            double price = input.nextDouble();
//            System.out.println("New item category:");
//            String category = input.nextLine();
//            new MenuItem(name, price, description, category, LocalDate.now());
//        } else {
//
//        }
//        public static void main(String args) {
//            addItem();
//        }
    }
}



