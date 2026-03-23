package module11;
class QueueArray {
    int max = 5;
    int[] queue = new int[max];
    int front = 0;
    int rear = -1;

    // Enqueue operation
    void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }

    // Dequeue operation
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + queue[front++]);
    }

    // Display queue
    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}

