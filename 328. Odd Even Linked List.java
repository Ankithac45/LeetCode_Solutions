/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to rearrange if there are less than 3 nodes
        }
        
        ListNode oddHead = head;
        ListNode odd = oddHead;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        
        while (even != null && even.next != null) {
            odd.next = even.next; // Connect odd node to next odd node
            odd = odd.next;
            even.next = odd.next; // Connect even node to next even node
            even = even.next;
        }
        
        odd.next = evenHead; // Connect the end of odd list to the start of even list
        
        return oddHead;
    }
}