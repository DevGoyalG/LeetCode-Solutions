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

    ListNode frontNode = null;
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }
        if(frontNode == null) {
            frontNode = head;
        }

        boolean isPalindrome = isPalindrome(head.next);
        if(isPalindrome && frontNode.val == head.val) {
            frontNode = frontNode.next;
            return true;
        } else {
            return false;
        }
        

    }
}
