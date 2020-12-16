package hw_enum;

public class Dress extends Clothes implements WomenClothes{
    public Dress(Sizes sizes, double prise, String color) {
        super(sizes, prise, color);
    }

    @Override
    public String toString() {
        return "Dress/" + super.toString();
    }
}
