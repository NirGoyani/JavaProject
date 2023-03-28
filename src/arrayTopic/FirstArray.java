package arrayTopic;

import controlStatement.LeapClass;

public class FirstArray {

    public static void main(String[] args) {
        // 100 variable same data
        //Array is the collection of the variable - same data type
        //Non-primitive - Array,String [Not fixed in size]
        //Snytax
        int a = 10 ;
        int b = 20 ;
        int c = 20 ;
        int d = 30 ;
        int e = 303223 ;

        int[] arr = {10,20,20,30,45,24,345,234,33};   //Array
        //Index      0  1  2  3  4  5  6   7   8   9
        //Length     1  2  3  4  5  6  7  8    9
        //Access
        //  [1,2,3]
        //  [4,5,6]
        //  [7,8,9]
        System.out.println(arr[2]);
        System.out.println(arr.length);

        //Operation
        arr[0] = 50;
        arr[1] = arr[0] / arr[3];
        //    80  =    50    +    30
        System.out.println(arr[1]);

        if(arr[0] > arr[3]){
            System.out.println("First position is bigger");
        }else {
            System.out.println("Third position is bigger");
        }
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
        //For - loop
        for(int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }




    }
}
