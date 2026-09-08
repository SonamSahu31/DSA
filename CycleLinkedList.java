package LinkedList;

public class CycleLinkedList {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    public  static boolean hasCycle(Node head) {
        
        
        // Initialize two pointers, slow and fast, both starting at the head of the linked list
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            // Move the slow pointer one step forward
            slow = slow.next;
            // Move the fast pointer two steps forward
            fast = fast.next.next;

            // If the slow and fast pointers meet, a cycle exists in the linked list
            if(slow == fast){
                return true;
            }
            
        }
        return false; // If the fast pointer reaches the end of the list, there is no cycle

    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Create a cycle
        System.out.println(hasCycle(head)); // Output: true
    }
    
}
