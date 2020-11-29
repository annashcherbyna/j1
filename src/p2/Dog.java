package p2;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Dog extends Animal{
    private double weight;
    private String name;

    public Dog(String food,String location,double weight, String name) {
        super(food,location);
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("woof-woof");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    public String toString(){
        return super.toString() + " name: "
                    +this.name + " weight: "
                    +this.weight;
    }
}

