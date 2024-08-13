/* Write a program that takes a number as input and 
prints all its factors except 1 and the number itself.. 
If the number has only two factors (1 and the number itself), 
then the program should print -1. */

import java.util.Scanner;
public class Ques6{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
 boolean hasOtherFactors = false;
 for (int i = 2; i < n; i++) {
    if (n % i == 0) {
        System.out.print(i + " ");
        hasOtherFactors = true;
    }
}

if (!hasOtherFactors) {
    System.out.println(-1);
}
}
}
    
