// import java.util.Scanner;

class Session2 {

    static void hello(){
        System.out.println("in class session2");

    }
    public static void main(String[] args){


        
    // Scanner s1 = new Scanner(System.in);

    /* Operators in Java */

    // System.out.println("enter value of a");
    // int a=s1.nextInt();

    // System.out.println("enter value of b");
    // int b=s1.nextInt();
    //    System.out.println(a+b);
    //    System.out.println(a-b);

    //    System.out.println(a*b);

    //    System.out.println(a/b); //Q=1
    //    System.out.println(a%b); //R=10
    //  a++;
    //  System.out.println(a);
    //  b--;
    //  System.out.println(b);

    /* Relational and Logical Operators */

    //  if(a==b){
    //     System.out.println("a is equal to b");
    //  }
    //   if(a<b){
    //     System.out.println("a is less than b");
    //  }
    //   if(a>b){
    //     System.out.println("a is greater than b");
    //  }
    //   if(a!=b){
    //         System.out.println("a is not equal to b");
    //   }
    // if(a>b && a>50){
    //     System.out.println("a is greater than 50 and a is greater than b");
    // }
    // if(a>b || a>50){
    //     System.out.println("a is greater than 50 or a is greater than b");
    // }

    /*Assignment Operators */
    
    // a+=b; //a=a+b   a=25+5 a=30
    // System.out.println(a);

    // a-=b;  //a=a-b a=30-5 a=25
    // System.out.println(a);

    // a*=b;  //a=a*b a=25*5 a=125
    // System.out.println(a);

    // a/=b; // a=a/b a=125/5 a=25
    // System.out.println(a);

    // a%=b;  //a=a%b a=25%5 a=0
    // System.out.println(a);

    // a=b;
    // System.out.println(a);


    /*  Switch case  */

    // int day = sc.nextInt();  // 2

    // switch(day){
        
    //     case 1: System.out.println("Monday");
    //             break;
        
    //     case 2: System.out.println("Tuesday");
    //             break;

    //     // ...case n

    //     default:
    //     System.out.println("wrong input");
    // }

    //Switch case
    // System.out.println("Enter the number of the day");
    // String day=s1.nextLine();
    
    // switch(day) {

    //     case "Monday":
    //           System.out.println("Monday");
    //           break;

    //     case "Tuesday":
    //         System.out.println("Tuesday");
    //         break;
        
    //     case "Wednesday":
    //         System.out.println("wednesday");
    //         break;
        
    //     case "Thursday":
    //     System.out.println("Thursday");
    //     break;

    //     case "Friday":
    //     System.out.println("Saturday");
    //     break;

    //     case "Saturday":
    //     System.out.println("Saturday");
    //     break;

    //     case "Sunday":
    //     System.out.println("Sunday");
    //     break;

    //     default:
    //     System.out.println("Invalid Input");

    // }

    /*   Arrays   */

     //0-(length-1)
    // System.out.println("arrays length="+a.length);
    // System.out.println("Array's 5th index ="+a[4]);
 
    /* Array Declaration */
    // int a[]={1,2,15, 13,12,3,4,5,6,7,8,9,10};
    // for(int i=0;i<a.length;i++){
    //     //0 1 2 3 a[2] 
    //     System.out.println(i+" th element of array ="+ a[i]);
    // }


    /* array access using for each loop   */
    // for (int i : a) {
    //     System.out.println(" array element =" +i);
        
    // }

    /* Command line arguments */
    // System.out.println(args[0].toString()+" "+ args[1].toString());


    
    /* Strings in Java */

    // simple 
    // String str = "hello";
    // String h = "hello";

    // by using new keyword
    // String str2 = new String("here");
    // System.out.println(str);
    // System.out.println(str2);


    // String str = "hello";

    // String input 
    // String str2 = sc.nextLine();
    // System.out.println("str2: "+str2);


    /* String Methods */
    // System.out.println(str.charAt(3)+" \n"+ 
    // str.toUpperCase()+" "+
    // str.toLowerCase());

    // StringBuilder sb = new StringBuilder("hello there");
    // System.out.println("\nOriginal: "+sb);

    // sb.append(" here");
    // System.out.println("\n\n"+sb);

    // sb.replace(0, 4, "my");
    // System.out.println("\n\n"+sb);

    // sb.delete(0,2);
    // System.out.println("\n\n"+sb);

    /*Array Input */
    
    // int []a = new int[5];
    // // a[0] =2;
    // // a[1]=23;

    // // a[0] = sc.nextInt();

    // for(int i=0;i<a.length;i++){
    //     a[i] = sc.nextInt();
    // }

    // System.out.println("Array elements are: ");
    // for(int i: a){
    //     System.out.println(i);
    // }
        
    }
}