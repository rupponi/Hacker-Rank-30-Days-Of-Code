//DAY 22 OF HACKERRANK 30 DAY CHALLENGE: BINARY SEARCH TREES (JAVA)
//NOTE: Node class refactored to TreeNode to prevent duplicates from previous challenges.

import java.util.*;

class TreeNode {
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}

class Solution {
    public static int getHeight(TreeNode root){
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
    public static TreeNode insert(TreeNode root, int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
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
        TreeNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}