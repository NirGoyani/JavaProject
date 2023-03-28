package methodOverriding;

public class London extends Uk {

    public void taxes(){
        System.out.println("25%");
    }

    public static void main(String[] args) {
        London classB = new London();
        classB.taxes();
    }
}
