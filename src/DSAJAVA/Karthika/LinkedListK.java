package DSAJAVA.Karthika;

public class LinkedListK {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    Node head;
    public void add(int data){
        Node newNode =new Node(data);
        if (head==null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    public void print(){
        Node currentNode=head;
        while (currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListK linkedListK=new LinkedListK();
        linkedListK.add(1);
        linkedListK.add(2);
        linkedListK.add(3);
        linkedListK.add(4);
        linkedListK.print();
    }
}
