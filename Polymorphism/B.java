package Polymorphism;

public class B extends A{
    @Override 
    void show(){
        System.out.println("Inside show of B class");
    }

    void print(){
        show();
        super.show();
    }
    public static void main(String[] args) {
        A a = new A();
        a.show();

        B b = new B();
        b.show();

        b.print();
    }
    
}
