package Week1Day2;

import java.sql.Struct;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Converter {
    public static void main(String[] args) {
        int value = 45;
        String bin = decToBin(value);
        System.out.println(bin);
        int valueAfterConvert = binToDec(bin);
        System.out.print(valueAfterConvert);


    }

    public static String decToBin(int value) {
        String result = " ";
        while (value > 1) {
            result += value % 2;
            value /= 2;
        }
        result += value;
        result = new StringBuilder(result)
                .reverse()
                .toString();
        return result;
    }

    public static int binToDec(String bin) {
        String reverseValue = new StringBuilder(bin)
                .reverse()
                .toString();
        char[] letters = reverseValue.toCharArray();
        int result = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (letters[i] == '1') {
result += Math.pow(2,i);
            }

        }
        return result;
    }


}
