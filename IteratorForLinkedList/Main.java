package IteratorForLinkedList;

public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        node1.next = node2;
        node2.next = node3;
        ListNodeIterator iterator = node1.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
