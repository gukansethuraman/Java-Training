package Day2;

import java.util.Scanner;

public class SmallestTwoNumber {
    public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Number :");
            int a = sc.nextInt();
            System.out.println("Enter Second Number :");
            int b = sc.nextInt();
            if(a<b){
                System.out.println(a + " is Smallest" );
            }else{
                System.out.println(b + " is Smallest");
            }
            sc.close();
        }

}
