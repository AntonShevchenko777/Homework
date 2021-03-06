package Week1Day2;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Utils {
    public static int[] generateArray(int size, int maxValue) {

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ((int) (Math.random() * maxValue));
        }
        return arr;

    }

    public static int[] generateArray(int size, int startPoint, int endPoint) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (endPoint - startPoint) + startPoint);
        }
        return arr;


    }

    public static void printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += (i != arr.length - 1) ?
                    arr[i] + ", " :
                    arr[i] + "]";


       /* for (int i =0;i<arr.length; i++){
            result += arr[i]+ ",";
        }
    result +="]";*/

        }
        System.out.print(result);
    }

    public static int[][] genMatrix(int lines, int rows, int max, int min) {
        int result[][] = new int[lines][rows];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * (max + 1 - min) + min);

            }
        }


        return result;


    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}

