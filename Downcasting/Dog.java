package Downcasting;

public class Dog extends Animal {
    @Override
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("Barking");
    }
}
