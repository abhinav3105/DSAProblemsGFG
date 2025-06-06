class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        boolean vis[] = new boolean[adj.size()];
        while(!q.isEmpty()){
            int x = q.remove();
            if(vis[x] == false){
                ans.add(x);
                for(int i = 0;i<adj.get(x).size();i++){
                    q.add(adj.get(x).get(i));
                }
                vis[x] = true;
            }
        }
        return ans;
    }
}