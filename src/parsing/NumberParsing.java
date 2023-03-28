package parsing;

public class NumberParsing {

    public static void main(String[] args) {
        int a = 10;
        a = a + 13;
        System.out.println(a);

        double b = 10.00d;

        String x = Integer.toString(a);
        x = x + "abc";
        System.out.println(x);

        String y = Double.toString(b);
        y = y + "def";
        System.out.println(y);
    }
}
