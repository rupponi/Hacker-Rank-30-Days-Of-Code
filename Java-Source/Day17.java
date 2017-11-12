//DAY 17 OF HACKERRANK 30 DAY CHALLENGE: MORE EXCEPTIONS (JAVA)

import java.util.*;

class Calculator {
    int n;
    int p;

    Calculator() {
        n = 0;
        p = 0;
    }

    public int power (int n, int p) throws Exception {
        int output = 1;
        if ((p >= 0) && (n >= 0)) {
            for (int x  = 0; x < p; x++) {
                output = output * n;
            }

            return output;
        }
        else {
            throw new Exception("n and p should be non-negative");
        }
    }
}

public class Day17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
