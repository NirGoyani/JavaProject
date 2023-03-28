package nonAccessModifier;

public class ClassA {

    //pre define - println,
    //User define method
    //Defining
    //Simple Method / Void method - no return
    //Return Method - returning some value
    //Parmeterized Method - parmetrized the value
    public static void printMyName(){
        //Logic
        System.out.println("Nirav");
    }

    public static void sumTwoNumber(){
        int a = 10;  //Local
        int b = 20;  //Local
        System.out.println(a+b);
    }

    //return type method
    public static String printMyAddress(){
        String myAddress = "WD196TL";   //Local
        return myAddress;
    }

    public static int subTwoNumber(){
        int a = 10;
        int b = 5 ;
        int c = a-b;  //5
        return c;
    }


    public static void main(String[] args) {
        //Call
        printMyName();
        sumTwoNumber();
        String niravAddress = printMyAddress();
        System.out.println(niravAddress);
        System.out.println(subTwoNumber());
    }



}
