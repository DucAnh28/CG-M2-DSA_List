package TH2_SimpleLinkedList;

public class Test {
    public static void main(String[] args) {
        System.out.println("/=/=/=/ Testing /=/=/=/");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(1,9);
//        ll.add(4,9);
        ll.printList();
    }
}
