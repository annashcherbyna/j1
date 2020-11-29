package p2;

public class Veterinar {

    public Veterinar() {
    }

    void treatAnimal(Animal animal){
        System.out.println("Food:" + animal.getFood());
        System.out.println("Locations:" + animal.getLocation());
    }
}
