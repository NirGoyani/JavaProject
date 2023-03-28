package controlStatement;

public class OysterCard {

    public static final int MINIMUM_BALANCE = 10;

    public static void checkOysterCard(int myBalance){
        if(myBalance >= MINIMUM_BALANCE){
            System.out.println("Gate is open");
        }else {
            System.out.println("You dont hve enough balance please top up");
        }
    }


    public static void main(String[] args) {
         checkOysterCard(300);

    }
}
