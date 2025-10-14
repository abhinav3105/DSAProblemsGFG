/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int sum = 0;
    public int nodeSum(Node root, int l, int r) {
        // code here
       int ans = helper(root,l,r);
       return ans;
    }
    public int helper(Node root, int l , int r){
        if(root == null) return sum;
        if(root.data>=l && root.data<=r) sum+=root.data;
        helper(root.left,l,r);
        helper(root.right,l,r);
        return sum;
    }
}
