//DAY 10 OF HACKERRANK 30 DAY CHALLENGE: BINARY NUMBERS (JAVA)
//NOTE: The name of the class was changed for organization.

import java.util.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> binaryValue = new Stack<Integer>();
        if (n == 1) {
            binaryValue.push(1);
        }

        while (n > 0) {
            int newBinDigit = n % 2;
            n = n / 2;
            binaryValue.push(newBinDigit);
        }

        int consecutive = 0;
        int currentStream = 0;

        while (!binaryValue.empty()) {
            int current = binaryValue.pop();
            if (current == 1) {
                currentStream++;
                if (currentStream > consecutive) {
                    consecutive = currentStream;
                }
            }
            if (current == 0) {
                currentStream = 0;
            }
        }

        System.out.println(consecutive);
    }
}
