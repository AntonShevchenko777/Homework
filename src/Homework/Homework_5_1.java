package Homework;

import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_5_1 {
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);
        int i;
        System.out.print("Введите число:");
        i = num.nextInt();
        {
            System.out.println("Перевод числа в двоичную систему:" + Integer.toBinaryString(i));
            System.out.println("Перевод числа в десятичную систему:" + Integer.parseInt(String.valueOf(i)));
        }

    }
}
