package third;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SumOfFile {
    public static void main(String[] args) {
        String numbers = "C:\\myfiles\\sumOfNumbers.txt";
        String sumOfNumbers = "sum.txt";
        try (BufferedReader nums = new BufferedReader(new FileReader(numbers));
             BufferedWriter sumF = new BufferedWriter(new FileWriter(sumOfNumbers))) {
            int number1 = Integer.parseInt(nums.readLine());
            int number2 = Integer.parseInt(nums.readLine());
            int sum = number1 + number2;
            sumF.write(Integer.toString(sum));
            System.out.println("Numberlarning yig'indisi: " + sumOfNumbers + ": " + sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
