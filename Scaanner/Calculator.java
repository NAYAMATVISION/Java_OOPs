package Scaanner;
import java.util.Scanner;

public class Calculator {
    double add(double a  ,double b){
        return a+b;
    }
    double subtract(double a , double b){
        return a-b;

    }
    double multiply(double a , double b){
        return b*a;

    }
    double divide(double a , double b){
        return a/b;
    }

    public static void main(String[] args) {
        Calculator c1= new Calculator();
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("1 for addition");
        // System.out.println("2 for subtraction");
        // System.out.println("3 for multiplication");
        // System.out.println("4 for divide");
        // System.out.println("5 for exit");
        // System.out.println("------------------------");
        while(true){
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for divide");
        System.out.println("5 for exit");
        System.out.println("------------------------");
           
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
             if(choice == 5){
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter two numbers");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            if(choice == 1){
                System.out.println(c1.add(n1,n2));
            }
            else if(choice == 2){
                System.out.println(c1.subtract(n1,n2));
            }
            else if(choice == 3){
                System.out.println(c1.multiply(n1,n2));
            }
            else if(choice == 4){
                System.out.println(c1.divide(n1,n2));
            }
            else{
                System.out.println("invalid choice");
            }
           


        }
        sc.close();
    }
}
// do not hasNext for user interactions 
// it is used for file reading and other input stream reading where we are not sure about the end of the input stream.