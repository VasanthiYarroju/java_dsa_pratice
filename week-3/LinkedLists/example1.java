

public class example1 {
    static class node{
        int data;
        node next;
        node(int value){
            data=value;
            next=null;
        }

    }
    static node head;
    static void printList(){
        node temp=head;
        System.out.print("[");
        while(temp!=null){
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.print("]");
    }

    static void insertAtBeginning(int value){
        node newNode=new node(value);
        newNode.next=head;
        head=newNode;
    }
    static void insertAtEnd(int value){
        node newNode=new node(value);
        if(head==null){
            head=newNode;
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public static void main(String[] args) {
        head=null;
        insertAtBeginning(10);
        insertAtBeginning(20);
        insertAtBeginning(30);
        insertAtBeginning(40);
        insertAtEnd(50);
        insertAtEnd(60);
        insertAtEnd(70);
        insertAtEnd(80);
        insertAtEnd(90);
        insertAtEnd(100);
        printList();
    }
}
