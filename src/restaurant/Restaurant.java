package restaurant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Restaurant {


    private static Menu menu = new Menu("menu");
    private static String name = "Restaurant";

    public Restaurant(String name) {
        this.name = name;
    }

    //create menu:
    public static void main(String[] args) {

        // Initialize menu items:


        MenuItem mozzSticks = new MenuItem("mozzarella sticks", 5.95, "six breaded mozzarella cheese sticks, deep fried and served with marinara sauce", "app", LocalDate.of(2019, 4, 2));
        MenuItem chocMeringues = new MenuItem("chocolate meringues", 3.95, "light and crispy cocoa-flavored cookies", "des", LocalDate.of(2020, 8, 30));
        MenuItem chzEnch = new MenuItem("cheese enchiladas", 8.95, "mixed cheeses wrapped in corn tortillas and topped with red sauce, served with rice and beans", "ent", LocalDate.of(2018, 10, 10));
        chzEnch.setDateAdded(java.time.LocalDate.of(2019,8,8));

        // Add items to menu:
        for (MenuItem menuItem : Arrays.asList(mozzSticks, chocMeringues, chzEnch)) {
            menu.menuItems.add(menuItem);
        }

        //Print the entire, updated menu:
        System.out.println(name.toUpperCase() + "'s MENU\nUpdated " + java.time.LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM YYYY")) + "\n");
        for (int i = 0; i < menu.menuItems.size(); i++) {
            System.out.println(menu.menuItems.get(i).toString());
        }


    }
}
