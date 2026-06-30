package Day7;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        if (username.equals("admin")) {

            if (password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Invalid Username");
        }
    }
}