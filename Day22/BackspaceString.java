package Day22;

import java.util.*;

public class BackspaceString{

    public static String build(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        if (build(s).equals(build(t))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}