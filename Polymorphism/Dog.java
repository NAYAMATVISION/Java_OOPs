package Polymorphism;

public class Dog  extends Animal{
    Dog(String name){
        super(name);
        System.out.println("Dog is created with " + name );

    }
    void display(){
        System.out.println("hi everyone");
    }
}
