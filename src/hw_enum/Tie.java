package hw_enum;

public class Tie extends Clothes implements ManClothes {
    public Tie(Sizes sizes, double prise, String color) {
        super(sizes, prise, color);
    }

    @Override
    public String toString() {
        return "Tie/" + super.toString();
    }
}
