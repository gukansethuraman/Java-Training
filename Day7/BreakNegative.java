package Day7;

import java.util.Scanner;

public class BreakNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            System.out.println(num);
        }

        System.out.println("Negative Number Entered");
    }
}