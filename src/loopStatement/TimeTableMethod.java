package loopStatement;

public class TimeTableMethod {
    //I want to create the method which can calculate the time table
    // 9 x 1 = 9
    public static void timeTable(int tableNumber){
        System.out.println("This is my timeTable of " + tableNumber);
        System.out.println("=========================================");

        for(int i = 1 ; i <=10 ; i++){
            System.out.println(tableNumber + " X " + i + " = " + tableNumber * i);
        }

        System.out.println("=========================================");

    }

    //1 + 2 + 3 + 4 ....+ 99 + 100 == .....


    public static void main(String[] args) {
       timeTable(4);

    }
}
