package linkedlist.com.data.linkedlist;

public class SinglyLinkedListDemo {
    public  Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  void traversal(){
        //traversal through the linked list
        Node current= head;
        //check whether the current.next =null or not
        while(current!=null){

            //print the data of the current node
            System.out.print(current.data+"-->");
            //Move to the next
            current = current.next;
        }
        System.out.println("null");

    }

    public int InsertAtBegining(int data){
        Node newNode=new Node(data);
        if(head ==null){
            head =newNode;
            head.next=null;
        }
        else{
            newNode.next=head;
            head =newNode;
        }
        return head.data;
    }

    //Insert at given position
    public Node InsertAtGivenPosition(int position,int data){
        Node newNode=new Node(data);
        if(head==null){
            return null;
        }
        else{
            Node current=head;
            int count=1;
            while(count<position-1 && current.next!=null){
                current=current.next;
                count++;
            }
            newNode.next=current.next;
            current.next=newNode;
            return newNode;
        }
    }
    public Node InsertAtLast(int data){
        Node newNode = new Node(data);
        Node current=head;
        if(head==null){
            head=newNode;
        }

        else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        return newNode;
    }
    public boolean SearchData(int data){
        if(head.data==data){
            return true;
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data==data){
                    return true;
                }
                else{
                    current=current.next;
                }
            }
            return false;
        }
    }
   //find the length of the linked list
    public int Length(){
        int count=0;
        if(head==null){
            return 0;
        }
        else{
            Node current=head;

            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }
    }
    public Node reverseLinkedList(){
        Node current = head;
        Node temp=null;
        Node previous=null;
        if(head==null){
            return null;
        }
        else{
            while(current!=null){

                temp=current.next;
                current.next=previous;
                previous=current;
                current=temp;
            }
            head=previous;
        }
        return head;
    }
}
