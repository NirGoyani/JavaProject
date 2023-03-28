package loopStatement;

public class DoWhileLoop {
    //while (condition){....}   --  check condition and then execute (Entry control)
    //do{....} while(condition)  -- first execute and then check condition (Exit control)

    public static void main(String[] args) {
       //print 1 - 10
        int number = 10;  //starting

        do{
            System.out.println(number);
            number--;      //increment
        }while (number >= 110);  // stop


    }
}
