package p2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("meat", "house", 20.00, "Sharik");
        Dog dog2 = new Dog("meat", "street", 20.00, "");
        Cat cat1 = new Cat("milk","house",5.5,"Mila");
        Cat cat2 = new Cat("fish","street",8.5,"");
        Horse horse1 = new Horse("carrot,apple","stable",5.5,"Mila","jump,run");

        ArrayList<Animal> arrAnimal = new ArrayList<>();
        arrAnimal.add(dog1);
        arrAnimal.add(dog2);
        arrAnimal.add(cat1);
        arrAnimal.add(cat2);
        arrAnimal.add(horse1);

        Veterinarian vet1 = new Veterinarian();

        for (Animal animal:arrAnimal
             ) {
            System.out.println("");
            animal.makeNoise();
            System.out.println(animal.toString());
            vet1.treatAnimal(animal);
        }

    }
}
