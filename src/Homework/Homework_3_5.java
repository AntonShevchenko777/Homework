package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_3_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x, y;
        System.out.print("Введите первое число:");
        x = num.nextFloat();
        System.out.print("Введите первое число:");
        y = num.nextFloat();
        if (x > y) {
            System.out.print(x - y);
        }
        if (x < y) {
            System.out.print(x + y);
        }
        if (x == y) {
            System.out.print("Вы ввели одинаковые числа");
        }
    }
}
