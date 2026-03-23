package module10;
public class LinkedListDelete {

    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end (for testing)
    void insertEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete node by value
    void delete(int value) {
        // Case 1: List is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 2: Value is at head
        if (head.data == value) {
            head = head.next;
            return;
        }

        // Case 3: Search for node
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        // If value found
        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Value not found");
        }
    }

    // Display list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListDelete list = new LinkedListDelete();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.display();

        list.delete(20);  // delete value

        list.display();
    }
}
