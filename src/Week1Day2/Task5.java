package Week1Day2;


import java.util.Scanner;

/**
 * Created by OlyaLevits on 05.03.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array size:");
        int arrSize = scanner.nextInt();

        int[] values = new int[arrSize];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Please enter value #" + i);
            values[i] = scanner.nextInt();
        }
        Utils.printArray(values);
        System.out.println("\nPlease enter value for search:");
        int valueForSearch = scanner.nextInt();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == valueForSearch) {
                System.out.println("Value " + valueForSearch + " on index " + i);
                break;
            }
            if (i == values.length - 1) {
                System.out.println("Value not found");
            }

        }


    }
}
