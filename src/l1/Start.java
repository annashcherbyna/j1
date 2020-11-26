package l1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        User vasya = new User();
        System.out.println(vasya);
        vasya.setId(1);
        vasya.setName("vasya");
        vasya.setWeight(78.0);
        System.out.println(vasya);

        User kostia = new User(2,30,"kostia",60,true);
        System.out.println(kostia);

        ArrayList<String> skills= new ArrayList<>();
        skills.add("java");
        skills.add("js");
        Developer dev1 = new Developer(skills);
        System.out.println("dev1: "+ dev1);
        Developer dev2 = new Developer(3,23,"sasha",78,true,skills);
        System.out.println(dev2);
    }
}
