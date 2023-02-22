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

/** Time complexity : O(n)O(n)O(n). Assume that nnn is the list's length, the time complexity is O(n)O(n)O(n).

 Space complexity : O(1)O(1)O(1). */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        // ListNode nxt = curr.next; - do notb delare here because you do not know if curr is null or not. Declare in the while loop below.

        /* The plan is to take curr.next and point to prev, while storing
        original curr.next into nxt*/

        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}