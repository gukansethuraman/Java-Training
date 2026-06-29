package Day3;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}