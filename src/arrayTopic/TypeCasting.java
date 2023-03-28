package arrayTopic;

public class TypeCasting {

    public static void main(String[] args) {
        byte a = 10;
        long b =  a; //Widening Cast automat

        short z = 154;
        byte f = (byte) z;     //Narrow casting manually

        System.out.println(f);

        long abc = 21423214;
        int xyz = (int) abc;  //Narrow casting

        int one = 102 ;
        int two = 1032 ;
        float c = (float) one /two ;
        System.out.println(c);



    }
}
