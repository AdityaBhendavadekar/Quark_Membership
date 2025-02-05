




public class Session3 extends Session2{
 int x = 10;    
  
    void display(){
       hello();
       System.out.println("in class session 3");
    }

    // void checking(){

    //    System.out.println(a+" in function checking ");
    // }
    public static void main(String[] args) {
        Session3 s = new Session3();
       
     
        s.display();

        Session1 obj=new Session1();
       obj.handle();
        // s.checking();
    }
}
