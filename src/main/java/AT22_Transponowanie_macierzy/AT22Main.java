package AT22_Transponowanie_macierzy;

import java.util.Arrays;
import java.util.Random;

public class AT22Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][3];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        MatrixTranspose.printMatrix(matrix);
        System.out.println();
        MatrixTranspose.printMatrix(MatrixTranspose.transpose(matrix));
    }
}
