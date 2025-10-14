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
    int cnt = 0;
    int getCount(Node root, int l, int h) {
        // Your code here
        int ans = helper(root,l,h);
        return ans;
    }
    int helper(Node root,int l,int h){
        if(root == null) return cnt;
        if(root.data>=l && root.data<=h) cnt++;
        helper(root.left,l,h);
        helper(root.right,l,h);
        return cnt;
    }
}