
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
    public ListNode middleNode(ListNode head) {
        ListNode headNode1=head;
        ListNode headNode2=head;
        int length=0;

        //Length of the linked list
        while(headNode1!=null){
            length++;
            headNode1=headNode1.next;
        }
        //calculate the mid value
        int mid= length/2;

        //Finding the middle value
        for(int i=0;i<mid;i++){
            headNode2=headNode2.next;
        }
        return headNode2;
    }
}
