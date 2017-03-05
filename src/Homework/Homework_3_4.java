package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class Homework_3_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float z;
        System.out.print("Введите число с плавающей точкой:");
        z = num.nextFloat();
    if(z>=0 && z<=1){
        System.out.print("Ваше число находится в диапазоне от 0 до 1");
    }else{
        System.out.print("Ваше число не находится в диапазоне от 0 до 1");
    }
    }
}
