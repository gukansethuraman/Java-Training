package Day2;
import java.util.Scanner;


public class CalculatorProgram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("ADDITION:"+ (a+b));
        System.out.println("SUBTRACTION:"+(a-b));
        System.out.println("MULTIPLICATION:"+(a*b));
        System.out.println("DIVISION:"+(a/b));
    }
}
