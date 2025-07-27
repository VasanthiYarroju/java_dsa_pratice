public class MiddleofLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
      
        }

        return slow; 
    }

    public static ListNode insertEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) return newNode;

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = null;

        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);
        head = insertEnd(head, 50);

        System.out.print("Linked List: ");
        printList(head);

        ListNode middle = findMiddle(head);
        System.out.println("Middle element: " + (middle != null ? middle.val : "None"));
    }
}
