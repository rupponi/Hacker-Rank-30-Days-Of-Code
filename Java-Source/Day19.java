//DAY 19 OF HACKERRANK 30 DAY CHALLENGE: INTERFACES (JAVA)
//NOTE: The Calculator class was renamed Interface Calculator due to
//      clashing with a Calculator class in a previous exercise.

import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class InterfaceCalculator implements AdvancedArithmetic {
    int output;

    public InterfaceCalculator() {
        output = 0;
    }

    public int divisorSum(int n) {
        for (int x = 1; x <= 1000; x++) {
            if (n % x == 0) {
                output += x;
            }
        }

        return output;
    }
}

public class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new InterfaceCalculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}