package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 03.03.2017.
 */
public class Homework_3_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y, z;
        System.out.print("Введите первое число:");
        x = num.nextInt();
        System.out.print("Введите второе число:");
        y = num.nextInt();
        System.out.print("Введите третье число:");
        z = num.nextInt();
        int max1 = Math.max(x,y);
        int max2 = Math.max(max1,z);
        int min1 = Math.min(x,y);
        int min2 = Math.min(min1,z);
        if (max1>max2) {
            System.out.println(max1);
        }else{
            System.out.println(max2);
        }

        if (min1<min2) {
            System.out.println(min1);
        }else{
            System.out.println(min2);
        }



    }
}
