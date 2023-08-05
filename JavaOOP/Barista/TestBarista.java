public class TestBarista{
     public static void main(String[] args) {

        Item item1 = new Item("drip coffee", 1.60);
        Item item2 = new Item("capuccino", 2.5);
        Item item3 = new Item("iced coffee", 2.15);
        Item item4 = new Item("mocha", 3.10);

        Orders order1 = new Orders();
        Orders order2 = new Orders();

        Orders order3 = new Orders("Chloe");
        Orders order4 = new Orders("Sam");
        Orders order5 = new Orders("Nick");

        order3.addItem(item4);
        order3.addItem(item1);

        order2.addItem(item2);
        order2.addItem(item4);
        
        order1.addItem(item4);
        order1.addItem(item2);
        order1.addItem(item1);

        order4.addItem(item4);
        order4.addItem(item3);
        order4.addItem(item2);

        order3.display();

        CafeeKiosk cafekiosk= new CafeeKiosk();
        cafekiosk.addMenuItem("Beer", 3.0);
        cafekiosk.displayMenu();
    }
    
}
