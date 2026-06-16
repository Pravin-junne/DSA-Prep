
//Bubble sort algo


public class BubbleSort {
    
    //bubble sort function
    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {

            for (int j = 0; j < n-i-1; j++) {

                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //array display function
    public static void printArr(int arr[]) {
        for (int num: arr) {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting:");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("After sorting:");
        printArr(arr);
        
    }
}
