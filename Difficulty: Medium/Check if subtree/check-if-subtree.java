/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isIdentical(Node t,Node s){
        if(t == null && s == null) return true;
        if(t == null || s == null) return false;
        if(t.data == s.data){
            return isIdentical(t.left,s.left) && isIdentical(t.right,s.right);
        }
        return false;
    }
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S == null) return true;
        if(T == null) return false;
        if(T.data == S.data){
            if(isIdentical(T,S)) return true;
        }
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
}