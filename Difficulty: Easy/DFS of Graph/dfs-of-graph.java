// class Solution {
//     // Function to return a list containing the DFS traversal of the graph.
//     static ArrayList<Integer> ans = new ArrayList<>();
//     public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
//         // Code here
//         boolean[] vis = new boolean[adj.size()];
        
//         helper(adj,vis,0);
//         return ans;
//     }
//     public static void helper(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int curr){
    
//         ans.add(curr);
//         vis[curr] = true;
//         for(int i = 0;i<adj.get(curr).size();i++){
//             if(!vis[adj.get(curr).get(i)]){
//                 helper(adj,vis,adj.get(curr).get(i));
//             }
//         }
//     }
// }
class Solution {
    private void helper(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        vis[node]=true;
        res.add(node);
        for(int it:adj.get(node)){
            if(!vis[it]){
                helper(it,vis,adj,res);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        boolean vis[]=new boolean[n];
        vis[0]=true;
        ArrayList<Integer> list=new ArrayList<>();
        helper(0,vis,adj,list);
        return list;
    }
}