// DAY 29 OF HACKERRANK 30 DAY CHALLENGE: BITWISE AND (JAVA)

import java.util.*;

public class Day29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();

        for (int i = 0; i < numCases; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int highestVal = 0;

            for (int a = 1; a < n; a++) {
                for (int b = a+1; b <= n; b++) {
                    if (((a & b) > highestVal) && ((a & b) < k)) {
                        highestVal = (a & b);
                    }
                }
            }

            System.out.println(highestVal);
        }
    }
}