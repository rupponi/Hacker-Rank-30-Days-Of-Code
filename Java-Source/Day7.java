//DAY 7 OF HACKERRANK 30 DAY CHALLENGE: ARRAYS (JAVA)
//NOTE: The name of the Solution class template was changed to Day7 for organization in the directory.

import java.util.*;

public class Day7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        for (int x = n-1; x >= 0; x--) {
            System.out.print(arr[x] + " ");
        }
        System.out.print("\n");
    }
}
