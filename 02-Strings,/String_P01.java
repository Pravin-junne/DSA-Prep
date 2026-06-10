//Reverse a string

public class String_P01 {
    
    //func to reverse a string
    static String reverse(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String str = "Pravin";
        System.out.println(reverse(str));
    }
}
