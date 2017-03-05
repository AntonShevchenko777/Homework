package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_3_7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x,y;
        System.out.print("Введите первое число:");
        x = num.nextInt();
        System.out.print("Введите второе число:");
        y = num.nextInt();
        if (x % y == 0) {
        System.out.print("True:" + (x/y));
        }else{
            System.out.print("False");
        }

    }
}
