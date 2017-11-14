//DAY 20 OF HACKERRANK 30 DAY CHALLENGE: SORTING (JAVA)

import java.util.*;

public class Day20 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numSwaps = 0;

        for (int x = 0; x < n-1; x++) {
            int sweepSwaps = 0;
            for (int y = x+1; y < n; y++) {
                if (a[x] > a[y]) {
                    int temp = a[x];
                    a[x] = a[y];
                    a[y] = temp;
                    sweepSwaps++;
                }
            }
            numSwaps += sweepSwaps;
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
