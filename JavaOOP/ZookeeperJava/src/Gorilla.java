public class Gorilla extends Mammal{
    public Gorilla() {

    }
    public void throwSomething(){
        System.out.println("Gorilla throws rocks ");
        energyLevel -=5;
        displayEnergy();
    }

    public void eatBananas(){
        System.out.println("Eating Banana ");
        energyLevel +=10;
        displayEnergy();
    }
    public void climb(){
        System.out.println("Climbing trees ");
        energyLevel -=10;
        displayEnergy();
    }
}
