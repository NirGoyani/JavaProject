package nonAccessModifier;

public class Calculator {

    int a = 30;

    //Addition
    public int addition(int a, int b, int c){
        int d = a + b + c;
        return d;
    }

    //Subraction
    public int subtraction(int a, int b, int c){
        int d = a - b - c ;
        return d;
    }

    //Multiplication
    public int multipliction(int a, int b, int c){
        int d = a * b * c;
        return d;
    }

    //Division
    public double division(double a, double b){
        double c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(10,20,30));
        System.out.println(calculator.addition(302342,20234,542342));

        System.out.println(calculator.subtraction(30,20,10));
        System.out.println(calculator.multipliction(5,4,3));
        System.out.println(calculator.division(10.32d,20.43d));

        System.out.println(calculator.a);
    }

}
