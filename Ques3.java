/* Write a program to calculate the total salary of a person.
 The user has to enter the basic salary (an integer) and 
 the grade (an uppercase character), depending upon which 
 the total salary is calculated as:
Total_salary = Basic + HRA + DA + Allow – PF
where :
HRA   = 20% of basic
DA    = 50% of basic
Allow = 1700 if grade = ‘A’
Allow = 1500 if grade = ‘B’
Allow = 1300 if grade = ‘C' or any other character
PF    = 11% of basic. */


import java.util.Scanner;

public class Ques3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        int basic = scanner.nextInt();

        System.out.print("Enter grade (A, B, C, or any other character): ");
        char grade = scanner.next().charAt(0);

        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double pf = 0.11 * basic;

        double allowance;
        if (grade == 'A') {
            allowance = 1700.0;
        } else if (grade == 'B') {
            allowance = 1500.0;
        } else {
            allowance = 1300.0;
        }

        double totalSalary = basic + hra + da + allowance - pf;

        System.out.println("Total salary: " + Math.round(totalSalary));
    }
}