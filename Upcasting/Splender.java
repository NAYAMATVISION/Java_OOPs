package Upcasting;

public class Splender extends Bike {
    @Override
    void run(){
        System.out.println("Spendor is running fast");
    }
    public static void main(String[] args) {
        Bike b1 = new Splender();
        b1.run();
    }
}
