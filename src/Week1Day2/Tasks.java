package Week1Day2;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 26.02.2017.
 */
public class Tasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text");
        String text = scanner.nextLine();
        System.out.println("Please enter search word");
        String wordForSearch = scanner.nextLine();
        checkText(text, wordForSearch );}

        public static void checkText(String text, String wordForSearch ){
            if ( text.contains(wordForSearch) && wordForSearch.length() >0){
                System.out.println("Good! Word is found");
            }else{
                System.out.println("Bad.Word not found");
            }






    }







       // checkValue(number);

       /* boolean result = checkEven(number);
        System.out.println(number+ " is even: " + result);*/

    }

  /*  public static void chekText(String text ){
        if (x<=100 && x>= 10 && x%2 ==0){
            System.out.println(x + " is <=100 and >=10 and is even");

        }else{
            System.out.println("Eror");
        }


    }




    public static boolean checkEven(int value) {
        if (value %2 ==0) {

            return true;

        } else {

            return false;

        }

    }*/





