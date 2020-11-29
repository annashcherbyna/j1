package p2;

public class Cat  extends Animal{
    private double weight;
    private String name;

    public Cat(String food,String location,double weight, String name) {
        super(food,location);
        this.weight = weight;
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println("meow-meow");
    }

    @Override
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public String toString(){
        return super.toString() + " name: "
                +this.name + " weight: "
                +this.weight;
    }
}
