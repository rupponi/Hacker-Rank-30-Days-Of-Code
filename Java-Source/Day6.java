//DAY 6 OF HACKERRANK 30 DAY CHALLENGE: LET'S REVIEW (JAVA)
//NOTE: The solution class template from the website was renamed to Day6 for organization.

import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStrings = scan.nextInt();
        scan.nextLine();

        for (int x = 0; x < numStrings; x++) {
            String input = scan.nextLine();
            int n = input.length();

            for (int y = 0; y < n; y++) {
                if (y % 2 == 0) {
                    System.out.print(input.charAt(y));
                }
            }
            System.out.print(" ");
            for (int z = 0; z < n; z++) {
                if (z % 2 == 1) {
                    System.out.print(input.charAt(z));
                }
            }
            System.out.print("\n");
        }
    }
}