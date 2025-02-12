
import java.util.ArrayList;

class Session4{
    public static void main(String[] args) {

    //     int []arr = new int[5];

    //     try{
    //         // program to be handled 
    //         divide(10,5);

    //         System.out.println("Array at 4th index: "+arr[3]);

    //     }catch(Exception art){
    //         System.out.println(" Try checking denominator "+art);
    //     }finally{
    //         System.out.println("Inside finally block");
    //     }

    //    System.out.println("After divide");


    // ArrayLists
        ArrayList<Integer> ls = new ArrayList<>();

        // adding elements in arraylist 
        ls.add(34);  // 0
        ls.add(56);  // 1
        ls.add(23);  // 2

        // accessing arraylist elements
        System.out.println( ls.get(1) );

        // removing element from arraylist
        // ls.remove(2);
        // System.out.println( ls.get(1) );

        if( ls.contains(66) ){
            System.out.println("found 56");
        }else{
            System.out.println("Not found 56");
        }

        // accesing elements using for each
        System.out.println("Elements in arraylist are:");
        for(int ele : ls ){
            System.out.println(ele);
        }

    }

    public static void divide(int a, int b){
        int c = a/b;
        System.out.println("Ans: "+c);
    }
}