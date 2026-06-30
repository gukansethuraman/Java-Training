package Day5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\nStudent Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);

        if (average >= 90)
            System.out.println("Grade : A");
        else if (average >= 75)
            System.out.println("Grade : B");
        else if (average >= 60)
            System.out.println("Grade : C");
        else if (average >= 40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : Fail");

        sc.close();
    }
}