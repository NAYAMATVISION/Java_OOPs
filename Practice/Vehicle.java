package Practice;

public class Vehicle {
    String brand;
    String model;
    int year;
    String registerationNumber;

    Vehicle(){
        this("Unknown-brand" , "Unknown-model",2023 ,"Unknown-reg");

    }
     Vehicle(String brand){    
        this(brand , "unknown-model" , 2023 , "Unknown-reg");
     

    }
      Vehicle(String brand , String model){
        this(brand , model , 2015 , "Unknown-reg");

    }
      Vehicle(String brand , String model , int year , String registerationNumber){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.registerationNumber = registerationNumber;

    }
  void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Registration: " + registerationNumber);
        System.out.println("----------------------");
    }


    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Toyota");
        Vehicle v3 = new Vehicle("Honda", "Civic");
        Vehicle v4 = new Vehicle("Ford", "Mustang", 2020, "ABC123");
        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
        v4.displayInfo();
    }
}
