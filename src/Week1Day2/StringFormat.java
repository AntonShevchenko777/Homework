package Week1Day2;

import java.text.MessageFormat;

/**
 * Created by OlyaLevits on 05.03.2017.
 */
public class StringFormat {
    public static void main(String[] args) {
        String name = "Vlad";
        int age = 25;
        float height = 1.85f;
        boolean isMan = true;

       /* System.out.println("Name is:"+name+ "\nage is:" + age +"\nHeight is:"+ height+"\nMan:"+ isMan);*/

       /* String result = String.format("Name is: %s\n" + "Age is: %d\n" + "Height: %.2f\n" + "Man: %b", name, age, height, isMan);
        System.out.println(result);*/
        String result2 = MessageFormat.format("Name is : {0}\n" + "Age is: {1}\n" + "Height is: {2}\n" + "Man: {3}\n", name, age, height, isMan);
        System.out.println(result2);
    }
}
