//DAY 14 OF HACKERRANK 30 DAY CHALLENGE: SCOPE (JAVA)

import java.util.*;

//THIS IS THE CLASS USED IN THIS EXERCISE.
class Difference {
    private int[] elements;
    public int maximumDifference;

    //THESE PARTS OF THE DIFFERENCE CLASS WERE DONE FOR THE EXERCISE.
    public Difference(int[] input) {
        elements = input;
    }

    public void computeDifference() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < elements.length; x++) {
            if (elements[x] > max) {
                max = elements[x];
            }
            if (elements[x] < min) {
                min = elements[x];
            }
        }
        maximumDifference = max - min;
    }
}

//THIS CLASS WAS GIVEN AND CONTAINS THE MAIN METHOD FOR WORKING WITH THE DIFFERENCE CLASS.
public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}