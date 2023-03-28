package methodOverloading;

public class MethodOverloading {
    //Overloading -- insert the thing
    //In class having method with same name with different paramter and datatype
    public void addition(){
        int a =10;
        int b = 20;
        int c = a+b;
        System.out.println(c);
    }
    public static void addition(int a, int b){
        System.out.println(a+b);
    }

    public static void addition(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void addition(String a,String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.addition();
        addition(12,14);
        addition(14,15,16);
        addition("Nirav","Goyani");
    }

}
