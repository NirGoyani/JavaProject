package arrayTopic;

public class FindOddNumber {

    public static void main(String[] args) {
        //Add all the value
        int[] arr = {1234,2341322,2343,123424,234,234123,234132,235}; // 15
        int sum = 0;

        for (int x : arr) {
            sum = sum + x;
        }

        System.out.println(sum);


    }
}
