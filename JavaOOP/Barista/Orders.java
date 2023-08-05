import java.util.ArrayList;

public class Orders {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // No-argument constructor
    public Orders() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    public Orders(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready";
        }
        
        return "Thank you for waiting!";
        
    }
    
    public double getOrderTotal(){
        double total=0.0;
        for (Item item:items){
            total+=item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer name : " + this.name);
        for (Item item:items) {
            System.out.println(item.getName()+ "- $" + item.getPrice());
        }
        System.out.println("Total: $"+ getOrderTotal());
    }
}