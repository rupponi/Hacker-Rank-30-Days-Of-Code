//DAY 26 OF HACKERRANK 30 DAY CHALLENGE: NESTED LOGIC (JAVA)

import java.util.*;

public class Day26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dayActual = scan.nextInt();
        int monthActual = scan.nextInt();
        int yearActual = scan.nextInt();
        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();

        int fine;

        if (yearActual > yearExpected) {
            fine = 10000;
        }
        else if (yearActual == yearExpected) {
            if (monthActual > monthExpected) {
                fine = 500 * (monthActual - monthExpected);
            }
            else if (monthActual == monthExpected) {
                if (dayActual > dayExpected) {
                    fine = 15 * (dayActual - dayExpected);
                }
                else {
                    fine = 0;
                }
            }
            else {
                fine = 0;
            }
        }
        else {
            fine = 0;
        }

        System.out.println(fine);
    }
}