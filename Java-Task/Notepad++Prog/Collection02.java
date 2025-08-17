import org.w3c.dom.Node;

public class Collection02 {
    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);


        first.next =second;
        second.next=third;

        printList(first);



    }

    static class Node{
        int data;
        Node next;

        Node(int value){
            data=value;
            next=null;
        }
    }

    public static void printList(Node first){
        Node current=first;
        while(current !=null){
            System.out.println(current.data);
            current=current.next;
        }

    }
}
