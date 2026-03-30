package Practice;

public class SmartDevice {
    String name;
    String type;
    boolean isOn;

    SmartDevice(String name , String type , boolean isOn){
        this.name = name;
        this.type = type;
        this.isOn = isOn;
    }
    boolean turnOn(){
        isOn = true;
        return isOn;
    }
    boolean turnOff(){
        isOn = false;
        return isOn;
    }
    void display(){
        System.out.println("Device : "+name);
        System.out.println("Type : "+type);
        System.out.println("Status : "+isOn );
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        SmartDevice s1 = new SmartDevice("Light","LED", false);
        s1.turnOn();
        s1.display();
        s1.turnOff();
        s1.display();
    }
}
