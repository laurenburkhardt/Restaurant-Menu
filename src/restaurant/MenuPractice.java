package restaurant;

public class MenuPractice {

    public static void main(String[] args) {
        MenuItem fries = new MenuItem("fries", 2.99, "fried potatoes", "appetizers");
        System.out.println(fries.getName() + "\n" + fries.getDescription() + "\n$" + fries.getPrice());
    }

}