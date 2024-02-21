package first;

import java.util.logging.Logger;
import java.util.Scanner;

public class Log {
    private static final Logger logger = Logger.getLogger(Log.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        showName(name);
    }
    public static void showName(String name) {
        System.out.println("Logger");
        logger.info("Name: " + name);
    }
}
