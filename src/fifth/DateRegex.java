package fifth;

import java.util.Scanner;
import java.util.regex.*;

public class DateRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dateni shu formatda kiriting: DD-MM-YYYY");
        System.out.print("Kiriting: ");
        String input = scanner.nextLine();
        String regex = "\\d{2}-\\d{2}-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Date to'gri formatda kiritildi: DD-MM-YYYY.");
        } else {
            System.out.println("Date noto'g'ri formatda kirtildi:  DD-MM-YYYY.");
        }
    }

}
