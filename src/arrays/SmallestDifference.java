package arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int[] array1 = {11, 0, 44, 5};
        int[] array2 = {1, 22, 4, 51, 2};
        int[] smallestDiffPair = findSmallestDiff(array1, array2);
        System.out.println(smallestDiffPair[0] + "  " + smallestDiffPair[1] );
    }

    //o(nlogn)T | o(1)s
    private static int[] findSmallestDiff(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);  // o(nlog n)
        int array1Idx = 0;
        int array2Idx = 0;
        int smallestDiff = Integer.MAX_VALUE;
        int currentDiff;
        int[] pair = new int[2];
        while (array1Idx < array1.length && array2Idx < array2.length) { //o(n)
            int firstNum = array1[array1Idx];
            int secondNum = array2[array2Idx];
            if (firstNum < secondNum) {
                currentDiff = secondNum - firstNum;
                array1Idx++;
            } else if (secondNum < firstNum) {
                currentDiff = firstNum - secondNum;
                array2Idx++;
            } else {
                return new int[] {firstNum, secondNum};
            }
            if (smallestDiff > currentDiff) {
                smallestDiff = currentDiff;
                pair = new int[]{firstNum, secondNum};
            }
        }
        return pair;
    }
}
