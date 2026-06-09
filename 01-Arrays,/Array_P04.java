//Sum of Array

public class Array_P04 {
    
    static int getSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Sum: "+getSum(arr));
    }
}
