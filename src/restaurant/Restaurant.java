package restaurant;
import java.util.Arrays;
import java.util.Calendar;


public class Restaurant {

    //create menu:
    public static void main(String[] args) {

        Menu menu = new Menu("menu");

        // Initialize menu items:
        MenuItem mozzSticks = new MenuItem("mozzarella sticks", 5.95, "six breaded mozzarella cheese sticks, deep fried and served with marinara sauce", "appetizer");
        MenuItem chocMeringues = new MenuItem("chocolate meringues", 3.95, "light and crispy cocoa-flavored cookies", "dessert");
        MenuItem chzEnch = new MenuItem("cheese enchiladas", 8.95, "mixed cheeses wrapped in corn tortillas and topped with red sauce, served with rice and beans", "main course");

        // to test isNew()
        Calendar oldDate = Calendar.getInstance();
        oldDate.add(Calendar.DAY_OF_YEAR, -65);
        chzEnch.setDateAdded(oldDate.getTime());

        // Add items to menu:
        for (MenuItem menuItem : Arrays.asList(mozzSticks, chocMeringues, chzEnch)) {
            menu.addMenuItem(menuItem);
        }

        //Print the entire, updated menu:
        menu.toString();

        //Print an individual menu item to the screen:
        System.out.println(chocMeringues.toString());

        //Delete an item from the menu, then reprint the menu:
        menu.removeMenuItem(chocMeringues);
        menu.toString();

    }
}


