package nonAccessModifier;

public class ClassD {

    public static int sumTwoNumbers(int a, int b){
        int c = a + b ;
        return c;
    }

    public int countBalance(int withdraw, int balance ){
        balance = balance - withdraw;
        return balance;
    }

    public static boolean checkSufficientBalance(int withDraw, int balance){
        boolean checkBalance = balance >= withDraw;
        return checkBalance;
    }



    public static void main(String[] args) {

        ClassD classD = new ClassD();
        classD.countBalance(100,5000);
        System.out.println("Can you pass the amount, and you are able to withdrw or not");
        System.out.println(checkSufficientBalance(150,100));
        System.out.println(checkSufficientBalance(120,500));
    }
}
