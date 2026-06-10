//Count Occurrences of Character

public class String_P04 {

    static int countChar(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target ) {
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        
        System.out.println(countChar("banana", 'a'));
    }
}
