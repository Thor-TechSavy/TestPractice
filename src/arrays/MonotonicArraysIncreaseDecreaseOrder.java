package arrays;

public class MonotonicArraysIncreaseDecreaseOrder {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5, 6};
        boolean isMonotonic = isMonotonic(array);
        System.out.println(isMonotonic);
    }

    private static boolean isMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                isIncreasing = false;
            } else if (array[i] > array[i-1]) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
