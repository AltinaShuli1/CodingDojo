import java.util.ArrayList;

public class Orders {
    private String name; // default value of null
    private boolean ready; // default value of false
    private ArrayList<Item> items; // defaults to null

    public Orders(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    public  Orders(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
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
    

}
