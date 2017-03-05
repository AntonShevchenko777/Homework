package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 03.03.2017.
 */
public class Homework_3_1_ {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float time;
        System.out.print("Введите время:");
        time = num.nextFloat();
        if (time >= 9 && time <= 18)
            System.out.println("Я на работе");
        else {
            System.out.println("Я отдыхаю");
        }

    }

}
