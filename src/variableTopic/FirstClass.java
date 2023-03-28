package variableTopic;

public class FirstClass {

    static int a = 10 ;  // No object
    int b = 20;         // Object creation

    public static void myMethod(){
        System.out.println("This is FirstClass");
    }

    public void myNonStaticMethod(){
        System.out.println("This is non static method");
    }

    public static void main(String[] args) {
        System.out.println(a);
        myMethod();

        FirstClass myFirtObj = new FirstClass();
        System.out.println(myFirtObj.b);
        myFirtObj.myNonStaticMethod();
    }
}
