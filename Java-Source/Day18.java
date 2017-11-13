//DAY 18 OF THE HACKERRANK 30 DAY CHALLENGE: QUEUES AND STACKS (JAVA)
//NOTE: The name of the class was changed for organization.

import java.util.*;

public class Day18 {
    char[] stack;
    char[] queue;
    int n;
    int m;

    public Day18() {
        stack = new char[0];
        queue = new char[0];
        n = 0;
        m = 0;
    }

    public void pushCharacter(char c) {
        if (n == 0) {
            stack = new char[1];
            stack[0] = c;
            n++;
        }
        else {
            char[] temp = new char[n+1];
            for (int x = 1; x < n+1; x++) {
                temp[x] = stack[x-1];
            }
            temp[0] = c;
            stack = temp;
            n++;
        }
    }

    public void enqueueCharacter(char c) {
        if (m == 0) {
            queue = new char[1];
            queue[0] = c;
            m++;
        }
        else {
            char[] temp = new char[m+1];
            for (int y = 0; y < m; y++) {
                temp[y] = queue[y];
            }
            temp[m] = c;
            queue = temp;
            m++;
        }
    }

    public char popCharacter() {
        if (n == 0) {
            char popOut = '\0';
            return popOut;
        }
        else {
            char[] temp = new char[n-1];
            for (int x = 1; x < n; x++) {
                temp[x-1] = stack[x];
            }
            char popOut = stack[0];
            stack = temp;
            n--;
            return popOut;
        }
    }

    public char dequeueCharacter() {
        if (m == 0) {
            char dequeueOut = '\0';
            return dequeueOut;
        }
        else {
            char[] temp = new char[m-1];
            for (int y = 1; y < m; y++) {
                temp[y-1] = queue[y];
            }
            char dequeueOut = queue[0];
            queue = temp;
            m--;
            return dequeueOut;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}