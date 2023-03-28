package arrayTopic;

public class OddEvenNumber {

    public static void findEvenNumber(int[] numbers){

        for (int number: numbers) {
            if(number%2==0){
                System.out.println("It is Even number" + number);
            }
        }
    }

    public static void findOddNumber(int[] numbers){

        for (int number: numbers) {
            if(number%2!=0){
                System.out.println("It is Odd number" + number);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        findEvenNumber(numbers);
        findOddNumber(numbers);

    }
}
