//DAY 25 OF HACKERRANK 30 DAY CHALLENGE: RUNNING TIME AND COMPLEXITY (JAVA)

import java.util.*;

public class Day25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int x = 0; x < T; x++) {
            int input = scan.nextInt();
            boolean isPrime = true;

            if (input <= 1) {
                isPrime = false;
            }

            int inputRoot = (int) Math.sqrt(input);
            for (int y = 2; y <= inputRoot; y++) {
                if (input % y == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }
}