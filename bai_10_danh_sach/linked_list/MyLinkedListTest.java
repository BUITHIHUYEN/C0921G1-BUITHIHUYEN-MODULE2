package bai_10_danh_sach.linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        linkedList.addFirst(0);

        linkedList.addLast(50);

        linkedList.printList();
    }
    }
