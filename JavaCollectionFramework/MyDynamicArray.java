package JavaCollectionFramework;

public class MyDynamicArray {
    private int[] arr;
    private int size;

    public MyDynamicArray(){
        arr = new int[5];
        size = 0;
    }

    public void add(int data){
        if(size == arr.length){
            System.out.println("Array is full so now creating new array with capacity " + (arr.length*2));
            int[] newArr = new int[arr.length * 2];
            // copy the old data to new array
            for(int i=0;i<size;i++){
                newArr[i] = arr[i];
            }
            //change the reference
            arr = newArr;
        }
        arr[size++] = data;
        
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("invalid index");
        }
        return arr[index];
    }
    public static void main(String[] args) {
        MyDynamicArray myarr = new MyDynamicArray();
        myarr.add(10);
        myarr.add(20);
        myarr.add(30); 
        myarr.add(20); 
        myarr.add(50); 

        myarr.display();

        myarr.add(60);
        myarr.display();
        System.out.println(myarr.get(5));

    }

}
