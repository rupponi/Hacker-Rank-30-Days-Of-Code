//DAY 16 OF HACKERRANK 30 DAY CHALLENGE: EXCEPTIONS - STRING TO INTEGER (JAVA)

import java.util.*;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int output;

        try {
            output = Integer.parseInt(S);
            System.out.println(output);
        }
        catch (Exception ex) {
            System.out.println("Bad String");
        }
    }
}