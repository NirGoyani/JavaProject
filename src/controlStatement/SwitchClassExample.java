package controlStatement;

public class SwitchClassExample {

    public static void checkBalance(){
        ///......
        //...
    }

    public static void withdraw(int amount){
        //...
        //..
    }

    public static void changePinNumber(){
        //..
        //..
    }
    public static void main(String[] args) {
        //Do you need bag
        //1-7  == Print the weekdays name  1 - Monday , 2 - tuesday, 7- Sunday
       //chrome safari firefox edge
        //Months name 1-12  --- Januaray ,feb ,march......
        //ATM
        //1 - Checkbalance
        //2 - withdraw
        //3 - change pin number
        //4 - exit

        int choice = 3;

        switch (choice){
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw(200);
                break;
            case 3:
                changePinNumber();
                break;
            default:
                System.out.println("Tata bye bye");
        }

    }
}
