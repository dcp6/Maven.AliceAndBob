/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        if ((name.equals("Alice")) || (name.equals ("Bob"))) {
            System.out.print("Hello!");
        }
        else {
            System.out.print("You are not welcome here! (Just kidding)");
        }
    }
}
