//Largest Element in Array

public class Array_P01 {

    //find larg element in array
    static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        //array
        int[] arr = {3, 5, 1, 9, 2};

        int result = findLargest(arr);
        
        System.out.println("Largest: "+result);
    }    
}
