package construct;

public class Chaining {
    int x;
    int y;

    Chaining(){
        this(20);
        System.out.println("0 argument constructor");
    }
    Chaining(int x){
        
        this(10,20);
        System.out.println("1 argument constructor");
    }
    Chaining(int x , int y){
        this("hello");
        System.out.println("2 argument constructor");
    }
    Chaining(String name){
        System.out.println("string argument constructor");
    }
    void display(){
        System.out.println("inside display");
    }
public static void main(String[] args) {
    Chaining c1 = new Chaining();
    c1.display();
}
    
}
