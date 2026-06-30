package Day7;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        String result = (n >= 0) ? "Positive" : "Negative";

        System.out.println(result);
    }
}