package Day7;

import java.util.Scanner;

public class PrintUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Enter Number: ");
            num = sc.nextInt();

            if (num != 0) {
                System.out.println("You Entered: " + num);
            }

        } while (num != 0);

        System.out.println("Program Ended");
    }
}