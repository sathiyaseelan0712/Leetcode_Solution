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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head;
        if(slow == null){
            return null;
        }
        ListNode fast = head.next;
        if(fast == null){
            return head;
        }

        while(fast!=null){
            if(fast.val == slow.val){
                slow.next = fast.next;
                fast = fast.next;
            }
            else{
                fast=fast.next;
                slow = slow.next;
            }
        }
        return head;
    }
}
