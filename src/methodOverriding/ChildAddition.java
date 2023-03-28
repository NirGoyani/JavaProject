package methodOverriding;

public class ChildAddition extends ParentAddition{

    public static void addition(float a, float b){
        float c = a+b;
        System.out.println(c);
    }

    public static void addition(int a, int b, int c, int d){
        int e = a + b + c + d;
        System.out.println(e);
    }

    public static void subtraction(int a, int b){
        System.out.println(a-b);
    }

    public static void subtraction(int a, int b, int c){
        System.out.println(a-b-c);
    }

    public static void main(String[] args) {
        addition(10.00f,20.20f);
        addition(10,20,30,40);
    }

}
