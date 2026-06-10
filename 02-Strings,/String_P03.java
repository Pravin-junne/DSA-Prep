//Count Vowels and Consonants

public class String_P03 {

    static void count(String str) {

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase(); //convert char in lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }

        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }

    public static void main(String[] args) {
        
        count("Hello world"); //calling
    }
}
