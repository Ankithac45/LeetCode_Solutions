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
    ListNode headNode;
    int length=0;
    public Solution(ListNode head) {
        headNode=head;
        while(head!=null){
            length++;
            head=head.next;
        }

    }
    
    public int getRandom() {
        int rand_idx= (int)(Math.random()*length);
        ListNode temp=headNode;
        for(int i=0;i<rand_idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */