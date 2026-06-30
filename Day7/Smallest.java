package Day7;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int smallest = (a < b)
                ? ((a < c) ? a : c)
                : ((b < c) ? b : c);

        System.out.println("Smallest = " + smallest);
    }
}