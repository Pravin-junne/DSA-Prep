// Second largest element

public class Array_P05 {
    
    static int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Second Largest: "+secondLargest(arr));
        
    }
}
