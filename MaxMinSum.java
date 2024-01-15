import java.util.Arrays;

public class MaxMinSum {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1, 7, 6, 4};

        int max = findMax(array);
        int min = findMin(array);

        int sum = max + min;

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Sum of max and min: " + sum);
    }

    // Function to find the maximum element in an array
    public static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    // Function to find the minimum element in an array
    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];

        System.out.println("Hello");
    }
}
