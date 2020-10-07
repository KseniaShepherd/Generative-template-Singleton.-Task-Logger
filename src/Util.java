import java.util.Scanner;

public class Util {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String requestString(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
}