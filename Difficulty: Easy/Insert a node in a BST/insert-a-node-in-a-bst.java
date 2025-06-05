class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int key) {
        // your code here
        Node newNode = new Node(key);
        if(root == null) return newNode;
        Node cur = root;
        while(true){
            if(cur.data> key){
                if(cur.left!= null) cur = cur.left;
                else{
                    cur.left = newNode;
                    break;
                }
            }
            else if(cur.data == key) return root;
            else{
                if(cur.right!= null) cur = cur.right;
                else{
                    cur.right = newNode;
                    break;
                }
            }
        }
        return root;
    }
}