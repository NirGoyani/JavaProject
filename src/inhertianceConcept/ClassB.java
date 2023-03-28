package inhertianceConcept;

public class ClassB extends ClassA {

    int b = 10;

    public void myMethodB(){
        System.out.println("this is class B");
    }

    ClassB(){
        System.out.println("This is class B constructor");
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        System.out.println(classB.a);
        System.out.println(classB.b);
        classB.myMethodA();
        classB.myMethodB();
    }

}
