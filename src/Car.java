public class Car {
    String body = "sedan";
    String color = "red";
    String gearType = "front";

    int speed = 120;
    int fuelLevel = 40;
    boolean carIsMoving;

    public Car(String body, String color, String gearType, int speed, int fuelLevel) {
        this.body = body;
        this.color = color;
        this.gearType = gearType;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    public void addSpeed() {
        speed = speed + 10;
    }

    public void removefuel() {
        fuelLevel = fuelLevel - 10;
    }
}
