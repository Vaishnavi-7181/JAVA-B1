class Super{
    int speed = 60;
}

class Car extends Vehicle {
    int speed = 100;

    void showSpeed() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed); // accessing parent speed
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.showSpeed();
    }
}
