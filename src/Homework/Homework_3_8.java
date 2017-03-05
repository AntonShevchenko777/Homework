package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_3_8 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x,y;
        float z,w;

        System.out.print("Введите первое число:");
        x = num.nextInt();
        System.out.print("Введите второе число:");
        y = num.nextInt();
        z=x%10;
        w = y%10;

        if(z ==w){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
