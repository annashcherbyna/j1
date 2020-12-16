package hw_enum;

public class Clothes {
    private Sizes sizes;
    private double prise;
    private String color;

    public Clothes() {
    }

    public Clothes(Sizes sizes, double prise, String color) {
        this.sizes = sizes;
        this.prise = prise;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "sizes=" + sizes +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }
}
