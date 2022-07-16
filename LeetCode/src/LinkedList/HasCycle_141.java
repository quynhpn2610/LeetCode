package LinkedList;

public class HasCycle_141 {
    public boolean hasCycle(ListNode head){
        ListNode fast, slow;
        fast = head;
        slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return true;
        }

        return false;

    }
}
