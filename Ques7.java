/* Write a program to find x to the power n (i.e. x^n). 
Take x and n from the user. You need to print the answer.
 */
import java.util.Scanner;
 public class Ques7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base (x): ");
        double x = scanner.nextDouble();

        System.out.println("Enter the exponent (n): ");
        double n = scanner.nextDouble();

        double result = Math.pow(x, n);

        System.out.println("The result of " + x + " to the power of " + n + " is: " + result);
    }
    }
 