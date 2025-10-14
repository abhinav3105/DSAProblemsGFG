/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int clo;
    
    static int minDiff(Node root, int K) {
        clo = Integer.MAX_VALUE;
        return helper(root, K);
    }
    
    static int helper(Node root, int k) {
        if (root == null) return clo;
        
        clo = Math.min(clo, Math.abs(root.data - k));
        
        if (root.data > k) helper(root.left, k);
        else helper(root.right, k);
        
        return clo;
    }
}
