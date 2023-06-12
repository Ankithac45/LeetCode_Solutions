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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode h3 = l3;
        int carry = 0;

        while(h1!=null && h2!=null){
            int num = h1.val + h2.val+carry;
            ListNode newNode = new ListNode(num%10);
            h3.next = newNode;
            carry = num/10;
            h1 = h1.next;
            h2 = h2.next;
            h3 = h3.next;
        }

        while(h1!=null){
            int num = h1.val+carry;
            ListNode newNode = new ListNode(num%10);
            h3.next = newNode;
            carry = num/10;
            h1 = h1.next;
            h3 = h3.next;
        }

        while(h2!=null){
            int num = h2.val+carry;
            ListNode newNode = new ListNode(num%10);
            h3.next = newNode;
            carry = num/10;
            h2 = h2.next;
            h3 = h3.next;            
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            h3.next = newNode;
        }
        
        return l3.next;
    }
}