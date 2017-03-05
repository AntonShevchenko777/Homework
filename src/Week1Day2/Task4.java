package Week1Day2;

/**
 * Created by OlyaLevits on 05.03.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = Utils.genMatrix(6, 4, 5, 0);
        Utils.printMatrix(matrix);
        out:
        for (int i = 0; i < matrix.length; i++) {
            in:
            for (int j = 0; j < matrix[i].length; j++) {
                if ((matrix[i][j]) == 0) {
                    System.out.print(" \ni: " + i + " j: " + j);


                }
            }

        }
    }
}