package nonAccessModifier;

public class TopicOfString {

    public static void main(String[] args) {
//         char ch = '2';

        String name = "this";   //reverse
        //StringBuffer
        //    01234567891011
        String bigWord = "I am good teacher";
        System.out.println(name.length());
        System.out.println(bigWord.length());
        System.out.println(bigWord.isEmpty());
        System.out.println(name.toLowerCase());

        System.out.println(name.concat(bigWord));

        System.out.println(name.contains("bad"));

        System.out.println(name.trim());
        System.out.println(name.replace("good", "bad"));

        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println(stringBuffer.reverse());



        //Another process is using for loop -- we will learn

    }
}
