//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.print("NULL");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            Node head1 = null, tail1 = null;
            Node head2 = null, tail2 = null;

            String input1 = sc.nextLine();
            String[] elems1 = input1.split(" ");
            for (String elem : elems1) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head1 == null) {
                    head1 = newNode;
                    tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = newNode;
                }
            }

            String input2 = sc.nextLine();
            String[] elems2 = input2.split(" ");
            for (String elem : elems2) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head2 == null) {
                    head2 = newNode;
                    tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }

            Solution obj = new Solution();
            Node[] newHeads = obj.mergeList(head1, head2);
            printList(newHeads[0]);
            printList(newHeads[1]);
        }
        sc.close();
    }
}

// } Driver Code Ends


/*
The structure of node class is :
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public Node[] mergeList(Node head1, Node head2) {
        // write your code here, and print the result
        Node t1 = head1;
        Node t2 = head2;
        while(t1!= null){
            if(t2 == null) break;
            Node nn = new Node(t2.data);
            nn.next = t1.next;
            t1.next = nn;
            t1 = t1.next.next;
            t2 = t2.next;
        }
        Node[] ans = new Node[2];
        ans[0] = head1;
        ans[1] = t2;
        return ans;
    }
}