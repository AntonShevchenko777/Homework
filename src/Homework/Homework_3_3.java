package Homework;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 03.03.2017.
 */
public class Homework_3_3 {
    public static void main(String[] args) {

        Scanner num =new Scanner(System.in);
        int  a;
        System.out.print("Введите число:");
       a= num.nextInt();

        if (a % 7  ==0 ){
            System.out.print(a*2);
        }else{
            System.out.print("Ваше число не делится на 7 нацело");
        }

    }
}
