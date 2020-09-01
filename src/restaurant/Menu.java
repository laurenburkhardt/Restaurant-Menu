package restaurant;

import java.util.*;

public class Menu {
    private final String name;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    public Menu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println(this.name + " Menu\nUpdated: " + this.getDateUpdated().getDateAdded().toString());
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i).toString());
        }
        return null;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        if (menuItem != null) {
            if (this.menuItems == null) {
                this.menuItems = new ArrayList<>();
            }
            this.menuItems.add(menuItem);
        }
    }

    public MenuItem getDateUpdated() {
        if (menuItems == null || menuItems.isEmpty()) {
            return null;
        }
        MenuItem newestItem = menuItems.get(0);
        for (MenuItem item : menuItems) {
            if (item.getDateAdded().after(newestItem.getDateAdded())) {
                newestItem = item;
            }
        }
        return newestItem;
    }
}


