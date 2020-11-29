package p2;

public class Veterinarian {

    public Veterinarian() {
    }

    void treatAnimal(Animal animal){
        System.out.println("Food:" + animal.getFood());
        System.out.println("Locations:" + animal.getLocation());
    }
}
