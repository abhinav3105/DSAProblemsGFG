//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node searchBSTRecursive(Node root, int num) {
        if (root == null || root.data == num)
            return root; // Found the node or reached the end

        if (num < root.data)
            return searchBSTRecursive(root.left, num); // Search in left subtree
        else
            return searchBSTRecursive(root.right, num); // Search in right subtree
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution g = new Solution();

            // Read x and y from two separate lines
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            Node n1 = searchBSTRecursive(root, x);
            Node n2 = searchBSTRecursive(root, y);
            System.out.println(g.LCA(root, n1, n2).data);
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


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
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if(n1.data == root.data || n2.data == root.data)
        {
            return root;
        }
        
        else if(n1.data < root.data && n2.data < root.data)
        {
            return(LCA(root.left,n1,n2));
        }
        
         else if(n1.data > root.data && n2.data > root.data)
        {
            return(LCA(root.right,n1,n2));
        }
        
        else
        {
            return root;
        }
    }
}