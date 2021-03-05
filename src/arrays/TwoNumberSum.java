package arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int targetSum = 5;
        int[] pair = twoNumberSum(array, targetSum);
        System.out.println(pair[0] +  "=====" + pair[1]);
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> integers1 = twoNumberSumInArrayList(integers, targetSum);
        System.out.println(integers1.get(0) + "=========" + integers1.get(1));
    }

    //o(nlogn)T o(1)S
    private static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array); //o(nlogn)T
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        while (leftPointer < rightPointer) { //o(n)
            int currentSum = array[leftPointer] + array[rightPointer];
            if (currentSum > targetSum) {
                rightPointer--;
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                return new int[] {array[leftPointer], array[rightPointer]};
            }
        }
        return new int[0]; //empty array
    }

    //o(nlogn)T o(1)S
    private static List<Integer> twoNumberSumInArrayList(List<Integer> list, int targetSum) {
        Collections.sort(list);
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while (leftPointer < rightPointer) { //o(n)
            int currentSum = list.get(leftPointer) + list.get(rightPointer);
            if (currentSum > targetSum) {
                rightPointer--;
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                return Arrays.asList(list.get(leftPointer), list.get(rightPointer));
            }
        }
        return Collections.emptyList(); //empty arrayList
    }
}
