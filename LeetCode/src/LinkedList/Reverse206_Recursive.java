package LinkedList;

import java.util.List;

public class Reverse206_Recursive {
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode curr = head;
        ListNode nextNode = curr.next;
        curr.next = null;
        ListNode rest = reverseList(nextNode);
        nextNode.next = curr;
        return rest;
    }
}
