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
    public boolean isPalindrome(ListNode head) {
      int length = 0;
      ListNode hA = head;

      while(hA!=null){
          length++;
          hA = hA.next;
      }

      if(length==1){
          return true;
      }

      int count = 0;
      ListNode dummyNode = null;
      while(count<length/2){
          ListNode Next = head.next;
          head.next = dummyNode;
          dummyNode = head;
          head = Next;
          count++;
      }

      if(length%2!=0){
          head = head.next;
      }

      while(dummyNode!=null && head!=null){
          if(dummyNode.val!=head.val){
              return false;
          }
          dummyNode = dummyNode.next;
          head = head.next;
      }
      return true;
    }
}