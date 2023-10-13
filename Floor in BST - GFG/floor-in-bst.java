//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int val) {
        data = val;
        right = null;
        left = null;
    }
}

class GFG {

    public static Node insert(Node tree, int val) {
        Node temp = null;
        if (tree == null) {
            return new Node(val);
        }

        if (val < tree.data) {
            tree.left = insert(tree.left, val);
        } else if (val > tree.data) {
            tree.right = insert(tree.right, val);
        }

        return tree;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            Node root = null;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int k = sc.nextInt();
                root = insert(root, k);
            }

            int s = sc.nextInt();

            Solution obj = new Solution();
            int ans = obj.floor(root, s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> l= new ArrayList<Integer>();
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            l.add(root.data);
            inorder(root.right);
        }
    }
    public int floor(Node root, int x) {
    inorder(root);
    // System.out.println(l);
    // if (l.get(0)>x)
    // return -1;
    for (int i=l.size()-1;i>=0;i--)
    {
        
        if (l.get(i)==x)
        return x;
        if (l.get(i)<x)
        return l.get(i);
    }
    return -1;
        
    }
}