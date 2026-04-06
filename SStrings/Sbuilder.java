package SStrings;
public class Sbuilder {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("tonu");
         System.out.println(sb);

        //  System.out.println(sb.charAt(3));

        //  //set char at index
        //  sb.setCharAt(0,'P');
        //  System.out.println(sb);

        //     //insert char at index
        //     sb.insert(2,'y');
        //     System.out.println(sb);

        //     sb.append("h");
        //     System.out.println(sb.length());
        for(int i=0;i<sb.length()/2;i++){
            char Front = sb.charAt(i) ;
            char Back = sb.charAt(sb.length()-1-i);

            sb.setCharAt(i, Back);
            sb.setCharAt(sb.length()-1-i, Front);

        }
        System.out.println(sb);


    }
   
}