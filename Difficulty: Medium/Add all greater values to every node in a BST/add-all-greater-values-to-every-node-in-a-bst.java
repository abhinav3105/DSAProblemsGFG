// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {

    // modify the BST and return its root
    ArrayList<Integer> arr = new ArrayList<>();
    public Node modify(Node root) {
        // Write your code here
        h1(root);
        h2(root,arr);
        return root;
        
    }
    public void h1(Node root){
        if(root == null) return;
        arr.add(root.data);
        h1(root.left);
        h1(root.right);
        return;
    }
    public void h2(Node root,ArrayList<Integer> arr){
        if(root == null) return;
        int temp = root.data;
        for(int i =0;i<arr.size();i++){
            if(arr.get(i)>temp) root.data+=arr.get(i);
        }
        h2(root.left,arr);
        h2(root.right,arr);
        return;
    }
}