import java.lang.String;
import java.util.Scanner;

public class UI{

    public static String getInput(String message){

        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        scanner.close();

        return input;
    }

    public static void getMenu(){

        String menuString = String.join("\n");

        System.out.println(menuString);

    }
}