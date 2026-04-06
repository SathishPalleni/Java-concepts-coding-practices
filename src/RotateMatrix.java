import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Before rotation: " + Arrays.deepToString(matrix));

        rotate(matrix);

        System.out.println("After rotation: " + Arrays.deepToString(matrix));

        System.out.println(Arrays.deepToString(matrix));
    }

    // Rotate 90 degrees clockwise (IN-PLACE)
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        System.out.println("rotate method called");


        // STEP 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // STEP 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

