public class ArrayMethod {

    //4! = 4 x 3 x 2 x 1 = ...
    //6! = 6 x 5 x 4 x 3 x 2 x 1...

    public static void factorial(int n){
        int result = 1;

        if(n>0){
            for(int i = 1; i <= n; i++){
                result = result * i;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        factorial(-10);
    }
}
