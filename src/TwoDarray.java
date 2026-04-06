import java.util.Arrays;

public class TwoDarray {

    public static void main (String [] args ) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] newMatrix = returnMatrix(matrix);
        System.out.println(Arrays.deepToString(newMatrix));

    }

    public static int[][] returnMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j]; // logic-based copy
            }
        }
        return result;
    }


}
