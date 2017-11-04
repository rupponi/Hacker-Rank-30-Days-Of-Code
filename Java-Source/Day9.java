//DAY 9 OF HACKERRANK 30 DAY CHALLENGE: RECURSION (JAVA)
//NOTE: Class name was changed for organization.

import java.util.*;

public class Day9 {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (factorial(n-1)*n);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
