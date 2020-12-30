package l5_zoo;

import java.util.*;

public class Zooclub {
    private Map<Person, List<Pet>> club;

    public Zooclub() {
        this.club = new HashMap<Person, List<Pet>>() ;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public void addPerson(Person person){
        List<Pet> pets = new ArrayList<>();
        this.club.put(person,pets);
    }

    public void addPet(Person person,Pet pet){
        this.club.get(person).add(pet);
    }

    public void delPet(Person person,Pet pet){
        this.club.get(person).remove(pet);
    }

    public void delPetFromAll(Pet pet){
        this.club.forEach((k,v)->{
            if(v.indexOf(pet)>-1){
                v.remove(pet);
            }
        });
    }

    public void delPerson(Person person){
        this.club.remove(person);
    }

    @Override
    public String toString() {
        return "Zooclub{" +
                "club=" + club +
                '}';
    }
}
