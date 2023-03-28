package nonAccessModifier;

public class ClassC {

    //Define the method
    //Parametized

    public static void printTheName(String name){
        System.out.println(name);
    }

    public static void sumTwoNumber(int a, int b){
        System.out.println(a+b);
    }

    public static void sumThreeNumber(int a, double b, int c){
        System.out.println(a);
    }

    public static void main(String[] args) {
        //Call
        printTheName("Nirav");
        //Dynamic
        sumTwoNumber(10,20);
        sumTwoNumber(20,50);
        sumTwoNumber(14,54);
        sumThreeNumber(13,14.00d,15);
        sumThreeNumber(14,346.00d,45762);

    }
}
