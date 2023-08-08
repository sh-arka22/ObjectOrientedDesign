package IteratorForLinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNodeIterator getIterator() {
        return new ListNodeIterator(this);
    }

    @Override
    public String toString() {
        return "" + this.val;
    }
}
