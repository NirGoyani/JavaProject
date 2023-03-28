package loopStatement;

public class SumNumber {
    //1 + 2 + 3 + ..100 = sum

    public static void main(String[] args) {
        int sum = 0; //21

        for (int i = 1; i<=100 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
