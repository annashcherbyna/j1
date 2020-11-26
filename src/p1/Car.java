package p1;

public class Car {
    private String model;
    private String brand;
    private double power;
    private double engineCap;
    private int year;
    private String color;

    public Car() {
    }

    public Car(String model, String brand, double power, double engineCap, int year, String color) {
        this.model = model;
        this.brand = brand;
        this.power = power;
        this.engineCap = engineCap;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", engineCap=" + engineCap +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
