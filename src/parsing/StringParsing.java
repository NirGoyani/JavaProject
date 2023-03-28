package parsing;

public class StringParsing {

    public static void main(String[] args) {
        String x = "123";  //convert into int
        x = x + 20;    //12320

        int a = Integer.parseInt(x);
        a = a + 20;   //12320 + 20 = 12340
        System.out.println(x);
        System.out.println(a);

        double b = Double.parseDouble(x);  //12320.0
        System.out.println(b);




    }
}
