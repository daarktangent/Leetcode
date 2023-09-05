/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp = head;
        Node head2=null;
        HashMap<Node,Node> map =new HashMap<>();
        while(temp!=null)
        {
            map.putIfAbsent(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            Node x = map.get(temp);
            x.next=map.get(temp.next);
            x.random = map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
        
    }
}