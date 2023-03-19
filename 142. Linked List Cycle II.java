public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slower=head;
        ListNode faster=head;
        ListNode entry=head;

        while(faster.next!=null && faster.next.next!=null){
            slower=slower.next;
            faster=faster.next.next;

            if(slower==faster){
                while(entry!=slower){
                    slower=slower.next;
                    entry=entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}