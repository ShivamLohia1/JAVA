import java.util.Scanner;
public class digit_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;   // Extract last digit
            sum += digit;              // Add to sum
            number /= 10;              // Remove last digit
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}