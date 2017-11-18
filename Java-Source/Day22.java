//DAY 22 OF HACKERRANK 30 DAY CHALLENGE: BINARY TREE CHALLENGE (JAVA)
//NOTE: Node class was changed to BTreeNode to prevent overlap from previous classes.

import java.util.*;

class BTreeNode {
    BTreeNode left,right;
    int data;
    BTreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
    public static int getHeight(BTreeNode root){
        if (root == null) {
            return -1;
        }

        return max(getHeight(root.left),getHeight(root.right)) + 1;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static BTreeNode insert(BTreeNode root, int data){
        if(root==null){
            return new BTreeNode(data);
        }
        else{
            BTreeNode cur;
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
        BTreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}