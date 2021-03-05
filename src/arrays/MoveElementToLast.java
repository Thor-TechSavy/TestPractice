package arrays;

public class MoveElementToLast {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 2, 5};
        int elementToMove = 2;
        int[] modifiedArray = moveElementToLastInArray(array, elementToMove);
        System.out.println(modifiedArray);
    }

    public static int[] moveElementToLastInArray(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[right] == element) {
                right--;
            }
            if (array[left] == element) {
                swap(array, left, right);
            }
            left++;
        }
        return array;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array [right];
        array[right] = temp;
    }
}
