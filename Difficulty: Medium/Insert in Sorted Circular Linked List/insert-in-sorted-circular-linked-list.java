/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node temp = head.next;
        Node prev = head;
        Node newNode = new Node(data);
        while(temp.data>=prev.data){
            if(temp.data >= newNode.data && newNode.data >= prev.data){
                newNode.next = temp;
                prev.next = newNode;
                return head;
            }
            temp = temp.next;
            prev = prev.next;
        }
        if(prev.data>newNode.data){
            newNode.next = head;
            prev.next = newNode;
            return newNode;
        }
        prev.next = newNode;
        newNode.next = head;
        return head;
        
    }
}