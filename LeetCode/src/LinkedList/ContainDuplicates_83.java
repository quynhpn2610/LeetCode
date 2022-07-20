package LinkedList;

public class ContainDuplicates_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;

        while (curr != null){
            while (curr.next != null && curr.next.val == curr.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }

        return head;

    }
}
