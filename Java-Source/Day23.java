//DAY 23 OF HACKERRANK 30 DAY CHALLENGE: BST LEVEL-ORDER TRAVERSAL

import java.util.*;

class levelOrderNode{
    levelOrderNode left,right;
    int data;
    levelOrderNode(int data){
        this.data=data;
        left=right=null;
    }
}
class Day23 {
    static void levelOrder(levelOrderNode root) {
        ArrayList<levelOrderNode> queue = new ArrayList<levelOrderNode>();

        if (root != null) {
            System.out.print(root.data + " ");
        }
        if (root.left != null) {
            queue.add(root.left);
        }
        if (root.right != null) {
            queue.add(root.right);
        }
        while (!queue.isEmpty()) {
            levelOrderNode current = queue.get(0);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
            System.out.print(current.data + " ");
            queue.remove(0);
        }
    }
    public static levelOrderNode insert(levelOrderNode root,int data){
        if(root==null){
            return new levelOrderNode(data);
        }
        else{
            levelOrderNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        levelOrderNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}