package Week1Day2;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 26.02.2017.
 */
public class Intro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value");
        int value1 = scanner.nextInt();
        System.out.println("Please enter second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter operation type");
        String operationType = scanner.nextLine();
        float result = doOperation(value1, value2, operationType);
        System.out.println(result);

    }

    public static float doOperation(int x, int y, String operationType) {

        if (operationType.equals("+")) {
            return x + y;

        }
        if (operationType.equals("-")) {
            return x - y;
        }
        if (operationType.equals("*")) {
            return x * y;
        }
        if (operationType.equals("/")) {
            return x / y;
        }
        System.out.println("Wrong operation type");
        return 0;
    }


}
