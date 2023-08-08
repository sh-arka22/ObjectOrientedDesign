package IteratorForLinkedList;

public class ListNodeIterator {

    // write your code here
    private ListNode node;
    ListNodeIterator(ListNode node) {
        // write your code here
        this.node = node;
    }

    boolean hasNext() {
        // write your code here
        if(node != null) return true;
        return false;
    }

    ListNode next() {
        // write your code here
        ListNode current = node;
        node = node.next;
        return current;
    }

}
