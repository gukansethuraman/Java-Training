package Day7;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 0;

        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.println("Digits = " + count);
    }
}