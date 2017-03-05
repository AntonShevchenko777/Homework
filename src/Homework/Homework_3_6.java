package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_3_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x,y;
        System.out.print("Введите первое число:");
        x = num.nextInt();
        System.out.print("Введите второе число:");
        y = num.nextInt();
        if (x+y>=11 && x+y<=19){
            System.out.print("Сумма чисел:" + (x+y));
        }else{
            System.out.print("Сумма Ваших чисел не лежит в диапазоне от 11 до 19");
        }
    }
}
