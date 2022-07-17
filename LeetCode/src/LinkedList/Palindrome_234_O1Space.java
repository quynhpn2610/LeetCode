package LinkedList;

public class Palindrome_234_O1Space {
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        // find midpoint
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse 2nd half
        ListNode prev = null;
        while (slow != null){ //because slow would traverse to the end
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // check Palindrome
        ListNode left = head;
        ListNode right = prev;

        while (right != null){ // traverse from the right back to midpoint
            if (left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }


        return true;
    }
}
