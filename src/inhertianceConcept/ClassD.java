package inhertianceConcept;

public class ClassD extends ClassA{

    int d = 10;

    public void myMethodD(){
        System.out.println("this is class D");
    }

    public static void main(String[] args) {
        ClassD classD = new ClassD();
        System.out.println(classD.a);
        System.out.println(classD.d);
        classD.myMethodA();
        classD.myMethodD();
    }
}
