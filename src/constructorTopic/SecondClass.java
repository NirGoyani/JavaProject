package constructorTopic;

public class SecondClass {

    public SecondClass(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass(20);
    }
}
