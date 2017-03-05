package Week1Day2;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 26.02.2017.
 */
public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value");
        int value1 = scanner.nextInt();
        System.out.println("Please enter second value");
        int value2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter operation type");
        String operationType = scanner.nextLine();
        float result = doOperationbySwitch(value1, value2, operationType);
        System.out.println(value1 + operationType + value2  + " = " + result);


    }

    public static float doOperationbySwitch(float x, float y, String operationType) {
        float result = 0;

        switch (operationType) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;

            default:
                System.out.println("Wrong operation type. Please try again!");
                result = 0;


        }
        return result;

    }
}
