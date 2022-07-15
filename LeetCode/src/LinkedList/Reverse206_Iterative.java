package LinkedList;

import java.util.List;

public class Reverse206_Iterative {
    public ListNode reverseList(ListNode head){
        if (head == null) return head;

        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        ListNode temp;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
