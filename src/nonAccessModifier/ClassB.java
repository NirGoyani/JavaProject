package nonAccessModifier;

public class ClassB {

    //Return type
    public int multiTwoNumber(){
        int a = 5 ;
        int b = 10;
        int c = a * b ;    //Local
        return c;
    }

    public static void multiplication(){
        int a = 20;
        int b = 20;
        int c = a * b;
        System.out.println(c);
    }
    public double divisionTwoNumber(){
        double a = 10.00d;
        double b = 3.00d;
        double c = a/b;
        return c;
    }


    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(classB.multiTwoNumber());

        System.out.println(classB.divisionTwoNumber());
    }
}
