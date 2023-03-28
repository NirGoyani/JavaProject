package inhertianceConcept;

public class ClassC extends ClassB{

    int c = 10;

    public void myMethodC(){
        System.out.println("this is class C");
    }

    public static void main(String[] args) {
        ClassC classC = new ClassC();
        System.out.println(classC.a);
        System.out.println(classC.b);
        System.out.println(classC.c);
        classC.myMethodA();
        classC.myMethodB();
        classC.myMethodC();
    }
}
