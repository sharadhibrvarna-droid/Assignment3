package module11;
class StackArray {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    // Push operation
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop operation
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Deleted: " + stack[top--]);
    }

    // Peek operation
    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    // Display stack
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
        s.display();

        s.peek();
    }
}
