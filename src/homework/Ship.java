package homework;

//ля класу Ship – кількість пасажирів та порт приписки.
public class Ship extends Vehicle {
    private int passenger;
    private String port;

    public Ship(double coordinatesX, double coordinatesY, int price, int speed, int year, int passenger, String port) {
        super(coordinatesX, coordinatesY, price, speed, year);
        this.passenger = passenger;
        this.port = port;
    }

    @Override
    public String toString() {
        return super.toString() + ", passenger = " + passenger + ", port = " + port;
    }
}
