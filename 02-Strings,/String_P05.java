//Remove Spaces from String

public class String_P05 {

    static String removeSpaces(String str) {
        return str.replace(" ", "");
    }
    public static void main(String[] args) {
        System.out.println(removeSpaces("Hello World Java"));
    }
}
