package Queue;

public class SimpleQueue {

    private int queue[];
    int size;
    int front, back;

    SimpleQueue(int queueSize) {
        queue = new int[queueSize];
        size=queueSize;
        front = -1;
        back = -1;
    }

    public void enqueue(int num) {
        if (back == size -1 ) {
            System.out.println("Queue is full");
            return;
        } else {
            front = 0;
            back += 1;
            queue[back] = num;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        int frontELement = queue[front];
        if (front >= back) {
            front = -1;
            back = -1;
        } else {
            front += 1;
        }
        return frontELement;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public static void main(String[] args) {
    SimpleQueue queue = new SimpleQueue(5);
    queue.dequeue();
    queue.enqueue(100);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    System.out.println(queue.peek());
    }
}
