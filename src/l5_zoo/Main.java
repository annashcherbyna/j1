package l5_zoo;

public class Main {
    public static void main(String[] args) {
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.

        Zooclub zooclub = new Zooclub();
        Person person1 = new Person("Artur",30,'M');
        Person person2 = new Person("Alla",32,'F');
        zooclub.addPerson(person1);
        zooclub.addPerson(person2);

        System.out.println(zooclub);

        Pet pet1 = new Pet("cat","Sonia",1);
        Pet pet2 = new Pet("dog","Mania",2);
        zooclub.addPet(person1,pet1);
        zooclub.addPet(person1,pet2);
        System.out.println(zooclub);

        zooclub.delPet(person1,pet2);
        System.out.println(zooclub);

        Pet pet3 = new Pet("parrot","Kesha",1);
        zooclub.addPet(person1,pet3);
        zooclub.addPet(person2,pet3);
        System.out.println(zooclub);
        zooclub.delPetFromAll(pet3);
        System.out.println(zooclub);
    }
}
