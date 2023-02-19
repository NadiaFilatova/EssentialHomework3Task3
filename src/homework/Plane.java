package homework;

//// Для класу Plane має бути визначена висота та кількість пасажирів.
public class Plane extends Vehicle {
    private int passengers;
    private double height;

    public Plane(double coordinatesX, double coordinatesY, int price, int speed, int year, int passengers, double height) {
        super(coordinatesX, coordinatesY, price, speed, year);
        this.passengers = passengers;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengers = " + passengers + ", height = " + height;
    }
}
