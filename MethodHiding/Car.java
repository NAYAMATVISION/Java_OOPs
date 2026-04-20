package MethodHiding;

public class Car extends Vehicle {
    void display(){
        System.out.println("Car started");
    }
    public static void main(String[] args) {
        // Vehicle.display();
        // Car.display();
        Vehicle v1 = new Car();
        v1.display();
    }
}
