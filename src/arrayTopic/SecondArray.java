package arrayTopic;

public class SecondArray {
    public static void main(String[] args) {
        String car1 = "Volvo";
        String car2 = "Mercedez";
        String car3 = "Lamborghini";
        String car4 = "Range Rover";

        String[] arrCars = {"Volvo","Mercedez","Lamborghini","Range Rover","Kia"};
        //Index               0          1          2           3            4

        int myArraylength = arrCars.length;  // 5
        System.out.println(myArraylength);

        //To print all car name
        for(int i=0; i<myArraylength; i++){
            System.out.println(arrCars[i]);
        }

        //To print all car in reverse order
        for(int i=myArraylength-1 ; i>=0 ; i--){
            System.out.println(arrCars[i]);
        }

        //name.length()   -- String - method
        //arr.length     --- Array - varibale
    }
}
