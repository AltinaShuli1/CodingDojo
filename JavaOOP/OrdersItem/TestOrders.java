import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items();
        item1.name="coffee";
        item1.price=2.5;

        Items item2 = new Items();
        item2.name="CupCake";
        item2.price=3.2;
    
        Items item3 = new Items();
        item3.name="Late";
        item3.price=1.2;

        Items item4 = new Items();
        item4.name="Cappucino";
        item4.price=2.2;

        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        System.out.println(order1.total);
        order1.name="chloe"; 

        Orders order2 = new Orders();
        order2.name="Sam";

        Orders order3 = new Orders();
        order3.name="Luce";

        Orders order4 = new Orders();
        order4.name="Jim";
        // Application Simulations
        order2.items.add(item1);
        order2.total+=item1.price;

        order3.items.add(item4);
        order3.total+=item4.price;

        order4.items.add(item3);
        order4.total+=item3.price;

        order1.ready=true;

        order2.items.add(item3);
        order2.items.add(item3);
        order2.total+=2*item3.price;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
