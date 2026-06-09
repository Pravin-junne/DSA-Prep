
//Find smallest element

public class Array_P02 {

    static int findSmallest(int[] arr) {
        int min = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};

        System.out.println("Smallest: "+findSmallest(arr));
    }
    
}
