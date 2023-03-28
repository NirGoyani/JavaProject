package inheritanceConceptExample;

public class Doberman extends Dog{

    public void eating(){
        System.out.println("This is fastest dog to eat");
    }

    public static void main(String[] args) {
        Doberman doberman = new Doberman();
        doberman.barking();
    }
}
