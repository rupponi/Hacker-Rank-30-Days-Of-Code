//DAY 1 OF HACKERRANK 30 DAY CHALLENGE: DATA TYPES (JAVA)

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

                /* Declare second integer, double, and String variables. */
        int i_in;
        double d_in;
        String s_in = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i_in = scan.nextInt();
        d_in = scan.nextDouble();

        while (scan.hasNext()) {
            s_in += scan.nextLine();
        }

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i_in + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d_in + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s_in);

        scan.close();
    }
}
