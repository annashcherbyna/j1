package hw_enum;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Sizes sizes, double prise, String color) {
        super(sizes, prise, color);
    }

    @Override
    public String toString() {
        return "Pants/" + super.toString();
    }
}
