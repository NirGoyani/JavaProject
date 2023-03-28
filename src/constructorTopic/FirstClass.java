package constructorTopic;

public class FirstClass {

    public FirstClass(){
        int a = 20;
        System.out.println(a);
    }

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass(10);
    }

}
