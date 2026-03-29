package construct;

public class First {
    First(){
        System.out.println("This is constructor");
    }
    void display(){
        System.out.println("hi");
}
    public static void main(String[] args) {
        First f1 = new First();
        f1.display();

    }
}
