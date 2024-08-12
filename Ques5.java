/* Write a program to input an integer 'n' and
 print the sum of all its even digits and the sum of all its odd digits separately. */

 import java.util.Scanner;

public class Ques5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            n /= 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}