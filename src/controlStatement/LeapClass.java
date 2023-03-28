package controlStatement;

public class LeapClass {
    //2000 - leap , 2004, 2008, 2012, 2016, 2020 - 4  == 0
    //2001 /4
    public static void checkLeapyear(int year){
        if(year > 0 ){
            if( (year%4==0 && year%100!=0) || year%400==0){
                //  (true  && true)        || true
                //       true              || true
                //    true
                System.out.println("It is a leap year");
            }
            else {
                System.out.println("It is not leap year");
            }
        }
        else {
            System.out.println("Please enter the correct year");
        }

    }

    public static void main(String[] args) {
        //4 - 2000 2004 2008
        //2100  - leap 4  -- 100
        //2400  -- 4 100   -- 400
        checkLeapyear(4);
        checkLeapyear(2000);
        checkLeapyear(2001);
        checkLeapyear(1900);
        checkLeapyear(2400);
    }
}
