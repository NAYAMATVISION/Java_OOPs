package Arrays;

public class Student {
    int rollNo;
    String name;

    Student(int r , String n){
        rollNo = r;
        name = n;
    }

    void displayInfo(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(10 , "nayu");
        students[1] = new Student(20 , "nayu2");
        students[2] = new Student(30 , "nayu3");

        for(Student s : students){
            s.displayInfo();
        }
    }
}
