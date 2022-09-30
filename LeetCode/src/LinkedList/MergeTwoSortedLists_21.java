package LinkedList;

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode list3 = new ListNode();
        ListNode pointer = list3;

        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            } else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

        if (list1 == null){
            pointer.next = list2;
        } else if (list2 == null) {
            pointer.next = list1;
        }
        return list3.next;
    }
}
