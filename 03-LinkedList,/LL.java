public class LL {

    Node head;

    private int size = 0;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        size++;

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // Print List
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    //delete in ll

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        size--;

        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node secondeLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondeLast = secondeLast.next;
        }

        size--;
        
        secondeLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("a");
        list.addFirst("is");

        list.addLast("Pravin");

        list.deleteFirst();
        list.deleteLast();

        list.printList();

        list.printList();
    }
}