import java.util.LinkedList;

// Stack Interface
interface Stack<T> {
    void push(T element);
    T pop();
    boolean isEmpty();
    void display();
}

// Stack Implementation
class StackImpl<T> implements Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void display() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Queue Interface
interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    void display();
}

// Queue Implementation
class QueueImpl<T> implements Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T element) {
        list.addLast(element);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void display() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Main class to test Stack and Queue implementations
public class Main {
    public static void main(String[] args) {
        // Test Stack
        Stack<Integer> stack = new StackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.print("Stack: ");
        stack.display();  // Output: 30 20 10 
        stack.pop();
        System.out.print("Stack after pop: ");
        stack.display();  // Output: 20 10

        // Test Queue
        Queue<Integer> queue = new QueueImpl<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.print("Queue: ");
        queue.display();  // Output: 10 20 30
        queue.dequeue();
        System.out.print("Queue after dequeue: ");
        queue.display();  // Output: 20 30
    }
}
