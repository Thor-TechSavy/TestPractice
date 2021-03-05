public class Car {
    static class Wheel {
        final int a = 10;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Wheel myCarWheel = new Car.Wheel();
        System.out.println(myCarWheel.a);
    }
}
