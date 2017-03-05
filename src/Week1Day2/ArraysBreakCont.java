package Week1Day2;

/**
 * Created by OlyaLevits on 04.03.2017.
 */
public class ArraysBreakCont {
    public static void main(String[] args) {
        int[] mas1 = Utils.generateArray(5, 0, 5);
        Utils.printArray(mas1);
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 2) {
                System.out.println("2 is on index" + i);
                break;

            }
        }

        for (int i = 0; i < mas1.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(mas1[i] + " ");
        }


    }
}
