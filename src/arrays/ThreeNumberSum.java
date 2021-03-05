package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int targetSum = 9;
        threeNumberSum(array, targetSum);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array); //o(nlogn)
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    list.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    left = left + 1;
                } else {
                    right = right - 1;
                }
            }
        }
        return list;
    }
}

