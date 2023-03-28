package controlStatement;

public class OddEvenNumber {

    public static void checkEvenOrOddNumber(int number){
        if (number%2==0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }

    }

    public static void main(String[] args) {
        //2,4,6,8,10 -- even  == 0
        //1,3,5,7,9 -- odd

        checkEvenOrOddNumber(10);
        checkEvenOrOddNumber(13);

    }
}
