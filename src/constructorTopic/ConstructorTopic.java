package constructorTopic;

public class ConstructorTopic {
    //Constructor -- block of statement, name of the class, When we create object this constructor is called (automatically call)
                     //no return, paramterized Constructor, Why?? -- object - inatilized
    //Method -- block of statement, choose your name, we have to manually call that method.
                    //we can return, parametrized method

    int b;
    public int myMethod(int a, int b){
        int c = 10 ;
        return a;
    }
    public ConstructorTopic(){
        //Default Constrcutor
        System.out.println("This is calling constructor automatically");
    }
    public ConstructorTopic(int a){
        b = a;
        System.out.println(a + "Constructor is called");
    }

    public static void main(String[] args) {
      //Object
        ConstructorTopic constructorTopic1 = new ConstructorTopic(20);
        System.out.println(constructorTopic1.myMethod(10,20));

        ConstructorTopic constructorTopic2 = new ConstructorTopic(30);

    }
}
