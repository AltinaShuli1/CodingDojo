public class Bat extends  Mammal{
    public Bat() {
        energyLevel=300;
    }

    public void fly(){
        System.out.println("I can fly");
        energyLevel -= 50;
        displayEnergy();
    }
    public void eatHumans(){
        System.out.println("Eating human ");
        energyLevel += 25;
        displayEnergy();

    }

    public void attackTown(){
        System.out.println("Town on fire");
        energyLevel -= 100;
        displayEnergy();
    }
}
