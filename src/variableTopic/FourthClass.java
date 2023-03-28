package variableTopic;

public class FourthClass {

    public static void main(String[] args) {
        //Access 'a' varibale here from firstclass
        //Static  -- no object
        //Non satic  -- Object

        System.out.println(FirstClass.a);
        FirstClass.myMethod();            //Static from FirstClass

        FirstClass firstClass = new FirstClass();
        System.out.println(firstClass.b);
        firstClass.myNonStaticMethod();    //Non static from FirstClass

    }

}
