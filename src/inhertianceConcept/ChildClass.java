package inhertianceConcept;

public class ChildClass extends ParentClass{

    int b = 10;

    public void myMethod1(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
//       ParentClass parentClass = new ParentClass();
//       parentClass.myMethod();
//        System.out.println(parentClass.a);

//        ChildClass childClass = new ChildClass();
//        System.out.println(childClass.b);
//        childClass.myMethod1();


        ChildClass childClass = new ChildClass();
        System.out.println(childClass.a);   //This is from parent class
        System.out.println(childClass.b);
        childClass.myMethod();    //This is from parent class
        childClass.myMethod1();
        childClass.addition(10,20);    //This is in parent class
    }
}
