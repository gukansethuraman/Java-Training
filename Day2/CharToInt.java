package Day2;

import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit (0-9): ");
        char ch = sc.next().charAt(0);

        int num = ch - '0';

        System.out.println("Integer = " + num);
    }
}