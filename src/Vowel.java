public class Vowel {
    String newText = "Hello, Good Morning abc!";

    void Vowel(String inputText) {
        String lowerCaseText = inputText.toLowerCase();     // converted input text into lowercase
        char[] vowelList = {'a', 'e', 'i', 'o', 'u'};           // defined & initialised array of vowel
        int i;
        int vowel = 0;
        int consonant = 0;
        for (i = 0; i < lowerCaseText.length(); i++) {
            for (char eachLetter : vowelList) {
                if (lowerCaseText.charAt(i) == eachLetter) {
                    System.out.println("Index " + i + " is a vowel " + lowerCaseText.charAt(i));
                    vowel++;
                }
            }
            if ((lowerCaseText.charAt(i) != ' ')) {
                consonant++;
            }
        }
        System.out.println("Total number of indexes in this String are " + (i - 1));
        System.out.println("No of Vowels: " + vowel);
        System.out.println("No of Consonants: " + consonant);
    }

    public static void main(String[] args) {
        Vowel Vowel = new Vowel();
        Vowel.Vowel(Vowel.newText);
    }
}
