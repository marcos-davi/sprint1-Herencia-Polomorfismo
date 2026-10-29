package exercise2;

public class Car {
    final static String brand = "Toyota";
    static String model;
    final int power = 140;

    //mètode estàtic brake()
    static void brake() {
        System.out.println("El vehicle està frenant");
    }

    //mètode no estàtic accelerate()
    public void accelerate() {
        System.out.println("El vehicle està acelerant");
    }
}
