//DAY 5 OF HACKERRANK 30 DAY CHALLENGE: LOOPS(JAVA)
//NOTE: The solution class template from the website was renamed to Day5 for organization.

import java.util.*;

public class Day5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int x = 1; x <= 10; x++) {
            int result = n * x;
            System.out.format("%d x %d = %d\n",n,x,result);
        }
    }
}
