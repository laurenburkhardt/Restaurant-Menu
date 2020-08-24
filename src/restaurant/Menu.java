package restaurant;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Menu {
    public String name;
    public Date dateUpdated;
    public static ArrayList<Objects> menuItems = getMenuItems();

    public Menu(String name, Date dateUpdated) {
        name = "";
        dateUpdated = Calendar.getInstance().getTime();

    }

    public static ArrayList<Objects> getMenuItems() {
        System.out.println(menuItems);
        return menuItems;
    }

}
