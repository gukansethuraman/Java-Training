package Day7;

import java.util.Scanner;

public class PassDistinction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 35) {

            if (marks >= 75) {
                System.out.println("Pass with Distinction");
            } else {
                System.out.println("Pass");
            }

        } else {
            System.out.println("Fail");
        }
    }
}