public class Main {
    public static void main(String[] args) {
        Car car1=new Car ("universal", "black", "back",100, 60 );
        Car car2=new Car("hatchback", "red", "allwheeldrive",120, 70);
        Car car3=new Car("sedan","yellow","front", 120,60);

        car2.addSpeed();
        car3.removefuel();
    }

 }
