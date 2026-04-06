import java.util.Arrays;

public class TwoDArrayExample {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Before processing:");
        System.out.println(Arrays.deepToString(matrix));

        int[][] result = processMatrix(matrix);

        System.out.println("After processing:");
        System.out.println(Arrays.deepToString(result));
    }

    // This method modifies and returns the SAME array
    public static int[][] processMatrix(int[][] matrix) {

        // Traverse the matrix
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns

                // LOGIC: modify each element
                matrix[i][j] = matrix[i][j] * 2;
            }
        }

        // Return the same array reference
        return matrix;
    }
}

