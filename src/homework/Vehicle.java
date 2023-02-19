package homework;

//Використовуючи IntelliJ IDEA, створіть проект.
// Потрібно: Створити клас Vehicle. У тілі класу створіть поля: координати та параметри суден
// (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
// Для класу Plane має бути визначена висота та кількість пасажирів.
// Для класу Ship – кількість пасажирів та порт приписки.
// Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
public abstract class Vehicle {
    public double coordinatesX;
    public double coordinatesY;
    public int price;
    public int speed;
    public int year;

    public Vehicle(double coordinatesX, double coordinatesY, int price, int speed, int year) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "coordinatesX = " + coordinatesX + ", coordinatesY = " + coordinatesY + ", price = " + price + ", speed = " + speed + ", year = " + year;
    }
}
