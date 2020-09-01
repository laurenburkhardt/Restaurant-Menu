package restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class MenuItem {

    // fields:
    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded= new Date(); //dateAdded should be final- wanted to add setter to test isNew()
    public boolean newItem = this.isNew();

    //constructor:
    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    //    getters:
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    //setters:
    public void setName(String aName) {
        name = aName;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public void setCategory(String aCategory) {
        category = aCategory;
    }

    public void setDateAdded(Date aDateAdded) {
        dateAdded = aDateAdded;
    }

    public boolean isNew() {
        Calendar threeWeeksAgo = Calendar.getInstance();
        threeWeeksAgo.add(Calendar.DAY_OF_YEAR, -21);
        return this.dateAdded.after(threeWeeksAgo.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.getPrice(), getPrice()) == 0 &&
                newItem == menuItem.newItem &&
                Objects.equals(getName(), menuItem.getName()) &&
                Objects.equals(getDescription(), menuItem.getDescription()) &&
                Objects.equals(getCategory(), menuItem.getCategory()) &&
                Objects.equals(getDateAdded(), menuItem.getDateAdded());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getDescription(), getCategory(), getDateAdded(), newItem);
    }

    @Override
    public String toString() {
        String print = "";
        print = this.name.toUpperCase() + " | " + this.description + " | $" + this.price + "\n";
        if (this.isNew()) {
            return "*NEW* " + print;
        } else
            return print;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

}


