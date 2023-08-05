import java.util.ArrayList;

public class CoffeeKios {
    private ArrayList<Item> menu;
    private ArrayList<Orders> orders;


    public CoffeeKios() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Orders>();
    }


    public void addMenuItem(String name , Double price){
        Item newitem = new Item(name , price );
        menu.add(newitem);
        newitem.setIndex(menu.indexOf(newitem));
    }

    public void dispayMenu(){
        for(Item item:menu){
        System.out.println(item.getIndex() + " " + item.getName()+ " " + item.getPrice());
        }
    }
    
        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Orders newOrder = new Orders( name );
        dispayMenu();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        
            
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }

    

    

