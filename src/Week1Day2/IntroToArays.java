package Week1Day2;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class IntroToArays {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[20];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + " ");
        }

        int counter = 0;
        while (counter != array2.length){
            array2[counter] = (int)(Math.random()*18);
            System.out.print(array2[counter]+ " ");
            counter++ ;
        }


    }
}

