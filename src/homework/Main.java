package homework;

//Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1, 2, 1000, 500, 2022, 50, 20000);
        System.out.println(plane);

        Ship ship = new Ship(0, 0, 500, 400, 2000, 1000, "some port");
        System.out.println(ship);

        Car car = new Car(1, 1, 1000, 250, 2007);
        System.out.println(car);
    }
}
