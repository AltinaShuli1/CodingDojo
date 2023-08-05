public class TestCoffee{
public static void main(String[] args) {
  CoffeeKios coffeeKiosk = new CoffeeKios();

  
        coffeeKiosk.addMenuItem("banana", 2.00);
        coffeeKiosk.addMenuItem("coffee", 1.50);
        coffeeKiosk.addMenuItem("latte", 4.50);
        coffeeKiosk.addMenuItem("capuccino", 3.00);
        coffeeKiosk.addMenuItem("muffin", 4.00);

        coffeeKiosk.dispayMenu();
}
}