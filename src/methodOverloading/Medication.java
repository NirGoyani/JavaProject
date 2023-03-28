package methodOverloading;

public class Medication {

    public static void medication(String pillName){
        System.out.println("You should take in the morning" + pillName);
    }

    public static void medication(String pillName1, String pillName2){
        System.out.println("One pill in the moring" + pillName1);
        System.out.println("Second pill in the night" + pillName2);
    }

    public static void medication(String pillName1, String pillName2, String pillName3){
        System.out.println("One pill in the moring" + pillName1);
        System.out.println("Second pill in the afternoon" + pillName2);
        System.out.println("Third pill in the night" + pillName3);
    }


    public static void main(String[] args) {
        medication("Parcetamol");
        medication("Parcetamol","Amocaline");
        medication("Parcetamol","Amocaline","Despirine");
    }
}
