/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int sz = q.size();
            ArrayList<Integer> help = new ArrayList<>();
            for(int i = 0;i<sz;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                help.add(q.poll().data);
            }
            ans.add(help);
        }
        return ans;
    }
}