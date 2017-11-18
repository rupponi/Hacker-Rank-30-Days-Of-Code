//DAY 15 OF HACKERRANK 30 DAY CHALLENGE: LINKED LIST (JAVA)

import java.util.*;

class Node {
    int data;
    TreeNode next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {
    public static TreeNode insert(TreeNode head, int data) {
        TreeNode traverser = head;

        if (head == null) {
            head = new TreeNode(data);
        }
        else {
            while (traverser.next != null) {
                traverser = traverser.next;
            }
            traverser.next = new TreeNode(data);
        }

        return head;
    }
    public static void display(TreeNode head) {
        TreeNode start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeNode head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
