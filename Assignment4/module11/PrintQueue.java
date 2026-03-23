package module11;
import java.util.LinkedList;
import java.util.Queue;

class PrinterQueue {
    Queue<String> queue = new LinkedList<>();

    // Add print job
    void addJob(String job) {
        queue.add(job);
        System.out.println(job + " added to queue.");
    }

    // Process print job
    void printJob() {
        if (queue.isEmpty()) {
            System.out.println("No jobs in queue.");
        } else {
            String job = queue.poll();
            System.out.println("Printing: " + job);
        }
    }

    // Display queue
    void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Pending Jobs: " + queue);
        }
    }

    public static void main(String[] args) {
        PrinterQueue pq = new PrinterQueue();

        pq.addJob("Document1");
        pq.addJob("Image.png");
        pq.addJob("Report.pdf");

        pq.displayQueue();

        pq.printJob();
        pq.printJob();

        pq.displayQueue();
    }
}

public class PrintQueue {
}
