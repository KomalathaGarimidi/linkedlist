package linkedlist.com.data.linkedlist;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedListDemo s = new SinglyLinkedListDemo();
        s.head = s.new Node(10);
        SinglyLinkedListDemo.Node first= s.new Node(15);
        SinglyLinkedListDemo.Node second= s.new Node(20);
        SinglyLinkedListDemo.Node third= s.new Node(30);
        s.head.next=first;
        first.next=second;
        second.next=third;

//        System.out.println(s);
        s.traversal();
//        s.InsertAtBegining(5);
//        s.traversal();
//        s.InsertAtBegining(2);
//        s.traversal();
        s.InsertAtGivenPosition(3,100);
        s.traversal();
        s.InsertAtLast(65);
        s.traversal();
        System.out.println(s.SearchData(20));
        System.out.println(s.Length());
        System.out.println(s.reverseLinkedList().data);
        s.traversal();
    }
}
