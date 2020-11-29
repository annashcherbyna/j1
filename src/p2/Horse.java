package p2;

public class Horse extends Animal{
    private double weight;
    private String name;
    private String skills;

    public Horse(String food,String location,double weight, String name,String skills) {
        super(food,location);
        this.weight = weight;
        this.name = name;
        this.skills = skills;
    }

    @Override
    public void makeNoise(){
        System.out.println("neigh-neigh");
    }

    @Override
    public void sleep(){
        System.out.println("Horse is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Horse is eating");
    }

    @Override
    public String toString(){
        return super.toString() + " name: "
                +this.name + " weight: "
                +this.weight + " skills: "
                +this.skills;
    }
}
