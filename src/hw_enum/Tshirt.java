package hw_enum;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{
    public Tshirt(Sizes sizes, double prise, String color) {
        super(sizes, prise, color);
    }
    @Override
    public String toString() {
        return "Tshirt/"+ super.toString();
    }
}
