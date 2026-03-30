package Practice;
public class Item{
        String itemName;
        int quantity;
        double price;

        Item(String itemName , int quantity , double price){
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;

        }
        double calculateTotalValue(){
            return quantity*price;
        }
        void display(){

            System.out.println("Item name is : "+itemName);
            System.out.println("Price is : "+price);
            System.out.println("Total Value :" + calculateTotalValue() );
            System.out.println("----------------------------------");
        
        }


    


    
    
    public static void main(String[] args) {
        Item i1 = new Item("Laptop" , 5 , 60000);
        i1.display();
        Item i2 = new Item("book", 4, 250);
        i2.display();
    }
}
