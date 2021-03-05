package arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> integerList = performSprialTraverse(twoDArray);
        System.out.println(integerList);
    }

    private static List<Integer> performSprialTraverse(int[][] twoDArray) {
        int startCol = 0;
        int startRow = 0;
        int endCol = twoDArray[0].length - 1;
        int endRow = twoDArray.length - 1;
        List<Integer> integers = new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                integers.add(twoDArray[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                integers.add(twoDArray[i][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (endRow == startRow) break;
                integers.add(twoDArray[endRow][i]);
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (endCol == startCol) break;
                integers.add(twoDArray[i][startCol]);
            }
            startRow++;
            endCol--;
            endRow--;
            startCol++;
        }
        return integers;
    }
}
