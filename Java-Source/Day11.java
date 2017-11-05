//DAY 11 OF HACKERRANK 30 DAY CHALLENGE: 2D ARRAYS (JAVA)
//NOTE: The name of the class was changed for organization.

import java.util.*;

public class Day11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int hourglass =arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                if (hourglass > maxSum) {
                    maxSum = hourglass;
                }
            }
        }

        System.out.println(maxSum);
    }
}
