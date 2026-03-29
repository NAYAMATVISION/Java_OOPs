package construct;

public class Cverloading {
    String name ;
    int age;
    Cverloading(){
        name = "nayamat";
        age = 19;


    }

    Cverloading(String name , int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Cverloading c1 = new Cverloading();
        c1.display();
        Cverloading c2 = new Cverloading("krishie" , 20);
        c2.display();
    }
}
