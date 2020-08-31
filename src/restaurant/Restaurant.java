package restaurant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Restaurant {


    private static Menu menu = new Menu("menu");
    private static String name = "Restaurant";
    private LocalDate dateUpdated;

    public Restaurant(String name, LocalDate dateUpdated) {
        Restaurant.name = name;
        this.dateUpdated = dateUpdated;
    }

    public static void printMenu() {
        System.out.println(name.toUpperCase() + "'s MENU\t" + java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM YYYY")) + "\n");
        for (int i = 0; i < Menu.menuItems.size(); i++) {
            System.out.println(Menu.menuItems.get(i).toString());
        }
    }

    public static void addMenuItemUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
    }

    //create menu:
    public static void main(String[] args) {



        // Initialize menu items:
        MenuItem mozzSticks = new MenuItem("mozzarella sticks", 5.95, "six breaded mozzarella cheese sticks, deep fried and served with marinara sauce", "appetizer", LocalDate.of(2019, 4, 2));
        MenuItem chocMeringues = new MenuItem("chocolate meringues", 3.95, "light and crispy cocoa-flavored cookies", "dessert", LocalDate.of(2020, 8, 30));
        MenuItem chzEnch = new MenuItem("cheese enchiladas", 8.95, "mixed cheeses wrapped in corn tortillas and topped with red sauce, served with rice and beans", "main course", LocalDate.of(2018, 10, 10));

        // Add items to menu:
        for (MenuItem menuItem : Arrays.asList(mozzSticks, chocMeringues, chzEnch)) {
            menu.menuItems.add(menuItem);
        }

        //Print the entire, updated menu:
        printMenu();

        //Print an individual menu item to the screen:
        System.out.println(chocMeringues.toString());

        //Delete an item from the menu, then reprint the menu:
        menu.menuItems.remove(chocMeringues);
        printMenu();

        Menu.addItem();

    }

    public static Menu getMenu() {
        return menu;
    }

    public static void setMenu(Menu menu) {
        Restaurant.menu = menu;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
