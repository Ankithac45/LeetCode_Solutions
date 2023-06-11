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
    public ListNode reverseList(ListNode head) {
        ListNode dN = null;
        while(head!=null){
            ListNode Next = head.next;
            head.next = dN;
            dN = head;
            head = Next;
        }
        return dN;
    }
}