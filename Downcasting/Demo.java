package Downcasting;

public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        // a.bark(); error 
        //downcasting
        Dog d = (Dog)a;
        d.bark();
        
    }
}
