package Week1Day2;

import java.util.Scanner;

/**
 * Created by OlyaLevits on 05.03.2017.
 */
public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Say Hello ");
            System.out.println("2. Say Goodbye ");
            System.out.println("3. Halo ");
            System.out.println("4. Aloha ");
            System.out.println("5. Bonjure ");
            System.out.println("6. Exit ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    sayHello(getName(scanner));

                    break;
                case "2":
                    sayGoodbye(getName(scanner));

                    break;
                case "3":
                    Halo(getName(scanner));
                    break;
                case "4":
                    Aloha(getName(scanner));

                    break;
                case "5":
                    Bonjure(getName(scanner));
                    break;
                case "6":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Wrong choose");
                    break;


            }
        }
    }
public static String getName(Scanner scanner){
        System.out.println("Please enter name:");
        return scanner.nextLine();

}
public static void sayHello(String name){
    System.out.println("Say Hello "+ name);
}
    public static void sayGoodbye(String name) {
        System.out.println("Say Goodbye" + name);
    }
    public static void Halo(String name) {
        System.out.println("Halo " + name);
    }
    public static void Aloha(String name) {
        System.out.println("Aloha " + name);
    }
    public static void Bonjure(String name) {
        System.out.println("Bonjure " + name);
    }
    public static void Exit(String name) {
        System.out.println("Exit " + name);
    }

}
