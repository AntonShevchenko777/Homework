package Week1Day2;

/**
 * Created by OlyaLevits on 05.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 5},
                {3, 5, 7, 2},
                {13,54,656,34,12},
                {2, 3}

        };
        Utils.printMatrix(matrix);
        System.out.print(matrix[0][4]);
    }
}
