/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int findMaxFork(Node root, int k) {
        // code here.
        in(root);
        Collections.sort(list);
        if(list.get(0)>k) return -1;
        for(int i = 1;i<list.size();i++){
            if(list.get(i)>k) return list.get(i-1);
        }
        return list.get(list.size()-1);
    }
    public void in(Node root){
        if(root == null) return;
        in(root.left);
        list.add(root.data);
        in(root.right);
        return;
    }
}