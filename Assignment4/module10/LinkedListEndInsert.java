package module10;
class ListNode {
    int data;
    Node next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListEndInsert {
    Node head;
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
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LinkedListEndInsert list = new LinkedListEndInsert();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.display();
    }
}

