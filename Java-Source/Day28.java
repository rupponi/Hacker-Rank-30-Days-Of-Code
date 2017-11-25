//DAY 28 OF HACKERRANK 30 DAY CHALLENGE: REGEX, PATTERNS, AND INTRO TO DATABASES (JAVA)

import java.util.*;

public class Day28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] inputs = new String[n];
        String[] names = new String[n];
        ArrayList<String> outputs = new ArrayList<String>();

        scan.nextLine();
        for (int x = 0; x < n; x++) {
            inputs[x] = scan.nextLine();
            String[] temp = inputs[x].split(" ");
            names[x] = temp[0];

            if (inputs[x].contains("@gmail.com")) {
                outputs.add(names[x]);
            }
        }

        for (int y = 0; y < outputs.size()-1; y++) {
            int minIndex = y;
            for (int z = y+1; z < outputs.size(); z++) {
                if (outputs.get(minIndex).compareTo(outputs.get(z)) > 0) {
                    minIndex = z;
                }
            }
            if (minIndex != y) {
                String temp = outputs.get(y);
                outputs.set(y,outputs.get(minIndex));
                outputs.set(minIndex,temp);
            }
        }

        for (int i = 0; i < outputs.size(); i++) {
            System.out.println(outputs.get(i));
        }
    }
}