import java.util.*;
public class BubbleSortExample {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Sorting the array using Bubble Sort
        bubbleSort(numbers);

        // Displaying the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
