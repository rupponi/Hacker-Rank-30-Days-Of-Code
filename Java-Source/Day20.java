//DAY 20 OF HACKERRANK 30 DAY CHALLENGE: SORTING (JAVA)

//NOTE: Exercise requires using Bubble Sort.
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
        for (int x = 0; x < n; x++) {
            int sweepSwaps = 0;
            for (int y = 0; y < n-1; y++) {
                if (a[y+1] < a[y]) {
                    int temp = a[y];
                    a[y] = a[y+1];
                    a[y+1] = temp;
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
