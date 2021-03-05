package arrays;

public class validateSequence {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5};
        int[] sequence = {2, 4, 5};
        boolean flag = isSubSequence(array, sequence);
        System.out.println(flag);
    }

    private static boolean isSubSequence(int[] array, int[] sequence) {
        int idx = 0;
        for (int value : array) {
            if (idx == sequence.length) {
                break;
            }
            if (sequence[idx] == value) {
                idx++;
            }
        }
        return idx == sequence.length;
    }
}
