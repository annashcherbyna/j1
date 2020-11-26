package l1;

import java.util.ArrayList;

public class Developer extends User{
    ArrayList<String> skills;

    public Developer(ArrayList<String> skills) {
        this.skills = skills;
    }

    public Developer(long id, int age, String name, double weight, boolean status, ArrayList<String> skills) {
        super(id, age, name, weight, status);
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "l1.Developer{" +
                "skills=" + skills +
                '}' + super.toString();
    }
}
