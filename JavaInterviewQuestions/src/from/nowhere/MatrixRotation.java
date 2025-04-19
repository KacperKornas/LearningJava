package from.nowhere;

import java.util.Scanner;
public class MatrixRotation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        int row = scan.nextInt();
        System.out.println("Podaj liczbę kolumn: ");
        int columns = scan.nextInt();

        int[][] matrix = new int[row][columns];

        System.out.println("Podaj wartość macierzy: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] rotatedMatrix = rotateMatrixClockwise(matrix);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(rotatedMatrix[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] rotateMatrixClockwise(int[][] matrix) {
        int row = matrix.length;
        int columns = matrix[0].length;
        int[][] rotatedMatrix = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedMatrix[j][row -1 -i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}