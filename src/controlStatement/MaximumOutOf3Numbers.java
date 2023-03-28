package controlStatement;

public class MaximumOutOf3Numbers {

    public static void checkMaxNumber(int a, int b, int c){
        if(a!=b && a!=c && b!=c){
            if(a>b && a>c){
                System.out.println(a + " is bigger number");
            } else if (b>a && b>c) {
                System.out.println(b + " is bigger number");
            }else {
                System.out.println(c + " is bigger number");
            }
        }else {
            System.out.println("Numbers are same");
        }

    }

    public static void main(String[] args) {
        // a , b , c
        // a > b,c
        // b > a,c
        // c > a,b
        checkMaxNumber(12,30,30);
        checkMaxNumber(30,30,12);
        checkMaxNumber(31,32,33);
    }
}
